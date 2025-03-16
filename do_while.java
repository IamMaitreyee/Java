public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		do {
			System.out.println("Addition of "+ sum +" + " + i + " = "+(sum+i));
			sum=sum+i;
			i++;
		}
		while(i<=100);
		
	}

}
