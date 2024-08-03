class Solution {
    public int addDigits(int num) {
        while(num%10!=num){
            num=digit(num);
        }
        return num;
    }
    public int digit(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}





class Solution {
    public int addDigits(int num) {
        if(num == 0) return 0;
        else if(num % 9 == 0) return 9;
        else return num % 9;
    }
}
