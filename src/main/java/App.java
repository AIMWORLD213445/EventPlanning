import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console c = System.console();
    System.out.println("How many people are expected at your party?");
    String stringGuestNumber = c.readLine();
    int intGuestNumber = Integer.parseInt(stringGuestNumber);
    System.out.println("What kind of food do you want at your Party? Enter either 'A Chicken Dinner', 'A Fish Dinner', 'Appetizers' or 'No Food'");
    String stringFood = c.readLine();
    System.out.println("What kind of beverages do you want at your party? Enter either 'An Open Bar', 'Coffee and Tea', or 'No Drinks'");
    String stringBeverages = c.readLine();
    System.out.println("What kind of entertainment do you want at your Party? Enter either 'A Jazz Band', 'Karaoke', or 'No Entertainment'");
    String stringEntertainment = c.readLine();
    EventPlanner userEvent = new EventPlanner(intGuestNumber, stringFood, stringBeverages, stringEntertainment);
    Integer partyCost = userEvent.calculateBill();
    String userInfo = String.format("You have requested %s as well as %s and %s for %d people. Your total price will be $%d.", stringFood, stringBeverages, stringEntertainment, intGuestNumber, partyCost);
    System.out.println(userInfo);
  }
}
