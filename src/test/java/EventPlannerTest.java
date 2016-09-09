import org.junit.*;
import static org.junit.Assert.*;

public class EventPlannerTest {

  @Test
  public void newEventPlanner_instantiatesCorrectly(){
    EventPlanner testEventPlanner = new EventPlanner(20, "A Chicken Dinner", "An Open Bar", "A Jazz Band");
    assertEquals(true, testEventPlanner instanceof EventPlanner);
  }
  @Test
  public void newEventPlanner_getsFood(){
    EventPlanner testEventPlanner = new EventPlanner(20, "A Chicken Dinner", "An Open Bar", "A Jazz Band");
    assertEquals("A Chicken Dinner", testEventPlanner.getFood());
  }
  @Test
  public void newEventPlanner_getsBeverages(){
    EventPlanner testEventPlanner = new EventPlanner(20,"A Chicken Dinner","An Open Bar", "A Jazz Band");
    assertEquals("An Open Bar", testEventPlanner.getBeverages());
  }
  @Test
  public void calculateBill_returnBillForSingleService_300(){
    EventPlanner testEventPlanner = new EventPlanner(20,"A Chicken Dinner","Just Water", "No Band");
    Integer expected = 300;
    assertEquals(expected, testEventPlanner.calculateBill());
  }
  @Test
  public void calculateBill_returnBillForMultipleServices_1040(){
    EventPlanner testEventPlanner = new EventPlanner(20, "Appetizers", "Coffee and Tea", "Karaoke");
    Integer expected = 800;
    assertEquals(expected, testEventPlanner.calculateBill());
  }
}
