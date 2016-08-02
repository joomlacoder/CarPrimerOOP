/**
 * Created by Andrej on 02.08.2016.
 */
public class Engine {

    private String type, manufacturer;
    private int horsePower, countCylinder;
    private float volume;
    private boolean started;

    Engine(){

    }

    Engine(String type){
        this.type = type;
    }

    Engine(String type, float volume){
        this(type);
        this.volume = volume;
    }

    Engine(String type, float volume, int horsePower, int countCylinder, String manufacturer){
        this(type, volume);
        this.horsePower = horsePower;
        this. countCylinder = countCylinder;
        this.manufacturer = manufacturer;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public int getCountCylinder() {
        return countCylinder;
    }

    public void setCountCylinder(int countCylinder) {
        this.countCylinder = countCylinder;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void start(){
        if(started){
            System.out.println("Двигатель уже заведен");
            return;
        }

        if(type == "e"){
            System.out.println("тзсс-с-с-с");
        } else {
            System.out.println("дрр-р-р-р-р");
        }
        System.out.println("Двигатель заведен");
    }

    public boolean isStarted(){
        return started;
    }

    public void  stop(){
        started = false;
        System.out.println("Двигатель остановлен");
    };

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", horsePower=" + horsePower +
                ", countCylinder=" + countCylinder +
                ", volume=" + volume +
                ", started=" + started +
                '}';
    }
}
