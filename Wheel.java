/**
 * Created by  Andrej on 02.08.2016.
 */
public class Wheel {

    private String manufacturer, type;
    private int diameter;

    Wheel(){

    }

    Wheel(String type){
        this.type = type;
    }

    Wheel(String type, String manufacturer, int diameter){
        this(type);
        this.manufacturer = manufacturer;
        this.diameter = diameter;
    }

    Wheel(Wheel wheel){
        this(wheel.getType(), wheel.getManufacturer(), wheel.getDiameter());
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", diameter=" + diameter +
                '}';
    }

}
