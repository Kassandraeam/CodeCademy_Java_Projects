package InstanceFields;

public class Store {
    // declare instance fields here!

    public Store() {
        System.out.println("I am inside the constructor method.");
    }

    // main method

    public static void main (String[] args) {
        System.out.println("This code is inside the main method.");

        Store lemonadeStand = new Store();

        System.out.println(lemonadeStand);
    }
}