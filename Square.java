import java.util.Scanner;

public class Square {
	public static void main(String[] args ){
		Scanner scanner = new Scanner(System.in);
		int number ;

		System.out.println("Please enter an integer : ");

    try{ 
		number = scanner.nextInt();
		System.out.println(" The Square of " + number + "is  "+ number*number);
    } 
    catch(Exception e){
        System.out.println ("Bad data entered");
    }

		System.out.println("Program have ended ");
	
		
	}


}
