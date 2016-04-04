package SlectionAlgo;

public class MiniJump {
	
	
	int mini(int a, int b){
		return (a<b)? a:b;
		
	}
	
	int numberOfJumps(int a[]){
		
		int len = a.length;
		int opt[] = new int[len];
		System.out.println("length is "+ len);
		opt[0] = 0;
		
		for(int i = 1; i<len ;i++){
			opt[i] = Integer.MAX_VALUE;
			for(int j = 1; j<=i ; ++j){
				
				if(a[i-j] >= j)
					opt[i] = mini(opt[i], (opt[i-j] +1));
			}
		}
		return opt[len-1];
	}
	
	public static void main(String args[]){
		int a[] = {1, 3, 0, 8, 9, 2, 6, 7, 6, 8, 9};
		MiniJump m1 = new MiniJump();
		System.out.println(m1.numberOfJumps(a));
	}
}
