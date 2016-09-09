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

  public Integer calculateBill() {
    Integer price = 0;

    if(mFood.equals("Chicken Dinner")) {
      price = 15 * mGuestNumber;
    } else if (mFood.equals("Fish Dinner")) {
      price = 17 * mGuestNumber;
    } else if(mFood.equals("Appetizers")) {
      price = 8 * mGuestNumber;
    } else{
      price = price;
    }

    if(mBeverages.equals("Open Bar")) {
      price += 20 * mGuestNumber;
    } else if (mBeverages.equals("Coffee and Tea")) {
      price += 7 * mGuestNumber;
    } else {
      price = price;
    }

    if(mEntertainment.equals("Jazz Band")) {
      price += 1000;
    } else if (mEntertainment.equals("Karaoke")) {
      price += 500;
    } else {
      price = price;
    }

    return price;
    }
  }
