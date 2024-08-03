package basic;

import java.util.HashMap;
import java.util.Map;

public class Count_digit {
    
    public static boolean digitCount(String num) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num.length();i++){
            if(!map.containsKey(num.charAt(i)-'0')){
                map.put(num.charAt(i)-'0',1);
            }
            else{
                map.put(num.charAt(i)-'0',map.get(num.charAt(i))+1);
            }
        }
        for(int x:map.keySet()){
            System.out.println(x+" "+map.get(x));
        }
        // for(int i=0;i<num.length();i++){
        //     // if((int)num.charAt(i)!=map.get(num.charAt(i))){
        //     //     return false;
        //     // }
            
        // }
        for (int i = 0; i < num.length(); i++) {
            int expectedCount = num.charAt(i) ; // Convert character to integer
            int actualCount = map.getOrDefault(i, 0); // Get count of digit i
            
            if (expectedCount != actualCount) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }

}
