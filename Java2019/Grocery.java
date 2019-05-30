package grocery;

import java.util.ArrayList;
import java.util.List;

public class Grocery {
    List<String> grocery = new ArrayList<>();

    public void listAll() {
        System.out.println("You have" + grocery.size() + "items");
        for(String item : grocery){
            System.out.println(item);
        }
    }

    public void addItem(String item){
        grocery.add(item);
        System.out.println(item+"added");
    }

    public void delItem(int position){
        System.out.println(grocery.get(position)+"removed");
        grocery.remove(position);
    }

    public void delItemtwo(String item){
        grocery.remove(item);
        System.out.println(item+"removed");
    }

    public void modifyItem(int position,String item){
        System.out.println(grocery.get(position)+"modified to"+item);
        grocery.set(position,item);
    }

    public String findItem(String item){
        if(grocery.contains(item)){
            int position = grocery.indexOf(item);
            System.out.println(item+"found");
            return grocery.get(position);
        }
        System.out.println(item + "not found");
        return null;
    }

    public int total(){
        return grocery.size();
    }

    @Override
    public String toString(){
        return grocery.toString();
    }
}