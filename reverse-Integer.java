class Solution {
    public int reverse(int x) 
    {
        int rev = 0;
        while(x!=0)
        {
            if(rev>214748364 || rev<-214748364)
            {
            return 0;
            }
            int n1 = x%10;
            rev = rev*10 + n1;
            x = x/10;
        }
        return rev;
    }
}
