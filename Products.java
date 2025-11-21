import java.util.Scanner;

public class Products {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number of products: ");
    int quantity = Integer.parseInt(scan.nextLine());

    int stock = 0, sum = 0;
    String productName[] = new String[quantity];
    int productNumber[] = new int[quantity];

    for (int i = 0; i < quantity; i++) {
      System.out.print("Enter product " + (i+1) +" name: ");
      productName[i] = scan.nextLine();
      System.out.print("Enter product " + (i+1) +" stock: ");
      productNumber[i] = Integer.parseInt(scan.nextLine());
      sum += productNumber[i];
      if ( productNumber[i] > 0) stock++;
    }

    System.out.println("\nProducts and Quantities");
    for (int i = 0; i < quantity; i++) {
      System.out.println(productName[i] + " - " + productNumber[i]);
    }

    System.out.print("\nTotal: " + sum);
    System.out.printf("\nIn Stock: %d\nOut of Stock: %d", stock, (quantity - stock));
    scan.close();
  }
}
