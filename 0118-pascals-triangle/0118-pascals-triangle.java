class Solution {
    static void slide(List<List<Integer>> list,List<Integer> ans , int n ){
        if(ans.size()==n){
            return;
            }
        ArrayList<Integer> a=new ArrayList<>();
        a.add(ans.get(0));
        int i=1;
        while(i<ans.size()){
            int p=ans.get(i)+ans.get(i-1);
            a.add(p);
            i++;
        }
        a.add(ans.get(ans.size()-1));
        list.add(a);
        slide(list,a,n);  
    } 
    public List<List<Integer>> generate(int numRows) {

        
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans =new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        a.add(1);
        ans.add(1);
        ans.add(1);
        if(numRows==1){
            list.add(a);
            return list;
        }
        else{
            list.add(a);
            list.add(ans);
            slide(list,ans,numRows);
            return list;
        }
    }
}