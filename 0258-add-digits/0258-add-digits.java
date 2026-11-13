class Solution {
    public int addDigits(int num) {
        //int n=nums.length;
        while(num>=10){
            int sum=0;
            while(num>0){
                int digit=num%10;
                sum+=digit;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
}