class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] box=new int[46];
        int max=0;
        
        for(int i=lowLimit;i<=highLimit;i++){
        int sum=0;
            int n=i;
            while(n>0){
                sum +=n%10;
                n=n/10;
            }
            box[sum]++;
            max=Math.max(max,box[sum]);
            
        }
        return max;
    }
}