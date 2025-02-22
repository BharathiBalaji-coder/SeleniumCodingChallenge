package Week04.Day1;

public class Amazon extends CanaraBank {
    @Override
    public void cashOnDelivery() {
        System.out.println("Cash on delivery available");
    }

    @Override
    public void upiPayments() {
        System.out.println("UPI payments available");
    }

    @Override
    public void cardPayments() {
        System.out.println("Card payments available");
    }

    @Override
    public void internetBanking() {

    }

    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.cashOnDelivery();
        amazon.upiPayments();
        amazon.cardPayments();
        amazon.internetBanking();
        amazon.recordPaymentDetails();
    }
}
