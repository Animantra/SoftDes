public class OfflinePay extends Payment{
    public OfflinePay(iCurrency currency){
        super(currency);

    }

    @Override
    public void pay(int amount) {
        System.out.println("InStore payment");
        System.out.println("Written off :");
        currency.convert(amount);
    }
    
}