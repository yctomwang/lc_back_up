/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 29.91 %
    Runtime : 199 ms
    Memory Usage : 43.8 MB
    Testcase : 57 / 57 passed
    Ranking : 
        Your runtime beats 21.30 % of java submissions.
        Your memory usage beats 90.26 % of java submissions.
}
*/

class Solution {
    public String largestPalindromic(String num) {
        //hashmap to store occurence of each character and 
        //System.out.println(num.length());
        TreeMap<Character, Integer> map = new TreeMap<>();
        
        for(int i=0;i<num.length();i++){
            char curr= num.charAt(i);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        StringBuilder s1 = new StringBuilder();
        int biggest = Integer.MIN_VALUE;
        char biggestchar='q';
        for (Map.Entry<Character, Integer>entry : map.entrySet()){
            if(entry.getValue()%2!=0&&(entry.getKey()-'0')>biggest){
                biggest=entry.getKey()-'0';
                biggestchar=entry.getKey();
            }
        }
        //System.out.println(map.firstKey());
        if(biggest==Integer.MIN_VALUE){
            biggestchar=map.firstKey();
           s1.append(map.firstKey());
            map.put(map.firstKey(),map.get(map.firstKey())-1);
            if(map.get(map.firstKey())<2){
                map.remove(map.firstKey());
            }
            
        } else{
            s1.append(biggestchar);
            map.put(biggestchar,map.get(biggestchar)-1);
            if(map.get(biggestchar)<2){
                map.remove(biggestchar);
            }
        }
        //check for 0 i guess
        if(map.size()==0||map.lastKey()=='0'){
            return  s1.toString();
        }
        
        if(biggestchar==map.lastKey()&&biggestchar==map.firstKey()){
             s1.append(biggestchar);
                
                map.put(biggestchar,map.get(biggestchar)-1);
        }
        Set<Character> keySet2 = map.keySet();
        
        for (char key : keySet2) {
            while(map.get(key)>=2){
                 s1.append(key);
                s1.insert(0,key);
                map.put(key,map.get(key)-2);
            }
           
        }
        //System.out.println(s1.toString());
        //System.out.println(s1.toString().length());
        return s1.toString();
        
    }
}