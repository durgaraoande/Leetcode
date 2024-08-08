import java.util.ArrayList;

class ReverseWords {
    public static String reverseWords(String s) {
        String arr[]=s.split(" ");
        StringBuilder ans=new StringBuilder();
        ArrayList<String> arrlst=new ArrayList<>();
        for(String str:arr){
            String temp=str.trim();
            if(!(temp==""))
            arrlst.add(str.trim());
        }
        
        for(int i=arrlst.size()-1;i>=0;i--){
            ans.append(arrlst.get(i)).append(" ");
        }
        ans.deleteCharAt(ans.length()-1);
        
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));;
    }
}