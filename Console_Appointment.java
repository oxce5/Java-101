import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Console_Appointment {
  static Scanner scan = new Scanner(System.in);
  public static int UI() {
    System.out.println("APPOINTMENTS");
    System.out.println("( 1 ) Show Appointment/s");
    System.out.println("( 2 ) Make Appointment/s");
    System.out.println("( 3 ) Exit");
    int choice = scan.nextInt();
    return choice;
  }

  public static void main(String[] args) {
    List<Appointment> appointments = new ArrayList<>(); 
    switch(UI()) {

    }
  } 
}

