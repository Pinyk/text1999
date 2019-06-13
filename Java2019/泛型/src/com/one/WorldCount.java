package com.one;

import java.util.HashMap;

public class WorldCount {

    public static void main(String[] args) {
        String sentence = "Hi Hello Hi hello syun hi hi";
        String[] words = sentence.split(" ");
        HashMap<String,Integer> mapStr = wordCount(words);
        System.out.println(mapStr);

        Integer nums[] = {1,2,3,4,3,3,6};
        HashMap<Integer,Integer> mapNum = wordCount(nums);
        System.out.println(mapNum);
    }


    private static <T>HashMap<T,Integer> wordCount(T group[]){
        HashMap<T,Integer> map = new HashMap <>();


        for(T member : group){
            if(map.get(member) == null){
                map.put(member,1);
            }else{
                map.put(member,map.get(member) + 1);
            }
        }
        return map;
    }
}
