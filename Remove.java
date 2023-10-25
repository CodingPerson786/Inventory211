public class Remove implements Runnable
{
    Inventory i;
    public Remove(Inventory i)
    {
        this.i=i;
    }
    
    public synchronized void run()
    {
        i.setCounter(i.getCounter()-1);
        System.out.println("Removed. Inventory size = "+ i.getCounter());
        

    }
}