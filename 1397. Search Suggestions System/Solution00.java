/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 66.66 %
    Runtime : 14 ms
    Memory Usage : 58.8 MB
    Testcase : 42 / 42 passed
    Ranking : 
        Your runtime beats 95.69 % of java submissions.
        Your memory usage beats 76.60 % of java submissions.
}
*/

class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> answer = new ArrayList<>();
        //sort nlogn
        Arrays.sort(products);
        int left=0;
        int right=products.length-1;
        for(int i=0;i<searchWord.length();i++){
            //run the alg inside here
            List<String> temp = new ArrayList<>();
            //double pointer running here
            char curr = searchWord.charAt(i);
            
            while(left<=right&&(products[left].length()<=i||products[left].charAt(i)!=curr)){
                left++;
            }
            while(left<=right&&(products[right].length()<=i||products[right].charAt(i)!=curr)){
                right--;
            }
            for(int j=left;j<=Math.min(left+2,right);j++){
                temp.add(products[j]);
            }
             
            answer.add(temp);
        }
       
        return answer;
    }
    
}



// class Trie{}


// class TriNode{}