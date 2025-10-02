public class OnlinePay extends Payment{
    public OnlinePay(iCurrency currency){
        super(currency);

    }

    @Override
    public void pay(int amount) {
        System.out.println("Online payment");
        System.out.println("Written off :");
        currency.convert(amount);
    }
    
}
