package RestaurantManagementProject;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int OrderID;
    private String menuitems;
    private int quantities;
    private double totalbillamount;
    private LocalDate date;
    private String status;
    private String UserName;

   

   
    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public String getMenuitems() {
        return menuitems;
    }

    public void setMenuitems(String menuitems) {
        this.menuitems = menuitems;
    }

    public int getQuantities() {
        return quantities;
    }

    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }

    public double getTotalbillamount() {
        return totalbillamount;
    }

    public void setTotalbillamount(double totalbillamount) {
        this.totalbillamount = totalbillamount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order(String orderID, String menuitems, int quantities, double totalbillamount, LocalDate date,
            String status, String UserName) {
        OrderID = orderID;
        this.menuitemName = menuitems;
        this.quantities = quantities;
        this.totalbillamount = totalbillamount;
        this.date = date;
        this.status = status;
        this.UserName = UserName;
    }

    public static void displayOrderList(){
        System.out.println(orderDetails);
    }
    public static void main(String[] args) {
        GetFileData obj = new GetFileData();
        System.out.println(GetFileData.orderDetails.get(0));
        
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

}
