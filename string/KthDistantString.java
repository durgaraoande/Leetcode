
import java.util.HashMap;

class kthDistantString {
    public static String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(map.entrySet());
        int count=0;
        for(int i=0;i<arr.length;i++){
            
            if(map.get(arr[i])==1){
                count++;
                System.out.println(count);
            }
            if(count==k){
                return arr[i];
            }
            
        }
        return "";
    }
    public static void main(String[] args) {
        String[] arr={"d","b","c","b","c","a"};
        System.out.println(kthDistinct(arr, 2));
        System.out.println(arr.toString());
    }
}