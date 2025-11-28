import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class File_Handler {
  public static void fileWrite(String filename, String content) {
    try (PrintWriter file = new PrintWriter(new FileWriter(filename, true))) {
      new FileWriter(filename).close();
      for (int i = 0; i < 10; i++) {
        file.printf("%s %d%n", content, i);
      }
      file.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static String fileRead(String filename) {
    StringBuilder strBuild = new StringBuilder();
    try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
    String line;
    while ((line = file.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    return strBuild.toString();
  }
  public static void main(String[] args) {
    if (args[0].equalsIgnoreCase("write")) {
      fileWrite(args[1], args[2]);
    } else if (args[0].equalsIgnoreCase("read")) {
      fileRead(args[1]);
    } else {
      System.out.println("Invalid method.");
    }
  }
}
