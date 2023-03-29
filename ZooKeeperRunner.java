/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    Tiger tiger = new Tiger();
    tiger.swim();
    tiger.huntAlone();

    System.out.println();
    tiger.isNocturnal();
    tiger.eat();
    tiger.getLifeSpan();

    Elephant elephantArgs = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println();
    elephantArgs.trumpet();

    elephantArgs.eat();
    elephantArgs.getLifeSpan();

    // 4.9.6
    Animal a = new Elephant("leaves, grasses, roots", false, 50.0);
    System.out.println(); 
    a.isNocturnal();
    
    /* Not allowed; Animal does not have a trumpet method, even though elephant is. Not all animals are elephants.
    a.trumpet();
    */
    System.out.println(elephantArgs.toString());
  }
}