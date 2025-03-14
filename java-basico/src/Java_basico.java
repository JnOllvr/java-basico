import java.util.Scanner;

public class Java_basico {
	
	public static void main ( String args[]){
		
		try (Scanner input = new Scanner( System.in)) {
			int n1;
			int n2;
			int sum;
			
			System.out.println("Coloque o primeiro numero");
			n1 = input.nextInt();
			
			System.out.println("Coloque o segundo numero");
			n2 = input.nextInt();
			
			sum = n1 + n2;
			
			System.out.printf("Soma is %d\n", sum);
		}
		
	}
		
}
