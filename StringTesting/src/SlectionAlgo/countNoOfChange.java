package SlectionAlgo;
import java.util.*;
public class countNoOfChange {
	HashMap<Integer, Integer> coin = new HashMap<Integer, Integer>();
	int noOfCoin(int x, int n[]){
		int count = 0,
			i = n.length - 1,
			temp;
		while(x > n[0]){
			temp = x/n[i];
			count = count + x/n[i];
			coin.put(n[i], temp);
			x = x%n[i];
			i--;
		}
		return count;
	}
	public static void main(String args[]){
		int x = 53;
		int deno[] = {1,2,5,10,20,50,100,500,1000};
		countNoOfChange c = new countNoOfChange();
		System.out.println(c.noOfCoin(x, deno));
	}
}
