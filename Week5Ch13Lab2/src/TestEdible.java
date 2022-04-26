/** 
 * Description: Modify the TestEdible.java and add class Chickenextends Animal implements Edible, Feed 
 * Created by: Jacob Osbourne
 * Date: 2/27/2022
 * Version:1.0
 */



public class TestEdible {
  public static void main(String[] args) {
    Object[] objects = {new Tiger(), new Chicken(), new Apple()};
    for (int i = 0; i < objects.length; i++) {
      if (objects[i] instanceof Edible)
        System.out.println(((Edible)objects[i]).howToEat());

      if (objects[i] instanceof Animal) {
        System.out.println(((Animal)objects[i]).sound());
      }
      if (objects[i] instanceof Feed) {
        System.out.println(((Feed) objects[i]).howToFeed());
      }
    }
  }
}

abstract class Animal {
  private double weight;
  
  public double getWeight() {
    return weight;
  }
  
  public void setWeight(double weight) {
    this.weight = weight;
  }
  
  /** Return animal sound */
  public abstract String sound();
}

class Chicken extends Animal implements Edible, Feed {
  @Override
  public String howToEat() {
    return "Chicken: Fry it";
  }
    
  @Override
  public String sound() {
    return "Chicken: cock-a-doodle-doo";
  }
  
  @Override
  public String howToFeed() {
      return "Seeds";
  }
}

class Tiger extends Animal {
  @Override
  public String sound() {
    return "Tiger: RROOAARR";
  }
}

abstract class Fruit implements Edible {
  // Data fields, constructors, and methods omitted here
}

class Apple extends Fruit {
  @Override
  public String howToEat() {
    return "Apple: Make apple cider";
  }
}

class Orange extends Fruit {
  @Override
  public String howToEat() {
    return "Orange: Make orange juice";
  }
}
