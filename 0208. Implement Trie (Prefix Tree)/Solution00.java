/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.72 %
    Runtime : 81 ms
    Memory Usage : 66.6 MB
    Testcase : 16 / 16 passed
    Ranking : 
        Your runtime beats 57.71 % of java submissions.
        Your memory usage beats 75.05 % of java submissions.
}
*/

class Trie {
    Trinode root;
    public Trie() {
        root = new Trinode();
    }
    
    public void insert(String word) {
        Trinode node = root;
        for(char c: word.toCharArray()){
            //if we dont have 
            if(node.children[c-'a']==null){
                node.children[c-'a'] = new Trinode();
            }
            node=node.children[c-'a'];
        }
        node.isWord = true;
    }
    
    public boolean search(String word) {
        Trinode node = root;
        for(char c: word.toCharArray()){
            if(node.children[c-'a']==null){
                return false;
            }
            node= node.children[c-'a'];
        }
        return node.isWord;
    }
    
    public boolean startsWith(String prefix) {
        Trinode node = root;
        for(char c: prefix.toCharArray()){
            if(node.children[c-'a']==null){
                return false;
            }
            node = node.children[c-'a'];
        }
        return true;
    }
}

class Trinode{
    Trinode[] children;
    boolean isWord;
    public Trinode(){
        children = new Trinode [26];
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */