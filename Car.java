import java.util.Arrays;

/**
 * Created by  Andrej on 02.08.2016.
 */
public class Car {

    private String color, model, manufacturer, type;
    private int mileage, countOwners, countDoors, weight;
    private Wheel wheels[];
    private Engine engine;
    private boolean divided;

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Car setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getType() {
        return type;
    }

    public Car setType(String type) {
        this.type = type;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public Car setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public int getCountOwners() {
        return countOwners;
    }

    public Car setCountOwners(int countOwners) {
        this.countOwners = countOwners;
        return this;
    }

    public int getCountDoors() {
        return countDoors;
    }

    public Car setCountDoors(int countDoors) {
        this.countDoors = countDoors;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Car setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public Car setWheels(Wheel[] wheels) {
        this.wheels = wheels;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public boolean isDivided() {
        return divided;
    }

    public Car setDivided(boolean divided) {
        this.divided = divided;
        return this;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    Car(){
        engine = new Engine();
        wheels = new Wheel[]{new Wheel(), new Wheel(), new Wheel(), new Wheel()};
    }

    Car(Wheel wheel, Engine engine){
        wheels = new Wheel[]{new Wheel(wheel), new Wheel(wheel), new Wheel(wheel), new Wheel(wheel)};
        this.engine = engine;
    }

    public Car(String color, String model, String manufacturer, String type, int mileage, int countOwners, int countDoors, int weight, Wheel[] wheels, Engine engine, boolean divided) {
        this.color = color;
        this.model = model;
        this.manufacturer = manufacturer;
        this.type = type;
        this.mileage = mileage;
        this.countOwners = countOwners;
        this.countDoors = countDoors;
        this.weight = weight;
        this.wheels = wheels;
        this.engine = engine;
        this.divided = divided;
    }

    public Car(String color, String model, String manufacturer, String type, int mileage, int countOwners, int countDoors, int weight, Wheel wheel, Engine engine, boolean divided) {
        this.color = color;
        this.model = model;
        this.manufacturer = manufacturer;
        this.type = type;
        this.mileage = mileage;
        this.countOwners = countOwners;
        this.countDoors = countDoors;
        this.weight = weight;
        this.wheels = new Wheel[]{new Wheel(wheel), new Wheel(wheel), new Wheel(wheel), new Wheel(wheel)};
        this.engine = engine;
        this.divided = divided;
    }

    @Override
    public String toString() {

        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", mileage=" + mileage +
                ", countOwners=" + countOwners +
                ", countDoors=" + countDoors +
                ", weight=" + weight +
                ", wheels=" + Arrays.toString(wheels) +
                ", engine=" + engine +
                ", divided=" + divided +
                '}' + "\n\n" ;
    }
}
