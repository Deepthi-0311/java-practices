import java.nio.channels.Pipe.SourceChannel;

public class Inheritance{
    public static void main (String[] args){
        Management m1  =new Management("deepi", 8148, "karur");
        m1.display();
        Staff s1 = new Staff("priya", 4359, "velur", 800);
        s1.display();
        Student d1 = new Student("divya",9944 , "palani", "java");
        d1.display();
    }
}
class Management{
   private String name;
   private int mob;
   private String addr;

Management(String name,int mob,String addr){
    this.name = name;
    this.mob = mob;
    this.addr = addr ;
}
public void display(){
    System.out.println("name => "+name + "\nmobile => "+mob+"\naddress => "+ addr);
}
}
class Staff extends  Management{
   private double salary;
    Staff(String name,int mob,String addr,double salary){
super(name,mob,addr);
this.salary = salary;
    }
    public void greet(){
        System.out.println("welcome to staffs groups");
    }
    public void display(){
        super.display();
      System.out.println("salary => " +salary);
    }
}
class Student extends Management{
   private String course;
    Student(String name,int mob,String addr,String course){
        super(name,mob,addr);
        this.course = course;
    }
    public void greet(){
        System.out.println(" welcome to students world");
    }
    public void display(){
        super.display();
        System.out.println("course => " + course);
    }
}
