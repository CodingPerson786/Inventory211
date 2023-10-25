public class InventoryMain extends Thread
{
    public static int inventorySize;

    public static int addAmount,removeAmount;





    public static void main (String[] args)
    { 
    
        addAmount=Integer.parseInt(args[0]);
        removeAmount =Integer.parseInt(args[1]);

        Inventory inv= new Inventory();

        Remove r= new Remove(inv);
        Add a = new Add(inv);
        int am=addAmount+removeAmount;

        Thread[] threads= new Thread[am];
        for(int i=0;i<addAmount;i++)
        {
            threads[i]= new Thread(a);
            
        }
        for(int i=addAmount;i<am;i++)
        {
            threads[i]= new Thread(r);
        }
        
        for(int i=0;i<am;i++)
        {
            threads[i].start();
        }

        for(int i=0;i<am;i++)
        {
            try{
                threads[i].join();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        System.out.println("Final inventory size = "+ inv.getCounter());
    }

    
}



