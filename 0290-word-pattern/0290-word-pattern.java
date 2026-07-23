class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] word = s.split(" ");
        if(pattern.length()!=word.length){
            return false;
        }
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        for(int i = 0;i<word.length;i++){
            char ch = pattern.charAt(i);
            String sh = word[i];

            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(sh)){
                    return false;
                }

            }
            else{
                map1.put(ch,sh);
            }
            if(map2.containsKey(sh)){
                if(map2.get(sh)!=ch){
                    return false;
                }
            }
                else{
                    map2.put(sh,ch);
                }
            
        }
        return true;


        
    }
}