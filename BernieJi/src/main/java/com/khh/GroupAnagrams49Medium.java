package com.khh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String strr = String.valueOf(ch);
            if(!map.containsKey(strr)) {
            	map.put(strr,new ArrayList<String>());
            	map.get(strr).add(str);
            }else{
                  map.get(strr).add(str); 
            }
        }
    return new ArrayList<>(map.values());    
    }
}
