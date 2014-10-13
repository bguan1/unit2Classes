public class VendingMachine
{
    private int tokens;
    private int cans;
    
    
    public void vendingMachine(int machineCans)
    {
        cans = machineCans;
    }
    
    public void insertToken()
    {
        if (this.cans <= 0)
        {
            System.out.println("Insufficient number of cans");
        }
        else
        {
            tokens += 1;
            cans -= 1;
        }
    }
    
    public void fillUp(int fill)
    {
        cans += fill;
        System.out.println("Cans added to machine");
    }
}
    
    
   