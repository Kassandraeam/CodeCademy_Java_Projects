package Classes;


// public class Store {
//   // instance fields
//   String productType;
//   int inventoryCount;
//   double inventoryPrice;

//   // constructor method
//   public Store(String product, int count, double price) {
//     productType = product;
//     inventoryCount = count;
//     inventoryPrice = price;
//   }

//   // main method
//   public static void main(String[] args) {
//     Store lemonadeStand = new Store("lemonade", 42, .99);
//     Store cookieShop = new Store("cookies", 12, 3.75);

//     System.out.println(
//         "Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");

//     System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
//   }
// }

public class Store {
  
  // new method: constructor!
  public Store() {
    // ! Second to print
  System.out.println("I am inside the constructor method.");
  }
  
  // main method is where we create instances!
  public static void main(String[] args) {
    // ! First to print
    System.out.println("Start of the main method.");
    
    // create the instance below
    Store lemonadeStand = new Store();
    // this is invoking the constructor by creating a new instance.
    // print the instance below
    // ! Third to print
    System.out.println(lemonadeStand);
    
  }
}

/* 
Start of the main method
I am inside the constructor method.
Store@2aae9190

1. Running the program invokes main()
2. We create an instance so we move from main() to Store()
3. The code inside Store() runs
4. When Store() finishes execution, we return to main()

*/

