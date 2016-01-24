import java.util.Scanner;
public class fibonacci{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int numSel, fibVal;
		//String again;
		do{
			System.out.print("Which number in the sequence?: ");
			numSel = input.nextInt();
			if(numSel>0){
				fibVal = getFib(numSel);
				System.out.println(fibVal);
			}
			//System.out.print("Again? (y/n): ");
			//again = input.next();
		}
		//while(again.equalsIgnoreCase("y")||again.equalsIgnoreCase("yes"));
		while(numSel>0);
	}
	public static int getFib(int num){
		int a = 0, b = 1, c = 1;
		for(int i=0; i<num-2; i++){
			c = a + b;
			a = b;
			b = c;
		}
		if(num == 1)
			c = a;
		return c;
	}
}
