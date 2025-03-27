package laptop;

// Abstract Class LaptopBase
abstract class LaptopBase implements Laptop {
    protected String brand;
    protected int volume;
    protected boolean isOn;

    public LaptopBase(String brand) {
        this.brand = brand;
        this.volume = 50;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(brand + " laptop is now ON.");
        } else {
            System.out.println(brand + " laptop is already ON.");
        }
    }

    @Override
    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println(brand + " laptop is now OFF.");
        } else {
            System.out.println(brand + " laptop is already OFF.");
        }
    }

    @Override
    public void volumeUp() {
        if (isOn) {
            if (volume < 100) {
                volume += 10;
                System.out.println(brand + " volume: " + volume);
            } else {
                System.out.println(brand + " volume is at max!");
            }
        } else {
            System.out.println("Turn on the laptop first!");
        }
    }

    @Override
    public void volumeDown() {
        if (isOn) {
            if (volume > 0) {
                volume -= 10;
                System.out.println(brand + " volume: " + volume);
            } else {
                System.out.println(brand + " volume is at minimum!");
            }
        } else {
            System.out.println("Turn on the laptop first!");
        }
    }
}
