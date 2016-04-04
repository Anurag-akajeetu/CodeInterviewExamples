package SlectionAlgo;

import java.util.*;

public class PlacingQueens {

	int grid_size;
	ArrayList<int[]> result;
	
	PlacingQueens(int size){
		this.grid_size = size;
		result = new ArrayList<int[]>();	
	}
	boolean checkValid(int row, int coln , int[] col){
		for(int i=0; i<row; i++){
			if(coln == col[i])
				return false;
			if(Math.abs(coln - col[i]) == (row - i) )
				return false;
		}
		return true;
	}
	void countWays(int row, int[] col){
		if(row == grid_size){
			result.add(col.clone());
		}
		else{
			for(int c=0; c<grid_size; c++){
				if(checkValid(row, c, col)){
					col[row] = c;
					countWays(row + 1, col);
				}
				
			}
		}
	}
	public static void main(String args[]){
		PlacingQueens q = new PlacingQueens(8);
		int col[] = new int[8];
		q.countWays(0, col);
		System.out.println("Size of result"+ q.result.size());
		for(int[] a: q.result){
			System.out.println("");
			for(int b: a){
				System.out.print(" "+ b);
			}
		}
	}
}
