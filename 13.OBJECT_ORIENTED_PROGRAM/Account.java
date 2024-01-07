package ObjectOrientedProgram;

public class Account
{
    private int custId;
    private String name;
    private double balance;
    public Account(int custId,String name,double balance)
    {
        this.custId=custId;
        this.name=name;
        this.balance=balance;
    }
    public void showAccount()
    {
        System.out.println("CustId is : "+custId);
        System.out.println("Name is : "+name);
        System.out.println("Balance is : "+balance);
    }

}
