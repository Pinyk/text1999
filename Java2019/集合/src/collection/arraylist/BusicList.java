package collection.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BusicList {
    public static void main(String[] args) {
        List<String> vowels = new ArrayList <>();//定义用接口  后面用实现类
        vowels.add("A");
        vowels.add("I");
        vowels.add(1,"E");
        System.out.println(vowels);

        List<String> vowels1 = new ArrayList <>();//定义用接口  后面用实现类
        vowels1.add("O");
        vowels1.add("U");
        vowels.addAll(vowels1);
        vowels1.add("X");
        System.out.println(vowels);

        vowels1.clear();
        System.out.println(vowels1);

        vowels.set(2,"E");//替换
        System.out.println(vowels);

        vowels1 = vowels.subList(0,2);//左闭右开
        System.out.println(vowels1);
    }
}
