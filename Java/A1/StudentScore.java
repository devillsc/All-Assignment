
import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double a[][] = new double[3][3];
		double total = 0; 
		
		System.out.println("Enter the marks ");
		
		for (int i=0;i<3;i++) 
		{
			for (int j=0;j<3;j++) 
			{
				a[i][j]=scanner.nextInt() ;
			}
		}
		
		for (int i=0;i<3;i++) 
		{
			for (int j=0;j<3;j++) 
			{
					total += a[i][j];
			}
		}
		
	
		System. out. println("Total marks : "+ total);
		System. out. println("Average marks : "+ total/9) ;
		
		total = 0;
		
		
		for (int i=0;i<3;i++) 
		{
			total=0;
			for (int j=0;j<3;j++) 
			{
					total += a[i][j];
			}
			
			System.out.println();
			System. out. println("Total marks for student "+ (i+1) +" of each subject is: "+ total) ;
			System. out. println("Average marks for student "+ (i+1) +" of each subject is: "+ total/3);
			System.out.println();
			
			total = 0;
		}
	}
}