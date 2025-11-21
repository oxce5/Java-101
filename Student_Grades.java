import java.util.Scanner;

public class Student_Grades {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number of students: ");
    double grades[] = new double[scan.nextInt()];
    double sum = 0.00;
    int pass = 0, fail = 0;
    for (int i = 0; i < grades.length; i++) {
      System.out.print("Enter student " + (i+1) + " grade: ");
      double grade = scan.nextDouble();
      grades[i] = grade;
      sum += grade;
      if (grade < 75) {
        fail++;
        continue;
      } 
      pass++;
    }
    System.out.print("\nGrades entered: ");
    for (double d : grades) {
      System.out.printf("%,.2f ", d);
    }
    System.out.print("\nAverage: " + (sum / grades.length));
    System.out.printf("\nPassed: %d\nFailed: %d", pass, fail);
    scan.close();
  }
}
