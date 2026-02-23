public class Inheritance3 {
    public static void main(String[] args){
        Management m1 = new Management("priya","123", "erode");
        m1.display();
         Management.getCount();
        Staff s = new Staff("sangeetha","456", "namakkal", 30000);
        s.display();
        Management.getCount();
       Student d = new Student("ram", "897", "karur", "AI");
      d.display();
        Management.getCount();
       Professor p = new Professor("logs", "9956", "pollachi", 50000,1000);
       p.display();
    Management.getCount();
    
}
}

class Management {
    private String name;
    private String mob;
    private String addr;
    static int count;
    static {
        System.out.print("Initialized");
        count =0;
    }
   public Management(String name,String mob,String addr){
        this.name = name;
        this.mob = mob;
        this.addr = addr; 
        count++;
    }
    public static int getCount(){
        if(count%2==0) System.out.print("even number of object" + count);
        else{
            System.out.println("odd number of object" + count);
        }
        return count;
    }
    public void display(){
        System.out.print("\n"+name+ "\n"+mob + " \n" + addr);
    }
}
class Staff extends Management{
    private double Salary;
    Staff(String name,String mob, String addr,double Salary){
        super(name,mob,addr);
        this.Salary=Salary;
    }
        public double getSalary() {
         return Salary;
        }
        public void setSalary(double sal){
            Salary = sal;
        }
    
        public void display(){
            super.display();
            System.out.println("\n"+Salary);
        }
}
    class Student extends Management{
        private String course;
    Student(String name,String mob,String addr, String course){
    super(name, mob, addr);
    this.course = course;
}
public void display(){
    super.display();
    System.out.println("\n"+course);
}
    }
    class Professor extends Staff{
        private double inc;
         Professor(String name,String mob,String addr,double Salary,double inc){
            super (name,mob,addr,Salary); 
            this.inc = inc;
         }
         public void updateSalary(){
            double sal = super.getSalary();
            double increment = inc/100 *sal;
            double update = sal+increment;
            super.setSalary(update);
         }
    }
