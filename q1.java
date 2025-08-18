import java.util.*;
class q1{
    public static void main(String args[]){
        Scannar sr = new Scannar(System.in);
        String Name = sr.nextLine();
        int Age = sr.nextInt();
        sr.nextLine();
        String Address = sr.nextLine();
        System.Out.Println("My Name is"+Name);
        System.Out.Println("My Age is"+Age);
        System.Out.Println("My Address is"+Address);
    }
}

