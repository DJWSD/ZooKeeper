/*
 * Activity 4.9.2
 */
public class Elephant extends Animal
{
    public Elephant()
    {
        
    }

    public Elephant(String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
    }

    public void trumpet()
    {
        System.out.println("The elephant trumpets.");
    }
}
