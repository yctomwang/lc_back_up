/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 61.75 %
    Runtime : 4 ms
    Memory Usage : 6.1 MB
    Testcase : 73 / 73 passed
    Ranking : 
        Your runtime beats 91.47 % of cpp submissions.
        Your memory usage beats 93.39 % of cpp submissions.
}
*/


/*
class Solution {
public:
    string longestNiceSubstring(string s) {
        if(s.size()<2)return "";
        
        unordered_set<char> hmap(s.begin(), s.end()); // store all char
        
        for(int i=0; i<s.size(); ++i){
            // if corresponding upper or lower character not present we know it will
            // never be present in our answer substring
            if(hmap.find(toupper(s[i]))==hmap.end() || hmap.find(tolower(s[i]))==hmap.end()){
                string s1 = longestNiceSubstring(s.substr(0, i));
                string s2 = longestNiceSubstring(s.substr(i+1));
                return s1.size() >= s2.size() ? s1 : s2;
            }
        }
        
        return s; // whole string is the answer
    }
};

*/



class Solution {
public:
    string longestNiceSubstring(string s) {
        int maxLength=0,idx=0;
        int lowerCase,upperCase;
        for (int i=0;i<s.length();i++)
        {
            lowerCase=0;
            upperCase=0;
            for (int j=i;j<s.length();j++)
            {
                if (s[j]>='a')
                    lowerCase|=(1<<(s[j]-'a'));
                else 
                    upperCase|=(1<<(s[j]-'A'));
                if ((lowerCase^upperCase)==0)
                {
                    if (maxLength<j-i+1)
                    {
                        idx=i;
                        maxLength=j-i+1;
                    }
                }
            }
        }
        if (maxLength==0)
            return "";
        return s.substr(idx,maxLength);
    }
};
/*

In the ASCII TABLE :

Range of Capital letters |ââ : A to Z (from 65(A) to 90(Z))
Range of Cursive/ Small letters |ââ : a to z (from 97(a) to 122(z));


--------------------------------------------

class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        
      [Video Explanation](http://youtu.be/9bhW-i6-xP4)
        #1) sliding window
        #2) variable window
        
       
       
        def checknice(substring):
            
            return len(set(substring))//2 == len(set(substring.lower()))
        
        
       
        finalans = ''
        left = 0 
        right = len(s)
        
        while right > -1:
            
            while left <= right:
                
                substring = s[left:right]
                print(substring)
                
                ans = checknice(substring)
                
                if ans == True:
                    
                    if len(substring) >= len(finalans):
                        finalans = substring
                        
                left = left +1
            #reinitialise left  as left got incremented to the value of right with the nested loop
            left = 0 
            right = right - 1
            
        return finalans
        
        
        ---------------------------------------------
        
        class Solution:
    def longestNiceSubstring(self, s: str) -> str:
        if len(s) < 2: return ""
        chars = set(list(s))
        print(chars)
        for i in range(len(s)):
            if not (s[i].lower() in chars and s[i].upper() in chars):
                s1 = self.longestNiceSubstring(s[:i])
                s2 = self.longestNiceSubstring(s[i+1:])
                return s2 if len(s2) > len(s1) else s1  
        return s 
        
        -------------------------------------------
        
        class Solution {
public:
    string longestNiceSubstring(string s) {
        if(s.size()<2)return "";
        
        unordered_set<char> hmap(s.begin(), s.end()); // store all char
        
        for(int i=0; i<s.size(); ++i){
            // if corresponding upper or lower character not present we know it will
            // never be present in our answer substring
            if(hmap.find(toupper(s[i]))==hmap.end() || hmap.find(tolower(s[i]))==hmap.end()){
                string s1 = longestNiceSubstring(s.substr(0, i));
                string s2 = longestNiceSubstring(s.substr(i+1));
                return s1.size() >= s2.size() ? s1 : s2;
            }
        }
        
        return s; // whole string is the answer
    }
};
*/