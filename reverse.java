class Solution {
    public int reverse(int x) {
       long rev = 0;
        boolean isNegative = false;
        
         if (x < 0){
            x *= -1;
            isNegative = true;
         }        
        
         while (x != 0){
            int num = x % 10;
            rev =rev * 10 + num;
            x /= 10;
         }
        
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE){
            return 0;
        }
        
         if (isNegative){
            return (int)rev*-1;
         } 
        
        return (int)rev;
}
}