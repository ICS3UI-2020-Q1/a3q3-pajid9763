import java.util.Scanner;
/**
 * program to calculate percentage range of grade
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask user for letter grade 
  System.out.println("Please enter a letter grade");
  String letterGrade = input.nextLine();
  
  switch (letterGrade) {
    case "A":
      System.out.println("This is between 80% and 100%");
      break;
    case "B":
      System.out.println("This is between 70% and 79%");
      break;
    case "C":
      System.out.println("This is between 60% and 69%");
      break;
    case "D":
      System.out.println("This is between 50% and 59%");
      break;
    default:
      System.out.println("This is between 0% and 49%");
      break;
  }
  }
}
