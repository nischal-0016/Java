
  public class DebitCard extends BankCard
{
    //Attributes
    private int pinNumber;
    //private int cardId;
    private double withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    //Contructor
    public DebitCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber)
    {
        super(cardId,issuerBank,bankAccount,balanceAmount);
        super.setClientName(clientName);
        super.setBalanceAmount(balanceAmount);
        this.pinNumber=pinNumber;
        this.hasWithdrawn=false;
    }
    //Accessor
    public int getPinNumber()
    {
        return this.pinNumber;
    }
    public double getWithdrawalAmount()
    {
        return this.withdrawalAmount;
    }
    public String getDateOfWithdrawal()
    {
        return this.dateOfWithdrawal;
    }
    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    //Settor 
    public void setWithdrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount=withdrawalAmount;
    }
    //Withdraw 
    public void Withdraw(double withdrawalAmount,String dateOfWithdrawal,int pinNumber)
    {
        if(pinNumber==this.pinNumber && super.getBalanceAmount()>=withdrawalAmount)
        {
            this.withdrawalAmount=withdrawalAmount;
            this.dateOfWithdrawal=dateOfWithdrawal;
            super.setBalanceAmount(getBalanceAmount()-this.withdrawalAmount); 
            this.hasWithdrawn=true;
        }
        else
        {
            System.out.println("Invalid PIN number or Insufficient Number");
        }
    }
    //Override
    public void Display()
    {
        if(hasWithdrawn)
        {
        super.display();
        System.out.println("PIN Number: "+this.pinNumber);
        System.out.println("Withdrawal Amount: "+this.withdrawalAmount);
        System.out.println("Date of Withdrawal: "+this.dateOfWithdrawal);
        }
        //else
        //{
            //System.out.println("Balance Amount: "+super.getBalanceAmount());
        //}
    }
    public static void main(String[] args)
    {
        DebitCard object=new DebitCard(990000,7687,"NMINC564","Kumari Bank Limited","Shiva Sharma",123778);
        object.Withdraw(76675.00,"view",00667);
        object.display();
        object.Display();
    }
}
