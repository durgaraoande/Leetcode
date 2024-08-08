import java.util.Scanner;

public class LargestOddInteger {
    public static String largestOddNumber(String num) {
        int n=num.length();
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                //if(i==j) continue;
                long temp=Long.parseLong(num.substring(i,j+1));
                if(temp%2==1 && temp>max){
                    max=temp;
                }
            }
        }
        return (max==Long.MIN_VALUE)?"":Long.toString(max);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(largestOddNumber(s.next()));
    }
}
