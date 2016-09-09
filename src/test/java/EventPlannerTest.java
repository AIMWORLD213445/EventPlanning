import org.junit.*;
import static org.junit.Assert.*;

public class EventPlannerTest {

  @Test
  public void newEventPlanner_instantiatesCorrectly(){
    EventPlanner testEventPlanner = new EventPlanner(20, "Chicken Dinner", "Open Bar", "Jazz Band");
    assertEquals(true, testEventPlanner instanceof EventPlanner);
  }
  @Test
  public void newEventPlanner_getsFood(){
    EventPlanner testEventPlanner = new EventPlanner(20, "Chicken Dinner", "Open Bar", "Jazz Band");
    assertEquals("Chicken Dinner", testEventPlanner.getFood());
  }
  @Test
  public void newEventPlanner_getsBeverages(){
    EventPlanner testEventPlanner = new EventPlanner(20,"Chicken Dinner","Open Bar", "Jazz Band");
    assertEquals("Open Bar", testEventPlanner.getBeverages());
  }
  @Test
  public void calculateBill_returnBillForAnyService_500(){
    EventPlanner testEventPlanner = new EventPlanner(20,"Chicken Dinner","Open Bar", "Jazz Band");
    Integer expected = 500;
    assertEquals(expected, testEventPlanner.calculateBill());
  }

}
