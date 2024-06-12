package homework4;

public class Car {

    private String brand;
    private String color;
    private int currentSpeed;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.currentSpeed = 0;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public int speedUp(int speed) {
        return this.currentSpeed = this.currentSpeed + speed;
    }

    public int breakSpeed() {
        if (this.currentSpeed <= 10) {
            return this.currentSpeed = 0;
        } else {
            return this.currentSpeed = this.currentSpeed - 10;
        }
    }
}
