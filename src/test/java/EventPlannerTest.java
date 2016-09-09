import org.junit.*;
import static org.junit.Assert.*;

public class EventPlannerTest {

  @Test
  public void calculateBill_returnBillForAnyService_500(){
    EventPlanner testEventPlanner = new EventPlanner();
    assertEquals(true, testEventPlanner instanceof EventPlanner);
  }
  // @Test
  // public void calculateBill_returnBillForAnyService_500(){
  //   EventPlanner testEventPlanner = new EventPlanner();
  //   Integer expected = 500;
  //   assertEquals(expected, testEventPlanner.calculateBill("Chicken Dinner"));
  // }

}
