class Solution {
    public String trimTrailingVowels(String s) {
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(set.contains(s.charAt(i))){
                count++;
            }
            else{
                break;
            }
        }
        return s.substring(0,s.length()-count);
        
    }
}