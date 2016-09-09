public class EventPlanner {
  private int mGuestNumber;
  private String mFood;
  private String mBeverages;
  private String mEntertainment;


  public EventPlanner( int guestNumber, String food, String beverages, String entertainment) {
    mGuestNumber = guestNumber;
    mFood = food;
    mBeverages = beverages;
    mEntertainment = entertainment;
  }

  public int getGuestNumber() {
    return mGuestNumber;
  }
  public String getFood() {
    return mFood;
  }
  public String getBeverages() {
    return mBeverages;
  }
  public String getEntertainment() {
    return mEntertainment;
  }

  public Integer calculateBill(){
    Integer price = 0;

    if(mFood.equals("Chicken Dinner")){
      price = 500;
    } else {
      price = price;
    }
    return price;


    // else if(mFood.equals("Fish Dinner")){
    //   mPrice = ((mGuestNumber/10)*15);
    // }else if(mFood.equals("Steak Dinner")){
    //   mPrice = ((mGuestNumber/10)*20);
    // }else if(mFood.equals("Fish Dinner")){
    //   mPrice = ((mGuestNumber/10)*15);
    // }
  }
}
