class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<friends.length ; i++){
            map.put(friends[i],friends[i]);
        }
        int count = 0 ;
        for(int i = 0 ; i<order.length ; i++){
            if(map.containsKey(order[i])){
                friends[count]=map.get(order[i]);
                count++;
            }
        }
        return friends;
        
    }
}