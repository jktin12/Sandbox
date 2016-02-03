import java.util.List;
import java.util.ArrayList;

public class ChooseTwoKings{

//	private static List kings;
	
	public ChooseTwoKings(){
/*		kings = new ArrayList<Integer>();
		for(int i=49; i<=52; i++){
			kings.add(new Integer(i));
		}
		*/
	}

	public static int recurse(List<Integer> chosen, int depth){
		//base case
		if (depth == 3){
			if(checkHandForTwoKings(chosen)){
				return 1;
			}
			else{
				return 0;
			}
		}
		else{
			int total = 0;
			for(int i=1; i<=52; i++){
				if(!chosen.contains(new Integer(i))){
					List newList = new ArrayList<Integer>(chosen);
					newList.add(new Integer(i));
					total += recurse(newList, new Integer(depth+1));
				}
			}
			return total;
		}
	}

	private static boolean checkHandForTwoKings(List<Integer> cards){
		int kingCount = 0;
		for(Integer card : cards){
			if(card >= 49 && card <= 52){
				kingCount++;
			}
		}
		return kingCount==2;
	}

	public static void main(String[]args){
		int prob = recurse(new ArrayList<Integer>(), 0);
		System.out.println("Probability: "+prob+"/"+(52*51*50)+"\n");
		System.out.println("Percentage: "+(float)prob/(52*51*50)+"\n");
	}
}
