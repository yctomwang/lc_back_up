/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 46.72 %
    Runtime : 35 ms
    Memory Usage : 62.9 MB
    Testcase : 66 / 66 passed
    Ranking : 
        Your runtime beats 27.73 % of java submissions.
        Your memory usage beats 29.43 % of java submissions.
}
*/

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    //two pointer approach
    
    //heap asking for top k
        
    //START WITH INT X
    //work 2 directions and add everything, then return in some kind of order
        
        
    List<Integer> answer = new ArrayList<>();
     //deal with corner cases
    if(x<arr[0]||x>arr[arr.length-1]){
        if(x<arr[0]){
            for(int i=0;i<k;i++){
                answer.add(arr[i]);
            }
            return answer;
        }else{
            for(int i=arr.length-k;i<arr.length;i++){
                answer.add(arr[i]);
            }
            return answer;
        }
    }
    if(arr.length==1){
        answer.add(arr[0]);
        return answer;
    }
    //find the location of X or something that the most close to it 
    
    int left=0;
    int right = arr.length-1;
    while(left<=right){
        int mid = left+(right-left)/2;
        
        if(arr[mid]<x){
            left=mid+1; 
        }
        else{
            right=mid-1;
        }
    }
        
     // System.out.println("left"+left);
     // System.out.println("right"+right);
    int startidx=left;
    //check for the out of bounds;   
    if(left>arr.length-1){
        startidx=right;
    }
    if(right<0){
        startidx=left;
    } 
    if(arr[left]==x){
        startidx=left;
    }else{
        if(left<=arr.length-1&&right>=0){
            int leftdifference = Math.abs(arr[left]-x);
            int rightdifference = Math.abs(arr[right]-x);
            if(leftdifference==rightdifference){
                startidx=right;
                
            }else if(leftdifference<rightdifference){
                startidx=left;
            }
            else if(rightdifference<leftdifference){
                startidx=right;
            }
        }
        
    } 
    
    
    
     //System.out.println(startidx);
    //answer is left or right pointer
    boolean leftflag=true;
    boolean rightflag=true;
    int leftpointer=startidx-1;
    int rightpointer= startidx+1;
    if(leftpointer<0){
            leftflag=false;
        }
    if(rightpointer>arr.length-1){
            rightflag=false;
    }
    answer.add(arr[startidx]);
    k--;
    while(k>0){
        if(leftflag&&rightflag){
            int left_val=arr[leftpointer];
            int right_val = arr[rightpointer];
            int leftdifference = Math.abs(left_val-x);
            int rightdifference = Math.abs(right_val-x);
            if(leftdifference==rightdifference){
                answer.add(0,arr[leftpointer]);
            k--;
            leftpointer--;
                
            }else if(leftdifference<rightdifference){
                answer.add(0,arr[leftpointer]);
            k--;
            leftpointer--;
            }
            else if(rightdifference<leftdifference){
                 answer.add(arr[rightpointer]);
            k--;
            rightpointer++;
            }
        }
        else if(leftflag){
            answer.add(0,arr[leftpointer]);
            k--;
            leftpointer--;
        }
        else if(rightflag){
            answer.add(arr[rightpointer]);
            k--;
            rightpointer++;

        }
        if(leftpointer<0){
            leftflag=false;
        }
        if(rightpointer>arr.length-1){
            rightflag=false;
        }
    }
    return answer;
    
    }
}