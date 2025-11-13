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
    System.out.print("Choice: ");
    int choice = scan.nextInt();
    return choice;
  }

  public static void main(String[] args) {
    List<Appointment> appointments = new ArrayList<>(); 
    while (true) {
      switch(UI()) {
        case 1:
          if (appointments.isEmpty()) {
            System.out.println("Appointments empty.");
            continue;
          }
          for (Appointment appointment : appointments) {
            System.out.println(appointments);
          }
          break;
        case 2:
          System.out.print("Enter appointment date:\n-> ");
          String date = scan.next();
          System.out.print("Enter appointment time:\n-> ");
          String time = scan.next();
          System.out.print("Enter appointment purpose:\n-> ");
          String purpose = scan.next();
          appointments.add(Appointment.makeAppointment(appointments.size() + 1, date, time, purpose, 1));
          System.out.print("Appointment made.");
          break;
        case 3:
          System.out.println("Exiting program...");
          System.exit(0);
          break;
        default:
          System.out.println("Invalid input");
          continue;
      }
    }
  } 
}

