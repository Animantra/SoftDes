public class Main {
    public static void main(String[] args) {
        
    
        iCurrency usd=new USD();
        iCurrency tenge=new KZT();

        Payment online=new OnlinePay(tenge);
        Payment offline=new OfflinePay(usd);

        online.pay(1200);
        System.out.println("---");
        offline.pay(5000);
    }
}
