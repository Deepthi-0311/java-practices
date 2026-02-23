import java.util.Scanner;
public class Inheritance5 {
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
      //  vehicle.display("car");
      //  vehicle.display1("bike");
           car c = new car();
           c.seatCapacity();
    } 
}
interface vehicle{
    public static final String type = "petrol"; // this is the way to declare a variable
    public static void display(String name){
        System.out.print(name +" "+ type);
    }
    public static void display1(String name){
        System.out.print(name+" "+  type);
    }
       public  void seatCapacity();
}
class car implements vehicle{
   public void seatCapacity(){
    String vehicleType ="auto";
    vehicle.display(vehicleType);
   }
 


   }  
