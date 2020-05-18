package justImplye;
import java.util.*;
import com.editor.java.*;
import pack.student.student;

public class Main {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("entr the no of students to be added");
        int n=obj.nextInt();
        implimentation Impli=new implimentation();
        for (int i = 0; i <n ; i++) {
            System.out.println("enter the name");
            String  a=obj.next();
            System.out.println("enter the course");
            String b=obj.next();
            student s=new student(a,b);
            Impli.addition(s);
        }

         Impli.display();


    }
}
