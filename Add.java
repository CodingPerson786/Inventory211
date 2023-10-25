public class Add implements Runnable
{
    Inventory i;
    public Add(Inventory i)
    {
        this.i=i;
    }
    
    public synchronized void run()
    {
        i.setCounter(i.getCounter()+1);
        System.out.println("Added. Inventory size = "+ i.getCounter());
        

    }
}