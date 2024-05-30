package scanner_class;
import java.util.Scanner;
//Let's print some more names today (ToT), this will be the last one.
//Mission: Let's help Kakashi Sensei to enter the details of his Team
public class Team_7 {
public void Team()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name: "); // a print statement 
	String name=s.next(); //Taking name which is in string data type as input. (name is the property)
	System.out.println("Enter the age: "); //a print statement
	int age=s.nextInt(); //Taking age which is in integer data type as input. (age is the property)
	System.out.println(name); //To print the taken input 
	System.out.println(age); //To print the taken input
}
public static void main (String args[]) {
	Team_7 t=new Team_7(); //calling the non-static class
	t.Team();//calling the non-static class's method
}
}
/* # Scanner Class: It's a predefined class used to take inputs from the console. 
  we should import it's package, that's how it starts like "import java.util.Scanner" (importing the package)
  and then the class like "Scanner (object)=new Scanner". 
  To take input from a property (variable) "data type property=object.next data type" 
  
  Sumimasen ! I did this concept too much technical, I'll try infusing some more Naruto related concept in the next session. ;)
  Your Practice Mission: Try giving more inputs like grade and make a biodata page. Practice more using basic arithmetic operations like +,-,x,/.
  Understand the Scanner concept.
*/
