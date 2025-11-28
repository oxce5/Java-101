import java.util.Scanner;

public class Products {
  static Scanner scan = new Scanner(System.in);
  static int stock = 0, sum = 0;

  public static String[] ProductManager(int quantity) {
    String[] products = new String[quantity];
    for (int i = 0; i < quantity; i++) {
      System.out.print("Enter product " + (i+1) +" name: ");
      String productName = scan.nextLine();
      System.out.print("Enter " + productName +" stock: ");
      int productQuantity =  Integer.parseInt(scan.nextLine());
      sum += productQuantity;
      if ( productQuantity > 0) stock++;
      products[i] = String.format("%s - %d", productName, productQuantity);
    }
    return products;
  };

  public static void FetchProducts(String[] products) {
    System.out.println("\nProducts and Quantities");
    for (String product : products) {
      System.out.println(product);
    }

    System.out.print("\nTotal: " + sum);
    System.out.printf("\nIn Stock: %d\nOut of Stock: %d", stock, (products.length - stock));
  }

  public static void main(String[] args) {
    System.out.print("Enter number of products: ");
    int quantity = Integer.parseInt(scan.nextLine());
    String[] products = ProductManager(quantity);
    FetchProducts(products);
    scan.close();
  }
}
