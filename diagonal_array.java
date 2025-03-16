import java.util.Scanner;

public class diagonal_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element in matrix: ");
		int n=sc.nextInt();
		int[][]arr=new int[n][n];
		System.out.println("Enter the element of a matrix: ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix: ");
		for(int i=0; i<n;i++)
		{
			for(int j=0; j<n;j++)
			{
				System.out.print(""+arr[i][j]);
			}
			System.out.println();
		}
		
		if(arr[0][0]!=0 && arr[1][1]!=0 && arr[2][2]!=0)
		{
			System.out.println("The given matrix is diagonal matrix");
		}
		else
		{
			System.out.println("The given matrix is not diagonal matrix");
		}
		sc.close();

	}

}
