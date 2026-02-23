public class Inheritance2 {
    public static void main (String[] args){
        Management[] s1 ={new Staff("deepi", 8148, "karur",80000),
        new Student("priya", 9944, "palani", "java"),
        new Staff("ram", 4543, "erode",40000),
        new Student("sitha", 2922, "salem", "AI"),
    };
    for(int i = 0;i<s1.length;i++){
        s1[i].display();
        if(s1[i] instanceof Student){
            Student temp = (Student) s1[i]; // type casting
            temp.greet();
        }
        else{
            Staff temp = (Staff) s1[i]; // type casting
            temp.greet();
        }
        System.out.println();
    }
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
