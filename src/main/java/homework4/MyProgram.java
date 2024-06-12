package homework4;

public class MyProgram {
    public static void main(String[] args) {

        Card myCard = new Card("1234567812345678", 24,123,6655);

        System.out.println(myCard.lastCardNumber());

        myCard.allCardNumber(6655);

    }
}
