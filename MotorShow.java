import java.util.Arrays;

/**
 * Created by Andrej  on 02.08.2016.
 */
public class MotorShow {

    private String name, address;
    private Car cars[];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Car[] getCar() {
        return cars;
    }

    public void setCar(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "MotorShow{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }
}
