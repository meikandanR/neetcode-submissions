class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        List<List<String>>ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char []ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String ss=new String(ch);
            if(!map.containsKey(ss)){
                map.put(ss,new ArrayList<>());
            }
            if(map.containsKey(ss)){
                map.get(ss).add(strs[i]);
            }
        }
        
        return new ArrayList<>(map.values());
        
    }
}