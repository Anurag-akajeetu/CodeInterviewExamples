package patternMatching;
import java.util.*;
public class burstCoins {
    
    int findMini(ArrayList<Integer> list, int start, int end){
        int mini = Integer.MAX_VALUE;
        int index = Integer.MAX_VALUE;
        for(int i =start; i<= end; i++){
            
            if(mini > list.get(i)){
                mini = list.get(i);
                index = i;
            }
        }
        return index;
    }
    
    public int maxCoins(int[] nums) {
        Iterator it = new HashSet<Integer>().iterator();
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int a : nums){
            list.add(a);
        }
        int index;
        while(list.size() > 2){
            index = findMini(list, 1, list.size() - 2);
            sum = sum + ( list.get(index)* ( list.get(index - 1)* list.get(index+1) )); 
             list.remove(index);
        }
        index = findMini(list, 0, list.size() - 1);
        if(index == 1){
            sum = (sum + (list.get(index)*list.get(index - 1)));
            sum = sum + list.get(index -1);
            list.remove(index);
            list.remove(index-1);
        }else{
            sum = (sum + (list.get(index + 1)*list.get(index)));
            sum = sum + list.get(index);
            list.remove(index);
            list.remove(index+1);
        }
        return sum;
    }
}