import java.util.ArrayList;
public class Container {
    public static void main(String []args){
        ArrayList <Student> obj = new ArrayList<>();
        // create a object for student
        // Student s1 = new Student();
        // // add to arraylist
        // obj.add(s1);
        // // call display using loop
        // for(Student s : obj){
        //     s.display();
        obj.add(new Student("ram", "AI", "8148"));
        obj.add(new Student("priya", "java", "9944"));
        for(Student s : obj){
            s.display();
        }
        System.out.println();
        
        }
    }

class Student {
    // String name="ram";
    // String course="AI";
    // String mob="814";
    // public void display(){
    //     System.out.print(name +"\n"+ course +"\n"+ mob);
    // }
    String name;
    String course;
    String mob;
    
    Student(String name,String course,String mob){
        this.name=name;
        this.course=course;
        this.mob=mob;
    }
    public void display(){
        System.out.println("name->" + name + "\n"+ "course->" + course +"\n" + "mob->" + mob);
    }
}