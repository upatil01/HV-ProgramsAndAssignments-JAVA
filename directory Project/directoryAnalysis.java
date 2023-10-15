import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class TextFileAnalyzer {
    private static final String FILE_EXTENSION = ".txt";
    private static final String LOG_FILE = "error.log";
    private static final String CONFIG_FILE = "config.properties";

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java TextFileAnalyzer <directory_path>");
            System.exit(1);
        }

        String directoryPath = args[0];

        try {
            Properties config = loadConfig(CONFIG_FILE);
            List<String> validKeywords = Arrays.asList(config.getProperty("validKeywords").split(","));

            List<File> textFiles = listTextFiles(directoryPath);
            long totalSize = calculateTotalSize(textFiles);

            List<String> allWords = extractWords(textFiles);
            Map<String, Integer> wordFrequency = countWordFrequency(allWords);

            logInfo("Total size of .txt files: " + totalSize + " bytes");

            List<String> validWords = allWords.stream()
                    .filter(validKeywords::contains)
                    .collect(Collectors.toList());

            logInfo("Valid keywords found: " + validWords);

            Map<String, Integer> keywordFrequency = countWordFrequency(validWords);
            logInfo("Top 10 most frequent keywords: ");
            keywordFrequency.entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .limit(10)
                    .forEach(entry -> logInfo(entry.getKey() + ": " + entry.getValue()));

        } catch (IOException e) {
            logError("Error processing directory: " + e.getMessage());
        }
    }

    private static List<File> listTextFiles(String directoryPath) throws IOException {
        List<File> textFiles = new ArrayList<>();
        Files.walk(Paths.get(directoryPath))
                .filter(Files::isRegularFile)
                .filter(path -> path.toString().endsWith(FILE_EXTENSION))
                .forEach(path -> textFiles.add(path.toFile()));
        return textFiles;
    }

    private static long calculateTotalSize(List<File> textFiles) {
        return textFiles.stream()
                .mapToLong(File::length)
                .sum();
    }

    private static List<String> extractWords(List<File> textFiles) {
        List<String> words = new ArrayList<>();
        for (File file : textFiles) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] lineWords = line.split("\\s+");
                    words.addAll(Arrays.asList(lineWords));
                }
            } catch (IOException e) {
                logError("Error reading file: " + file.getName());
            }
        }
        return words;
    }

    private static Map<String, Integer> countWordFrequency(List<String> words) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            wordFrequency.put(lowerWord, wordFrequency.getOrDefault(lowerWord, 0) + 1);
        }
        return wordFrequency;
    }

    private static Properties loadConfig(String configPath) throws IOException {
        Properties config = new Properties();
        try (FileInputStream input = new FileInputStream(configPath)) {
            config.load(input);
        }
        return config;
    }

    private static void logInfo(String message) {
        System.out.println(message);
    }

    private static void logError(String message) {
        System.err.println(message);
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.println(new Date() + ": " + message);
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }
}