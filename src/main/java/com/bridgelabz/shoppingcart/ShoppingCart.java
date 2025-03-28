package com.bridgelabz.shoppingcart;

import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices;
    private LinkedHashMap<String, Integer> cart;

    public ShoppingCart() {
        productPrices = new HashMap<>();
        cart = new LinkedHashMap<>();
    }

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    public void addToCart(String product, int quantity) {
        if (!productPrices.containsKey(product)) {
            System.out.println("Product not available.");
            return;
        }
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    public void displayCart() {
        System.out.println("Cart (in order of adding):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " -> Quantity: " + entry.getValue() + ", Price: " + productPrices.get(entry.getKey()));
        }
    }

    public void displayProductsSortedByPrice() {
        TreeMap<Double, String> sortedProducts = new TreeMap<>();
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            sortedProducts.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Products sorted by price:");
        for (Map.Entry<Double, String> entry : sortedProducts.entrySet()) {
            System.out.println(entry.getValue() + " -> Price: " + entry.getKey());
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        // Adding products
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.8);
        cart.addProduct("Orange", 1.2);
        cart.addProduct("Grapes", 2.5);

        // Adding items to cart
        cart.addToCart("Apple", 3);
        cart.addToCart("Banana", 2);
        cart.addToCart("Orange", 1);
        cart.addToCart("Grapes", 4);

        System.out.println();
        cart.displayCart();

        System.out.println();
        cart.displayProductsSortedByPrice();

        scanner.close();
    }
}
/*Cart (in order of adding):
Apple -> Quantity: 3, Price: 1.5
Banana -> Quantity: 2, Price: 0.8
Orange -> Quantity: 1, Price: 1.2
Grapes -> Quantity: 4, Price: 2.5

Products sorted by price:
Banana -> Price: 0.8
Orange -> Price: 1.2
Apple -> Price: 1.5
Grapes -> Price: 2.5

 */