package models;

public class Sneaker {
    int id;
    private String name;
    private String brand;
    private String sport;
    private float size;
    private int qty;
    private float price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
