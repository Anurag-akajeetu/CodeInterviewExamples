package SlectionAlgo;

public class magicIndex {
	
	boolean magicCheck(int a[], int start , int end){
		
		int mid = (start + end)/2;
		
		if(start>=end){
			return false;
		}
		
		if(a[mid] == mid)
			return true;
		else if(a[mid] < mid)
			return magicCheck(a, mid+1, end);
		else
			return magicCheck(a,start,mid-1);
	}
	
	public static void main(String artgs[]){
		magicIndex i= new magicIndex();
		int a[] = {0, -10, 2, 4 ,5,6};
		System.out.println(i.magicCheck(a, 0, a.length));
	}
	
}
