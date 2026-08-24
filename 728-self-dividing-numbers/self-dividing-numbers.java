class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i=left;i<=right;i++){
       int n=i;
       int original =i;
       boolean selfDividing=true;
       while(n>0){
        int digit=n%10;
        n=n/10;
        if(digit==0||original%digit!=0){
            selfDividing=false; 
        }
       } 
       if(selfDividing){
        result.add(original);
       }

        }
       return result;
    }
}