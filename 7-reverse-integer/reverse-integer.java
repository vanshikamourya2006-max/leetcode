class Solution {
    public int reverse(int x) {
        int lastdigit;
        int result=0;
        int num=Math.abs(x);
       while(num>0)
       {
        lastdigit=num%10;
        if(result>(Integer.MAX_VALUE - lastdigit)/10){
            return 0;
        }
        result=result*10+lastdigit;
        num=num/10;
       }
        if(x<0){
            return (-result);
        }
         else{
            return result;
         }
       
    } 
        
    
}
