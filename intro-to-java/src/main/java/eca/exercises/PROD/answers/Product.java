package eca.exercises.PROD.answers;

public class Product {

    /*
     Create a Product with 4 properties:
     - name
     - price
     - quantity
     - tax
     */
    private String name;
    private Double price;
    private Integer quantity;
    private Double tax;

    public Product(String name, Double price, Integer quantity, Double tax) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.tax = tax;
    }

    // Create getters for these properties

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getTax() {
        return tax;
    }
}
