package SlectionAlgo;

public class fabona {
	int low, high;
	
	int fabCount()
	{
		int result = 0;
		int f1 =0 , f2 =1, f3 = f2;;
		
		while(f1 < high){
			
			if(f1>= low){
				result++;
			}
			System.out.print(" "+f1);
			
			f1 = f2;
			f2 = f3;
			f3 = f1+f2;
			
			
		}
		System.out.println("");
		
		
		return result;
	}
	
	public static void main(String args[]){
		fabona f = new fabona();
		f.low = 10;
		f.high = 20;
		System.out.println("");
		System.out.println(f.fabCount());
		System.out.println("");
		
	}
}
