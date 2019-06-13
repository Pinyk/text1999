package collection.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListForEach {
    public static void main(String[] args) {
        List<String> stocks = new ArrayList <>();
        stocks.add("aaa");
        stocks.add("ss");
        stocks.add("dd");
        stocks.add("ff");

        Consumer<Object> consumer = new ListForEach().new MyConsumer();

        stocks.forEach(consumer);
    }

    class MyConsumer implements Consumer<Object>{
        @Override
        public void accept(Object o) {
            System.out.println("processing: "+ o);
        }
    }
}
