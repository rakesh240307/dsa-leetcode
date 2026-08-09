class Solution {
    public boolean v(char ch){
        boolean a = false;
        if(ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U'){
                a = true;
               }
               return a ;
    }
    public String reverseVowels(String s) {
        int i = 0 ;
        int j = s.length()-1;
        char[] arr = s.toCharArray();
        while(i<=j){
            if(!v(s.charAt(i))){
                i++;
            }
            else if(!v(s.charAt(j))){
                j--;
            }
            else{
                char temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

            }
                
            
        }
        return new String(arr);

        
    }
}