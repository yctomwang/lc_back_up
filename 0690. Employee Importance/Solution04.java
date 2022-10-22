/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 65.10 %
    Runtime : 9 ms
    Memory Usage : 54.5 MB
    Testcase : 102 / 102 passed
    Ranking : 
        Your runtime beats 77.56 % of java submissions.
        Your memory usage beats 84.36 % of java submissions.
}
*/

/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    int answer=0;
    Map<Integer,Employee> map;
    
    public int getImportance(List<Employee> employees, int id) {
        map = new HashMap<>();
        for(Employee employee: employees){
            map.put(employee.id,employee);
        }
        Employee entry_point = map.get(id);
        dfs(entry_point,id);
        return answer;

    }
    
    public int dfs(Employee root, int target_id){
        
        //exit out of recursion
        if(root.subordinates==null) return 0;
        
        int total = root.importance;
        
        for(int i=0;i<root.subordinates.size();i++){
            total+=dfs(map.get(root.subordinates.get(i)),target_id);
        }
        if(root.id==target_id){answer = total;}
        return total;
        
    }
    
    
}