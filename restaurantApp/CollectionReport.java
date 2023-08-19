package RestaurantManagementProject;

import java.time.LocalDate;

class CollectionReport {
    LocalDate date;
    double totalRevenueOfTheDay;
    // private String MenuID;
    // private LocalDate date;
    // // private int totalQuantities;
    // private double totalRevenueOfTheDay;

    public CollectionReport( LocalDate date , double totalRevenueOfTheDay) {
        this.LocalDate = date;
        this.totalRevenueOfTheDay = totalRevenueOfTheDay;        
    }
    public void display() {
        System.out.println( " Date : " + date + " | Total Revenue Generated : " + totalRevenueOfTheDay);
    }

// public String MenuID(){
//     return MenuID;
// }    
public LocalDate getDate() {
    return date;
}
// public int gettotalQuantities(){
//     return totalQuantities;
// }
public double gettotalRevenueOfTheDay() {
    return totalRevenueOfTheDay;
    
}
}
class CollectionReport extends CollectionReport{
    private String MenuID;

    public order( int quantities , int price , String MenuID) {
        super(quantities , price);
        this.MenuID = MenuID;
    }
    public String getMenuID() {
        return MenuID;
    }
    
    @Override
    public void display() {
        System.out.println(" MenuID : " + super.getMenuID() + " | Quantities : " + super.getQuantities());

    }
    try{
        BufferedReader br = new BufferedReader(new FileReader("order.csv"));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        } br.close();
    }catch(Exception e){
        e.printStackTrace();
    }    

}

