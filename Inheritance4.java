public class Inheritance4 {
    public static void main(String[] args){
        car c  = new car("BMW"); //this object is only check whether the seat capacity is present 
           // in only car no need to present in parent class
        c.seatCapacity();
        vehicle v = new car("maruthi"); // this object is check both check parent and child this 
        // seatCapacity is must in both parent and child class then only this will run 
        v.seatCapacity();
    }
    
}
abstract class vehicle{
    private String name;
    private String type;
    // constructor
    vehicle(String name){
        this.name = name;
    }
    public void vehicleType(String name){  // non abstract method
        this.name = name;
        System.out.println(name);
    }
    public void display(String name){   // non abstract method
        System.out.println(name);
    }
    public abstract void seatCapacity();  // abstract method must be without body
}
class car extends vehicle{
    car(String name){
        super(name);
    }
    public void  seatCapacity(){  // overrirding method from parent class
        vehicleType("petrol");
        display("car");
        System.out.println("SeatCapacity is 4 ");
    }
}
