package eca.exercises.PROD.answers;

import java.util.Arrays;
import java.util.List;

public class InvoicePrinter {

    public static void printInvoice(List<Product> products) {

        // Create 2 variables to accumulate the total price while looping through all the products
        Double totalWithoutTax = 0.0; // The tax-exclusive total
        Double totalTax = 0.0; // The total tax from all products


        /*
         For each product in products, tell the user:
         - The name
         - The quantity
         - The price, with and without tax, based on the quantity of the product
         */
        for (Product product : products) {
            // Calculate the tax amount from the price and tax percentage
            Double taxAmount = product.getPrice() * (product.getTax() / 100);
            // Calculate the tax-inclusive price
            Double itemWithTax = product.getPrice() + taxAmount;
            // Multiply the tax inclusive price by the quantity, which is the total price for this product
            Double priceForQuantity = itemWithTax * product.getQuantity();

            // Add to the totals
            totalWithoutTax = totalWithoutTax + (product.getPrice() * product.getQuantity());
            totalTax = totalTax + (taxAmount * product.getQuantity());

            // Print the total of the products with and without tax
            System.out.println(product.getName() + " | price: " + product.getPrice() + " | with tax: " + itemWithTax + " | for " + product.getQuantity() + ": " + priceForQuantity);
        }


        // Print the total of the products with and without tax
        System.out.println("Total: " + totalWithoutTax);
        System.out.println("Total with tax: " + (totalWithoutTax + totalTax));
    }

    public static void main(String[] args) {
        List<Product> myBasket = Arrays.asList(
                new Product("Hotel Breakfast", 15.0, 1, 15.0),
                new Product("Wine", 8.0, 2, 25.0),
                new Product("Room Service", 10.0, 1, 10.0),
                new Product("Coffee", 4.0, 2, 15.0),
                new Product("Pastries", 2.50, 5, 15.0)
        );

        printInvoice(myBasket);
    }
}
