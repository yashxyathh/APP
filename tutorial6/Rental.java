class vehicle{
    String VehicleNumber,brand;
    double speed;
    vehicle(String VehicleNumber,String brand,double speed ){
        this.VehicleNumber=VehicleNumber;
        this.brand=brand;
        this.speed=speed;

    }
    void diplayDetails(){
        System.out.println("\tDetails");
        System.out.println("Vehicle Number: "+VehicleNumber);
        System.out.println("Brand of Vehicle: "+brand);
        System.out.println("speed: "+speed);
    }
}
class bike extends vehicle{
    boolean hasGear;
    bike(String VehicleNumber,String brand,double speed, boolean hasGear){
        super(VehicleNumber,brand,speed);
        this.hasGear=hasGear;
        
    }
    @Override
    void diplayDetails(){
        System.out.println("\tDetails");
        System.out.println("Vehicle Number: "+VehicleNumber);
        System.out.println("Brand of Vehicle: "+brand);
        System.out.println("speed: "+speed);
        System.out.println("bike has gear: "+hasGear);
    }
}
class car extends vehicle{
    int numberOfDoor;
    car(String VehicleNumber,String brand,double speed, int numberOfDoor){
        super(VehicleNumber,brand,speed);
        this.numberOfDoor=numberOfDoor;
        
    }
    @Override
    void diplayDetails(){
        System.out.println("\tDetails");
        System.out.println("Vehicle Number: "+VehicleNumber);
        System.out.println("Brand of Vehicle: "+brand);
        System.out.println("speed: "+speed);
        System.out.println("Car has "+numberOfDoor +" door");
    }
}
public class Rental {
    public static void main(String[] args) {
        vehicle v1=new bike("TN01CB6969", "royal enfield", 69.69, true);
        vehicle v2=new car("TN01YY0007", "BMW", 140, 4);
        v1.diplayDetails();
        v2.diplayDetails();
    }
    
}