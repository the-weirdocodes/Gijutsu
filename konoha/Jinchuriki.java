package shinobi; 
//let's print tailed beasts name ;)
public class Jinchuriki {
	String name; //instance property
	// Instance property can be allocated in any kind of method unless it is static.
	
	public void Naruto() //non-static method
    {
		name="9 tailed fox-Kurama";
		System.out.println(name); //print statement
	}
	
	public static void KiraBee() //static method
	{
		System.out.println("8 tailed Octopus-Gyuki");
	}
	
	public static void main(String args[]) //main method
	{
		Jinchuriki u=new Jinchuriki(); //calling the class with summoning an object (Here object is letter 'u' for Class Jinchuriki)
		u.Naruto(); //calling the non-static method
		Uzumaki.KiraBee(); //calling the static method
	}
}
/*Let's dive into jutsu of Class,

#Class: It's a combination of properties (data, variables) and behavior (method)
#Weaving Strength and Chakra together makes a jutsu. Similarly, properties and behavior weave a class. 
#Now, these methods (behavior) are of two types, static and non-static.

#Static method: 
Remember ANBU Black Ops ? Those highly skilled masked Shinobi who directly work under the Hokage's direction personally?
That's how exactly static method is prioritized in JVM (Java virtual Machine) for execution, this is because it allocates 
memory directly from  the class while it is loading to compile. Static method needs static properties thus, doesn't accept 
instances properties. 

#Non-Static method:
This method allocates memory in the run time, basically executes slower than a static method. Allows instance properties 
into them. Can be used by any other behavior too.

 #Main-Method:
 This method is like Ichiraku Ramen for Naruto, he for sure visits Ichiraku Ramen everytime and enjoys Ramen there.
 Likewise each and every class, behavior and property comes to the main method for execution. It all starts with 
 calling the class name first and creating an object. Object works like a surname. To call the non static methods 
 inside the class, we use the object, (object.method name). For static methods it's not necessary (Class name.method name).*/
