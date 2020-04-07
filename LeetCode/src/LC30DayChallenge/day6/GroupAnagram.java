package LC30DayChallenge.day6;


import java.util.*;

/*
*
* Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
* */
public class GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i=0;i<strs.length;i++) {

            char[] c1 = strs[i].toCharArray();
            Arrays.sort(c1);
            String c = new String(c1);
            if (map.containsKey(c)){
                map.get(c).add(strs[i]);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(c, temp);
            }

        }

        for (List<String> s : map.values()){
            result.add(s);
        }

        return result;
    }




}
