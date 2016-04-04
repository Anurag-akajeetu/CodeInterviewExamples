package SlectionAlgo;

public class NoOfSteps {
	
	
	int countSteps(int x, int y){
		
		if(x < 0 || y < 0)
			return 0;
		else if( x== 0 || y == 0)
			return 1;
		else
			return countSteps(x-1,y)+countSteps(x, y-1);
			
	}
	
	
	public static void main(String args[]){
		
		System.out.println(new NoOfSteps().countSteps(2, 2));	
	
	}
}
