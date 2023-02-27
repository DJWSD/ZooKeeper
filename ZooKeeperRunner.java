/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    Elephant elephant = new Elephant();
    elephant.trumpet();

    Tiger tiger = new Tiger();
    tiger.swim();
    tiger.huntAlone();

    tiger.isNocturnal();
    tiger.eat();
    tiger.getLifeSpan();

    Elephant elephantArgs = new Elephant("leaves, grasses, roots", false, 60.0);
    elephantArgs.trumpet();

    elephantArgs.eat();
    elephantArgs.getLifeSpan();

  }
}