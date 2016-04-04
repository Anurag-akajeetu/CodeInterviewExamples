package binaryTreeSubTree;
import java.util.*;
public class PersonalIterator implements Iterable<Integer>{
	int start; int end;
	PersonalIterator(int start, int end){
		this.start =start;
		this.end = end;
	}
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new PersonalIterable(start);
	}
	class PersonalIterable implements Iterator<Integer>{
		int cursor;
		PersonalIterable(int start){
			this.cursor = start;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return this.cursor < end;	
		}
		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			if(this.hasNext()){
				 int current = cursor;
				 cursor++;
				 return current;
			}
			throw new NoSuchElementException();
		}	
	}
	public static void main(String args[]){
	}
}