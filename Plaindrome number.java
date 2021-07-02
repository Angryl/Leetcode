  class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        if(x>=0)
        {
            int rev = 0;
            while(x!=0)
            {
                int i = x%10;
                rev = rev*10 + i;
                x = x/10;
            }
            if((rev*1) == temp)
            return true;
        }
        return false;
    }
}
