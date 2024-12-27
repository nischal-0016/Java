public class BankCard
{
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;
    
    public BankCard(int cardId, String issuerBank, String bankAccount, double balanceAmount)
    {
        this.clientName = "";
        this.cardId = cardId;
        this.balanceAmount = balanceAmount;
        this.issuerBank= issuerBank;
        this.bankAccount = bankAccount;
    }
    
    protected void setClientName(String clientName)
    {
        this.clientName = clientName;
    }
    
    protected int getCardId(){
        return this.cardId;
    }
    protected String getClientName(){
        return this.clientName;
    }
    protected String getIssuerBank(){
        return this.issuerBank;
    }
    protected String getBankAccount(){
        return this.bankAccount;
    }
    protected double getBalanceAmount(){
        return this.balanceAmount;
    }
    protected void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount=balanceAmount;
    }
    
    protected void display()
    {
        if (this.clientName=="")
        {
            System.out.println("Name not assigned.");
        }
        else
        {
            System.out.println("Issuer Bank:"+this.issuerBank);
            System.out.println("Bank Account:"+this.bankAccount);
            System.out.println("Balance Amount:"+this.balanceAmount);

        }
    }
}
