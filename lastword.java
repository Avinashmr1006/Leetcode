class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
       // String str=s.toLowerCase();
        if(s.length()==0)
            return 0;
        boolean f=false;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
            {
                f=true;
                count++;
            }
            else
            {
                if(f)
                    return count;
            }
        }
        return count;
    }
}