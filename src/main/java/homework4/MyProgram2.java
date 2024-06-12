package homework4;

public class MyProgram2 {
    public static void main(String[] args) {

        Car myCar = new Car("Honda", "Red");

        System.out.println(myCar.getCurrentSpeed());

        myCar.speedUp(25);

        System.out.println(myCar.getCurrentSpeed());

        myCar.breakSpeed();

        System.out.println(myCar.getCurrentSpeed());

        myCar.breakSpeed();

        System.out.println(myCar.getCurrentSpeed());

        myCar.breakSpeed();

        System.out.println(myCar.getCurrentSpeed());

        myCar.breakSpeed();

        System.out.println(myCar.getCurrentSpeed());
    }
}
