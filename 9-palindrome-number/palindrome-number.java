class Solution {
    public boolean isPalindrome(int x) {
        int y=0,lastdigit,result=0;
        
        if(x<0 || x!=0 && x%10==0){          
            return false;
        }   
        
        y=x;
            while(x>0)
        {        
            lastdigit=x%10;
            result=result*10+lastdigit;
            x=x/10;
            
        }

        if(result==y){
                return true;
        }
        
        return false;
        
    }
}