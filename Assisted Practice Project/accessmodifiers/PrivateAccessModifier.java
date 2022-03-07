package accessmodifiers;

//2. using private access specifiers
class AccessModifier2 
{ 
 private void display() 
  { 
      System.out.println("You are using private access specifier"); 
  } 
} 

public class PrivateAccessModifier {

	public static void main(String[] args) {
		
		//private
		System.out.println("Private Access Specifier");
		AccessModifier2  obj = new AccessModifier2(); 
        //trying to access private method of another class 
        //obj.display();

	}
}

