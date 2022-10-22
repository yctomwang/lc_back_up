/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 43.22 %
    Runtime : 1150 ms
    Memory Usage : 282.7 MB
    Testcase : 29 / 29 passed
    Ranking : 
        Your runtime beats 47.21 % of java submissions.
        Your memory usage beats 22.86 % of java submissions.
}
*/

class WordDictionary {
    Trinode root = new Trinode();
    
    public WordDictionary() {
        
    }
    
    public void addWord(String word) {
        Trinode node = root;
        for(char c: word.toCharArray()){
            if(node.children[c-'a']==null){
                node.children[c-'a']= new Trinode();
            }
            node = node.children[c-'a'];
        }
        node.isWord=true;
    }
    
    public boolean search(String word) {
        return recursion(word,0,root);
        
    }
    
    public boolean recursion(String word, int pos, Trinode node){
        //exit to recursion
        if(pos==word.length()){
            return node.isWord;
        }
        char character = word.charAt(pos);
        //check for not the general case of '.'
        if(character!='.'){
            if(node.children[character-'a']==null){
                return false;
                
            }
            else{
               return recursion(word,pos+1,node.children[character-'a']); 
            }
            
        }
        //brute foce all 26 possible combination
        for(int i=0;i<26;i++){
            if(node.children[i]!=null&&recursion(word,pos+1,node.children[i])){
                return true;
            }
        }
        
        return false;
        
        
    }
}


class Trinode{
    boolean isWord;
    Trinode[] children = new Trinode[26];
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */