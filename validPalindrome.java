class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        String p = a.replaceAll("[^a-z0-9]","");
        char b[] = p.toCharArray();
        //removing the non numeric alphabet

        int left = 0;
        int right = b.length-1;

        while(left < right){
            char Store;
            Store = b[left];
            b[left] = b[right];
            b[right] = Store;
            left++;
            right--;  
        }
        String c  = new String(b);
        if(c.equals(p)){
           return true;
        }
        else{
            return false;
        }
  
    }
}
