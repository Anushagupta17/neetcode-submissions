class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int right = len-1;

        int left = 0;

        while(left < right)
        {
            while(left<right && !alphanum(s.charAt(left)))
            {
                left++;
            }

            while(right>left && !alphanum(s.charAt(right)))
            {
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public boolean alphanum(char c)
    {
        return (c >= 'A' && c<='Z' || c >= 'a' && c<='z' || c>='0' && c<='9');
    }
}
