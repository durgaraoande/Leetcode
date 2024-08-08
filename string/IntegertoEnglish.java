import java.util.Scanner;

public class IntegertoEnglish {
    private static final String below20[]={
        "","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"
    };
    private static final String tens[]={"","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    private static final String thousand[]={"","","Thousand","Million","Billion"};
    public static String numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
        String result="";
        int i=0;
        while (num>0) {
            if(num%1000!=0){
                result=helper(num%1000) + thousand[i]+" "+result;
            }
            i++;
            num/=1000;
        }
        return result.trim();
    } 
    public static String helper(int num){
        if(num==0){
            return "";
        }
        else if(num<20){
            return below20[num]+" ";
        }
        else if(num<100){
            return tens[num/10]+" "+ helper(num%10);
        }
        else return below20[num/100]+"Hundred"+helper(num%100);
        
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(numberToWords(s.nextInt()));
    }
}
