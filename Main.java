/**
 * Created  by  Andrej on 02.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        MotorShow motorShowOne, motorShowTwo;

        Engine engineOne, engineTwo;
        Wheel wheelOne, wheelTwo;
        Car carOne, carTwo;

        engineOne =  new Engine("b", 2.0f, 120, 4, "Audi");
        wheelOne = new Wheel("standart", "no Name", 19);
        carOne = new Car();

        engineTwo = new Engine("e", 0, 300, 0, "Tesla");
        wheelTwo = new Wheel("winteer", "TesWh", 21);
        carTwo = new Car(wheelTwo, engineTwo);

        carTwo.setColor("silver")
                .setWeight(2150)
                .setType("Купе")
                .setDivided(true)
                .setMileage(20)
                .setCountOwners(1)
                .setModel("S")
                .setManufacturer("Tesla");

        carOne.setColor("Red")
                .setCountDoors(5)
                .setCountOwners(0)
                .setDivided(false)
                .setEngine(engineOne)
                .setManufacturer("Audi")
                .setMileage(200)
                .setModel("A3")
                .setType("Седан")
                .setWeight(1750)
                .setWheels(new Wheel[]{wheelOne, new Wheel(wheelOne), new Wheel(wheelOne), new Wheel(wheelOne)});

        MotorShow motorShow = new MotorShow();

        motorShow.setAddress("Mos, Kyt, 91");
        motorShow.setName("TestRoom");
        motorShow.setCar(new Car[]{carOne, carTwo});

        motorShow.getCar()[0].start();
        motorShow.getCar()[0].getEngine().start();//Не является хорошм тоном
        engineOne.stop();//Тоже не есть хорошо
        motorShow.getCar()[1].start();
        motorShow.getCar()[0].stop();
        motorShow.getCar()[1].stop();

        System.out.println(motorShow);
    }

}
