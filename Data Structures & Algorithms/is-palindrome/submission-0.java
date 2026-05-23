class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        char [] arr = s.toCharArray();
        int n = arr.length;
        int j = n - 1;
        while(i < j){
            while (i < j && !Character.isLetterOrDigit(arr[i])) 
                i++;
                    while (i < j && !Character.isLetterOrDigit(arr[j])) 
                        j--;
                            if (Character.toLowerCase (arr[i]) != Character.toLowerCase(arr[j])){
                                return false;
            }
            i++;
            j--;
            }
    return true;     
    }
}
