/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 61.75 %
    Runtime : 47 ms
    Memory Usage : 46.4 MB
    Testcase : 73 / 73 passed
    Ranking : 
        Your runtime beats 26.56 % of java submissions.
        Your memory usage beats 28.01 % of java submissions.
}
*/

class Solution {
    //O(26*n)
    //aaaaaaaaaaaaAyY
    //aA
    public String longestNiceSubstring(String s) {

        int start = 0;
        int lengthAns = 0;

        for (int unique = 1; unique <= 26; unique++) {
            Map<Character, Integer> windowUp = new HashMap<>();
            Map<Character, Integer> windowLow = new HashMap<>();
            //Aa
            
            //this is the counter that stores how many valid pairs we have
            int complete = 0;
            int varity = 0;
            int left = 0;
            for (int i = 0; i < s.length(); i++) {
                char curr = s.charAt(i);
                if (Character.isUpperCase(curr) == true) {
                    char lowercurr = Character.toLowerCase(curr);
                    //if both exists in window and curris 1 and loweercase is 1 or larger
                    windowUp.put(curr, windowUp.getOrDefault(curr, 0) + 1);
                    if (windowUp.getOrDefault(curr, 0) == 1 && windowLow.getOrDefault(lowercurr, 0) > 0) {
                        complete++;
                    }
                    //if one exists and one dont, then varity ++
                    else if (windowUp.getOrDefault(curr, 0) == 1 && windowLow.getOrDefault(lowercurr, 0) == 0) {
                        varity++;
                    }


                    //out
                    while (varity > unique) {
                        char remove = s.charAt(left);
                        if (Character.isUpperCase(remove) == true) {
                            char lowRemove = Character.toLowerCase(remove);
                            if (windowUp.getOrDefault(remove, 0) == 1 && windowLow.getOrDefault(lowRemove, 0) > 0) {
                                complete--;

                            } else if (windowUp.getOrDefault(remove, 0) == 1 && windowLow.getOrDefault(lowRemove, 0) == 0) {
                                varity--;
                            }
                            windowUp.put(remove, windowUp.getOrDefault(remove, 0) - 1);
                            if (windowUp.getOrDefault(remove, 0) == 0) {
                                windowUp.remove(remove);
                            }


                        } else {
                            char upperRemove = Character.toUpperCase(remove);
                            if (windowLow.getOrDefault(remove, 0) == 1 && windowUp.getOrDefault(upperRemove, 0) > 0) {
                                complete--;

                            } else if (windowLow.getOrDefault(remove, 0) == 1 && windowUp.getOrDefault(upperRemove, 0) == 0) {
                                varity--;
                            }
                            windowLow.put(remove, windowLow.getOrDefault(remove, 0) - 1);
                            if (windowLow.getOrDefault(remove, 0) == 0) {
                                windowLow.remove(remove);
                            }
                        }
                        left++;
                    }
                    //calculate
                    if ((i - left + 1) > lengthAns && complete == varity) {
                        lengthAns = i - left + 1;
                        start = left;
                    }


                } else {
                    char uppercurr = Character.toUpperCase(curr);

                    //if both exists in window and curris 1 and loweercase is 1 or larger
                    windowLow.put(curr, windowLow.getOrDefault(curr, 0) + 1);
                    if (windowLow.getOrDefault(curr, 0) == 1 && windowUp.getOrDefault(uppercurr, 0) > 0) {
                        complete++;
                    }
                    //if one exists and one dont, then varity ++
                    else if (windowLow.getOrDefault(curr, 0) == 1 && windowUp.getOrDefault(uppercurr, 0) == 0) {
                        varity++;
                    }
                    //windowLow.put(curr, windowLow.getOrDefault(curr, 0) + 1);

                    //out
                    while (varity > unique) {
                        char remove = s.charAt(left);
                        // System.out.println(remove);
                        // System.out.println(windowUp.get(remove));
                        if (Character.isUpperCase(remove) == true) {
                            char lowRemove = Character.toLowerCase(remove);
                            if (windowUp.getOrDefault(remove, 0) == 1 && (windowLow.getOrDefault(lowRemove, 0) > 0)) {
                                complete--;

                            } else if (windowUp.getOrDefault(remove, 0) == 1 && windowLow.getOrDefault(lowRemove, 0) == 0) {
                                varity--;
                            }
                            windowUp.put(remove, windowUp.getOrDefault(remove, 0) - 1);
                            if (windowUp.getOrDefault(remove, 0) == 0) {
                                windowUp.remove(remove);
                            }


                        } else {
                            char upperRemove = Character.toUpperCase(remove);
                            if (windowLow.getOrDefault(remove, 0) == 1 && windowUp.getOrDefault(upperRemove, 0) > 0) {
                                complete--;

                            } else if (windowLow.getOrDefault(remove, 0) == 1 && windowUp.getOrDefault(upperRemove, 0) == 0) {
                                varity--;
                            }
                            windowLow.put(remove, windowLow.getOrDefault(remove, 0) - 1);
                            if (windowLow.getOrDefault(remove, 0) == 0) {
                                windowLow.remove(remove);
                            }
                        }
                        left++;
                    }
                    //calculate
                    if ((i - left + 1) > lengthAns && complete == varity) {
                        lengthAns = i - left + 1;
                        start = left;
                    }

                }


            }
        }



        //substr = str.substring(8, 17);
        if (lengthAns == 0) {
            return "";
        }
        String substr = "";


        substr = s.substring(start, start + lengthAns);
        return substr;
    }
}