package keywordscustomexceptions;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a=45,b=0,rs=0;
        try
        {
            rs = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + rs);
        }
    }
}
