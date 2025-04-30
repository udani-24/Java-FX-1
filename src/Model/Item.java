package Model;

public class Item {
    private String itemName;
    private int prize;
    private int quantity;

    public Item(String itemName, int prize, int quantity) {
        this.itemName = itemName;
        this.prize = prize;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrize() {
        return prize;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
