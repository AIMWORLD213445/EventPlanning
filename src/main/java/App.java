import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console c = System.console();
    System.out.println("How many people are expected at your party?");
    String stringGuestNumber = c.readLine();
    int intGuestNumber = Integer.parseInt(stringGuestNumber);
    System.out.println("What kind of food do you want at your Party? Enter either 'Chicken Dinner', 'Fish Dinner', 'Appetizers' or 'None'");
    String stringFood = c.readLine();
    System.out.println("What kind of beverages do you want at your party? Enter either 'Open Bar', 'Coffee and Tea', or 'None'");
    String stringBeverages = c.readLine();
    System.out.println("What kind of entertainment do you want at your Party? Enter either 'Jazz Band', 'Karaoke', or 'None'");
    String stringEntertainment = c.readLine();
    EventPlanner userEvent = new EventPlanner(intGuestNumber, stringFood, stringBeverages, stringEntertainment);
    Integer partyCost = userEvent.calculateBill();
    System.out.println("You want" + stringFood + "as well as" + stringBeverages + "and" + stringEntertainment + "for" + intGuestNumber + "people. Your total price will be $ " + partyCost + ".");
  }
}
