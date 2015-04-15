import java.util.*;

public class ConversionProgram
{
  public static void main(String [] args)
  {
    double kilometers;
    double meters;
    double inches;
    double feet;
    
    int menuSelection;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Please insert the number of meters: ");
    meters = keyboard.nextDouble();
    
    menu();
    
    System.out.println("Please Choose a Selection: ")
    menuSelection = keyboard.nextInt();
    
    switch(menuSelection)
    {
    case 1:
      showKilometers(meters);
      break;
    
    case 2:
      showInches(meters);
      break;
    
    case 3:
      showFeet(meters);
      break;
    
    case 4:
      System.out.println("Goodbye!");
      break;
      
    default:
      System.out.println("Error, invalid selection.");
    }
  }
  
  public static void menu()
  {
    System.out.println("1: Convert to kilometers");
    System.out.println("2: Convert to inches");
    System.out.println("3: Convert to feet");
    System.out.println("4: Quit the program");
  }
  
  public static double showKilometers(double meters)
  {
    double kilometers;
    final double KILOM_CONSTANT = 0.001;
    kilometers = meters * KILOM_CONSTANT;
    return kilometers;
  }
  
  public static double showInches(double meters)
  {
    double inches;
    final double INCHES_CONSTANT = 39.37;
    feet = meters * INCHES_CONSTANT;
    return inches;
  }
  
  public static double showFeet(double meters)
  {
    double feet;
    final double FEET_CONSTANT = 3.281;
    feet = meters * FEET_CONSTANT;
    return feet;
  }
}
