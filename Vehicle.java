public class Vehicle {
    private String serial_number;
    private String Name;
    private String model;
    private String manufacturer;
    private float base_cost;

    public Vehicle(String A,String B,String C , String D , float E){
        this.serial_number = A;
        this.Name = B;
        this.model = C;
        this.manufacturer = D;
        this.base_cost = E;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getBase_cost() {
        return base_cost;
    }

    public void setBase_cost(float base_cost) {
        this.base_cost = base_cost;
    }
    
    public void show(){
        System.out.println("serial_number :" + serial_number);
        System.out.println("Name :" + Name);
        System.out.println("Model :" + model);
        System.out.println("Manufacture :" + manufacturer);
        System.out.println("Cost :" + base_cost);
    }
    
}