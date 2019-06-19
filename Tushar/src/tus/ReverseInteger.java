package tus;

public class ReverseInteger {

	public static void main(String[] args) {

		
		long numb=1243658798;
		long rev=0;
		while(numb!=0) {
			rev =rev*10+numb%10;
			numb=numb/10;
		}
		System.out.println(rev);
		}
		
		
		
	}


