package hashmap;

import java.util.*;

public class Simple {
    public static void main(String[] args) {
        Map<String, List<String>> dict = new HashMap<>();

        Svic(dict);

        Push(dict);
    }

    private static void Push(Map <String, List <String>> dict) {
        Iterator<Map.Entry<String,List<String>>> idict =
                dict.entrySet().iterator();
        String strDict = "";
        while(idict.hasNext()){
            Map.Entry<String,List<String>> entryList = idict.next();
            String key = entryList.getKey();
            List<String> valueList = entryList.getValue();

            strDict = strDict+key+":[";
            for(String word : valueList){
                strDict = strDict+word+" ";
            }
            strDict = strDict+"]";
        }
        System.out.println(strDict);
    }

    private static void Svic(Map <String, List <String>> dict) {
        List<String> listA = new ArrayList<>();
        listA.add("apple");
        listA.add("add");
        listA.add("about");
        listA.add("ajax");
        dict.put("A",listA);

        List<String> listB = new ArrayList <>();
        listB.add("bar");
        listB.add("bat");
        listB.add("bite");
        listB.add("bye");
        dict.put("B",listB);

        List<String> listC = new ArrayList <>();
        listC.add("cat");
        listC.add("circle");
        listC.add("car");
        listC.add("chocolate");
        dict.put("C",listC);
    }
}
