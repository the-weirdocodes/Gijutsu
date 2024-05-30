package scanner_class;
import java.util.Scanner;
//Let's print some more names today ToT, this will be the last one.
//Mission: Let's help Kakashi Sensei to enter the details of his Team
public class Team_7 {
public void Team()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name: ");
	String name=s.next();
	System.out.println("Enter the age: ");
	int age=s.nextInt();
	System.out.println(name);
	System.out.println(age);
}
public static void main (String args[]) {
	Team_7 t=new Team_7();
	t.Team();
}
}
