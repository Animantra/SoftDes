
public abstract class Payment{
    protected iCurrency currency;

    public Payment(iCurrency currency){
        this.currency=currency;
    }

    public abstract void pay(int amount);
}