package shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Shuffle {
    public static void main(String[] args) {
        String[] color = {"红桃", "黑桃", "方块", "梅花"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "1", "2"};
        HashMap<Integer, String> puker = new HashMap<Integer, String>();
        ArrayList<Integer> array = new ArrayList<Integer>();//发的牌 其实是序号
        int ans = 0;
        for(String s : number) {
            for(String str : color) {
                puker.put(ans, str+s);
                array.add(ans);
                ans++;
            }
        }
        puker.put(ans, "小王");
        array.add(ans);
        ans++;
        puker.put(ans, "大王");
        array.add(ans);
            //洗牌
        Collections.shuffle(array);

            //发牌，使用TreeSet集合，保证牌是按顺序的
        TreeSet<Integer> sa = new TreeSet<Integer>();
        TreeSet<Integer> sb = new TreeSet<Integer>();
        TreeSet<Integer> sc = new TreeSet<Integer>();
        TreeSet<Integer> sd = new TreeSet<Integer>();
        for(int i = 0; i < array.size(); i++) {
            if(i >= array.size()-3) {
                sd.add(array.get(i));
            }
            else if(i%3 == 0) {
                sa.add(array.get(i));
            }else if(i%3 == 1) {
                sb.add(array.get(i));
            }else if(i%3 == 2) {
                sc.add(array.get(i));
            }
        }
        printPuker("sa", sa, puker);
        printPuker("sb", sb, puker);
        printPuker("sc", sc, puker);
        printPuker("sd", sd, puker);
    }
    public static void printPuker(String name, TreeSet<Integer> p,
                                      HashMap<Integer, String> puker) {
            System.out.println(name+"的牌是：");
            for(Integer s : p) {
                System.out.print(puker.get(s)+" ");
            }
            System.out.println();
        }
    }
