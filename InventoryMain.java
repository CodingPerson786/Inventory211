public class InventoryMain implements runnable
{
    private int inventorySize=0;
    
    public getInventorySize()
    {
        return inventorySize;
    }

    public int incrementInventory()
    {
        return inventorySize++;
    }
    public int decrementInventory()
    {
        return inventorySize--;
    }
    public void add()
    {
        incrementInventory();
        System.out.println("Added. Inventory size = "+ getInventorySize());

    }
    public void remove()
    {
        decrementInventory();

    }

    public static void main (String[] args)
    {
        int addAmount=Integer.parseInt(args[0]);
        int removeAmount=Integer.parseInt(args[1]);
        Thread t= new Thread();
        //System.out.println("Added. Inventory size = "+ getInventorySize());
        for(int i=0;i<addAmount;i++)
        {
           // Add a =new Add();
            //setInventorySize()=a.addition(getInventorySize());
            //a.start();
            //System.out.println("Added. Inventory size = "+ getInventorySize());
        }
        for(int i=0;i<removeAmount;i++)
        {
            //Remove r=new Remove();
            //setInventorySize()=r.subtraction(getInventorySize());
           // r.start();
            System.out.println("Removed. Inventory size = "+ getInventorySize());
        }

        System.out.println("Final inventory size = "+ getInventorySize());
    }
    
}



