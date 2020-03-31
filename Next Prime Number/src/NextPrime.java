import java.util.Scanner;

public class NextPrime {

	private int nextPrime = 3;
	
	private boolean isPrime(int num) {
		for(int i=2;i<Math.floor(Math.sqrt(num)+1); i++) {
			if(num % i == 0) 
				return false;
		}
		return true;
	}
	
	
	public void start() {
		System.out.println("List of prime numbers: ");
		System.out.println("First number is: 2 ... want another? < Y / N >");
		Scanner sc = new Scanner(System.in);
		char ans = sc.next().charAt(0);
		if(ans == "N".charAt(0) || ans == "n".charAt(0)) {
			System.out.println("Bye Bye...");
			System.exit(0);
		}else {
			while(true) {
				printNextPrime();
				increaseNextPrime();
					System.out.println("another? < Y / N >");
					ans = sc.next().charAt(0);
					if( ans == "N".charAt(0) || ans == "n".charAt(0)) {
						System.out.println("Bye Bye...");
						break;
					}
				}
			}
		}
	
		private void printNextPrime() {
			while(!isPrime(nextPrime))
				increaseNextPrime();
			System.out.print(nextPrime + "   ");
		}
	
		
		private void increaseNextPrime() {
			nextPrime++ ;
		}
		
		
	public static void main(String[] args) {
		NextPrime next = new NextPrime();
		next.start();
	}
}
