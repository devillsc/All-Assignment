
import java.util.Scanner;

public class CUIApp {

	public static void main(String[] args) {
		
		
		String name, password;
		int count = 0, attempt, track = 0;
		
		while(count<2 && track == 0)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the User id : ");
			name = scanner.nextLine();
			System.out.println("Enter password : ");
			password = scanner.nextLine();
			
			
			if(name.equals("Shubham Chawra") && password.equals("Password"))
			{
				track = 1;
				System.out.println("Welcome " + name);
			}
			else
			{	
				count++;
				attempt = 2-count;
				System.out.println("Try Again. Attempts remaining  " + attempt);
				
				if(attempt == 0)
				{
					System.out.println("Contact Admin");
				}
			}	
		}
	}
}