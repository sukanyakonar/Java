package accessmodifiers;

//1. Class is having Default access modifier 
class AccessModifier1
{ 
	void display() 
   { 
       System.out.println("You are using defalut access specifier"); 
   } 
} 

public class DefaultAccessModifier {

	public static void main(String[] args) {
		//default
		
		System.out.println("Dafault Access Specifier");
		AccessModifier1 obj = new AccessModifier1(); 		  
		obj.display(); 

	}
}


