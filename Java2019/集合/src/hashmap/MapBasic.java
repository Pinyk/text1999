package hashmap;

import java.util.*;

public class MapBasic {
    public static void main(String[] args) {
        Map<String,String> data = new HashMap <>();
        data.put("A","D");
        data.put("B","F");
        data.put("C","G");
        data.put("D","H");
        data.put(null,"E");

        System.out.println(data);

        String b = data.getOrDefault("X","not exist");
        System.out.println(b);

        String c = data.get(null);
        System.out.println(c);

        boolean isExist = data.containsKey("X");
        System.out.println(isExist);


        Set<Map.Entry<String,String>> entrySet = data.entrySet();//
        System.out.println(entrySet);
        System.out.println(entrySet.size());

        Map<String,String> back = new HashMap <>();
        back.putAll(data);
        System.out.println(back);

        String nullValue = data.remove(null);
        System.out.println(nullValue);
        System.out.println(data);

        Set<String> keyset = data.keySet();
        System.out.println(keyset);

        Collection<String> valueSet = data.values();
        System.out.println(valueSet);
    }
}
