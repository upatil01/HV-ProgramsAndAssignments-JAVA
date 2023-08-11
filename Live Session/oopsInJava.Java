public class oopsInJava {
   
    
    class cal {

        public int add(int num1, int num2) {
            return num1 + num2;
        }
    
        public int subtract(int num1, int num2) {
            return num1 - num2;
        }
    }
    
    class volume {
        public String shape = "cuboid";
        
        public int size = 1;
        public int cuboid(int num1, int num2, int num3) {
            return num1 * num2 * num3;
        }
        public String getShape() {
            return shape;
        }
        public void setShape(String shape) {
            this.shape = shape;
        }
        public int getSize() {
            return size;
        }
        public void setSize(int size) {
            this.size = size;
        }
    
        
    }

    class area {
        
    }
    
    public class calculator {
        public static void main(String[] args) {
            // Creating an object of the SimpleCalculator class
            cal cal1 = new.cal1();
            volume vol = new volume();
    
            int resultAdd = cal1.add(5, 3);
            System.out.println("Addition result: " + resultAdd);
    
            int resultSubtract = cal1.subtract(10, 3);
            System.out.println("Subtraction result: " + resultSubtract);
            System.out.println("volumre of cuboid= " + vol.cuboid(12, 23, 23));
            System.out.println(vol.getShape());
            vol.getSize();
        }
    }
    



}public class oopsInJava {
   
    
    class cal {

        public int add(int num1, int num2) {
            return num1 + num2;
        }
    
        public int subtract(int num1, int num2) {
            return num1 - num2;
        }
    }
    
    class volume {
        public String shape = "cuboid";
        
        public int size = 1;
        public int cuboid(int num1, int num2, int num3) {
            return num1 * num2 * num3;
        }
        public String getShape() {
            return shape;
        }
        public void setShape(String shape) {
            this.shape = shape;
        }
        public int getSize() {
            return size;
        }
        public void setSize(int size) {
            this.size = size;
        }
    
        
    }

    class area {
        
    }
    
    public class calculator {
        public static void main(String[] args) {
            // Creating an object of the SimpleCalculator class
            cal cal1 = new.cal1();
            volume vol = new volume();
    
            int resultAdd = cal1.add(5, 3);
            System.out.println("Addition result: " + resultAdd);
    
            int resultSubtract = cal1.subtract(10, 3);
            System.out.println("Subtraction result: " + resultSubtract);
            System.out.println("volumre of cuboid= " + vol.cuboid(12, 23, 23));
            System.out.println(vol.getShape());
            vol.getSize();
        }
    }
    



}