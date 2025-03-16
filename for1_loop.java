public class for1_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8,i,j;
		for(i=1;i<=n;i++) {
		
			for(j=1; j<=i;) {
				j++;

				System.out.print(""+ j);
			}
			System.out.println();
		}
	}

}
