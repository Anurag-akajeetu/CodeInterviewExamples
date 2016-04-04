package SlectionAlgo;
import java.util.*;
public class PaintFill {
	int[][] arr;
	boolean colour(int x, int y, int value){
		if( x < 0 || y< 0  ){
			return false;
		}
		else if( x >= (int) arr.length || y>= arr[1].length){
			return false;
		}
		if(arr[x][y] != value){
			arr[x][y] = value;
			colour( x -1,  y,  value);
			colour( x +1 ,  y,  value);
			colour( x,  y-1,  value);
			colour( x,  y+1,  value);
		}
		return true;
	}
	public static void main(String args[]){
		int x[][] = {{1,2,3,4},{5,6,4,8},{4,7,8,9}};
		PaintFill p1 = new PaintFill();
		p1.arr = x;	
		p1.colour(2,2, 10);
		for(int i=0; i< x.length;i++){
			System.out.println("");
			for(int j=0;j<x[1].length;j++){
				System.out.print(x[i][j]+" ");
			}	
		}	
	}
}
