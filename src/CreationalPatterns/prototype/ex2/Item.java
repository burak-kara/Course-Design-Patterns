package CreationalPatterns.prototype.ex2;

//Prototype
public class Item {
    private String title;
    private double price;

    public Item clone() {
        Item clonedItem = new Item();
        clonedItem.setPrice(price);
        clonedItem.setTitle(title);
        return clonedItem;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}