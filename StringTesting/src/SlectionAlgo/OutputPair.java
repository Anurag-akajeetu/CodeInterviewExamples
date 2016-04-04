package SlectionAlgo;
public class OutputPair {
	void fibPair(int n){
		if(n == 0){
		}else{
			int a = 1;
			int b = 1;
			int temp = -1;
			while(n != 0){
				System.out.println("[ "+a%10+", "+b%10+"]");
				n--;
				temp = b;
				b = a+b;
				a = temp;
			}
		}	
	}
	public static void main(String args[]){
		new OutputPair().fibPair(7);
	}
}
