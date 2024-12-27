public class CreditCard extends BankCard 
{
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    public CreditCard(String cardId, String clientName, double issuerBank, 
                      String bankAccount, int balanceAmount, int cvcNumber, 
                      double interestRate, String expirationDate) {
        super(balanceAmount,cardId,bankAccount,issuerBank);
        setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }

    public int getCvcNumber() {
        return this.cvcNumber;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public int getGracePeriod() {
        return this.gracePeriod;
    }

    public boolean isGranted() {
        return this.isGranted;
    }

    public void setCreditLimit(int newCreditLimit, int newGracePeriod) {
        if (newCreditLimit <= 2.5 * super.getBalanceAmount())
        {
            this.creditLimit = newCreditLimit;
            this.gracePeriod = newGracePeriod;
            this.isGranted = true;
            System.out.println("Credit Granted");
        } else {
            System.out.println("Credit cannot be issued");
        }
    }

    public void cancelCreditCard() {
        if (isGranted) {
            this.cvcNumber = 0;
            this.creditLimit = 0;
            this.gracePeriod = 0;
            this.isGranted = false;
            System.out.println("Credit card cancelled successfully!");
        }
    }
}
