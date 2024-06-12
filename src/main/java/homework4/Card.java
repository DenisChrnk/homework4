package homework4;

public class Card {
    private String cardNumber;
    private int validityMonth;
    private int cvv;
    private int pinCode;

    public Card(String number, int validity, int cvv, int pinCode) {
        this.cardNumber = number;
        this.validityMonth = validity;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }

    public String lastCardNumber() {
        return "**** **** **** " + this.cardNumber.substring(this.cardNumber.length() - 4);
    }

    public void allCardNumber(int inPinCode) {
        if (inPinCode == this.pinCode) {
            System.out.println(this.cardNumber);
        }
    }
}
