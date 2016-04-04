package SlectionAlgo;

import java.util.*;

public class MaxHieght {
	box[] boxes;
	box[] result;
	int[] max;	
	MaxHieght(){
		boxes = new box[7];
	}
	class box{
		int l;
		int h;
		int b;
		box(int a, int b, int c){
			this.l = a;
			this.h = b;
			this.b = c;
		}	
	}
	box create(int a, int b, int c){
		return new box(a,b,c);
	}
	void sortingboxes(){	
		box temp;
		for(int i=0; i<boxes.length; i++){
			for(int j=1; j< (boxes.length - i); j++){	
				if((boxes[j-1].l * boxes[j-1].b) > (boxes[j].l * boxes[j].b)){
					temp = boxes[j-1];
					boxes[j-1] = boxes[j];
					boxes[j] = temp;
				}
			}
		}
	}
	boolean upper(box j, box i){
		if(j.l < i.l && j.b < i.b)
			return true;
		return false;
	}
	int MaxInArray(){
		int result = max[0];
		for(int i=1;i<max.length; i++){
			if(max[i] > result){
				result = max[i];
			}
		}
		return result;
	}
	int maxPossibleHieght(){
		result = new box[boxes.length];
		max= new int[boxes.length];
		for(int i=0; i<max.length; i++){
			max[i] = boxes[i].h;
			result[i] = boxes[i];
		}
		for(int i=1; i<max.length;i++){
			for(int j=0; j<i; j++){
				if(upper(boxes[j], boxes[i])){
					if(max[i] < (max[j] + boxes[i].h)){
						max[i] = max[j] + boxes[i].h;
						result[i] = boxes[j];
					}
				}
				
			}
		}
		
		return MaxInArray();
	}
	public static void main(String args[]){
		MaxHieght m1 = new MaxHieght();
		m1.boxes[0] = m1.create(2,3,1);
		m1.boxes[1] = m1.create(3,1,2);
		m1.boxes[2] = m1.create(5,6,4);
		m1.boxes[3] = m1.create(6,4,5);
		m1.boxes[4] = m1.create(7,4,6);
		m1.boxes[5] = m1.create(12,32,10);
		m1.boxes[6] = m1.create(32,10,12);
		
		System.out.println(" "+ m1.maxPossibleHieght());	
	}
}
