import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("The size of array : ");
		int n=sc.nextInt();
		System.out.print("The lower range of an array : ");
		int lower= sc.nextInt();
		System.out.print("The upper range of an array : ");
		int upper= sc.nextInt();
		int []primes = new int[n];
		int count=0;
		for(int num=lower; num<=upper; num++)
		{
			if(isPrime(num))
			{
				primes[count]= num;
				count++;
				if(count==n) {
					break;
				}
			}
		}
		if(count==n) {
			System.out.println("The first "+n+" prime numbers in the range are : ");
			for(int i=0; i<n; i++) {
				System.out.print(primes[i]+" ");
				
			}
			System.out.println();
		}
		else {
			System.out.println("Unable to find the "+n+" prime numbers in this range");
		}
	}

	public static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num<=1) {
			return false;
		}
		for(int i=2; i<= Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
