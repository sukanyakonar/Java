package oops;

public class Test_Shape {
	
    public static void main(String[] args) 
    { 
        Shape_abstraction s1 = new Circle("Red", 2.2); 
        Shape_abstraction s2 = new Rectangle("Yellow", 2, 4);
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
    } 


}
