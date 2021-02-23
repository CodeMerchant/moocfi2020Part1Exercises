/*
Create a class named Product that represents a store product. 
The product should have a price(double), a quantity(int) and a name(String).

The class should have :
1. A constuctor Product(String initialName, double initialPrice, int initialQuantity)
2. A method public void printProduct() that prints product information in following format:
Banana, price 1.1, 13 pcs
 */
public class Product {

    //instance variables
    private String name;
    private double price;
    private int quantity;

    //creating product constructor
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    //creating method
    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
}
