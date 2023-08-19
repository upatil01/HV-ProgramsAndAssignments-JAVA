package RestaurantManagementProject;

public class MenuItem {
    private String MenuID;
    private String name;
    private double price;
    private String category;
    private String description;

    @Override
    public String toString() {
        return "MenuItem [MenuID=" + MenuID + ", name=" + name + ", price=" + price + ", category=" + category
                + ", description=" + description + "]";
    }

    public MenuItem(String menuID, String name, double price, String category, String description) {
        this.MenuID = menuID;
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    public String getMenuID() {
        return MenuID;
    }

    public void setMenuID(String menuID) {
        MenuID = menuID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}