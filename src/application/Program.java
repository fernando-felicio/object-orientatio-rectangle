package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter the width of the rectangle:  ");
		rectangle.width = scanner.nextDouble();
		
		System.out.println("Enter the height of the rectangle:  ");
		rectangle.heigth = scanner.nextDouble();
		
		
		scanner.close();
		
	}

}
