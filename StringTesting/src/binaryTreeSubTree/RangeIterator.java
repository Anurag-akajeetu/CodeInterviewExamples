package binaryTreeSubTree;

import java.util.*;

public class RangeIterator<T> implements Iterator<T>{
	
	Iterator<T> current;
	Iterator<Iterator<T>> cursor;
	
	public RangeIterator(Iterable<Iterator<T>> iterators) throws Exception{
		if(iterators== null) throw new Exception();
		cursor = iterators.iterator();
	}
	
	public Iterator<T> findNext(){
		while(cursor.hasNext()){
			current = cursor.next();
			if(current.hasNext()) return current;
		}
		return null;
	}
	
	public boolean hasNext(){
		if(current == null || !current.hasNext()){
			current = findNext();
		}
		return (current != null && current.hasNext());
	}
	public T next(){
		if(current.hasNext()){
			return current.next();
		}
		return null;
	}
	 public void remove() {
	        if (current != null) {
	            current.remove();
	        }
	  }
}
