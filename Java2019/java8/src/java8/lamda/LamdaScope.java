package java8.lamda;

import java.util.function.Function;

public class LamdaScope {
    private LamdaScope() {
        Function<String, String> f1 = x -> {
            System.out.println(this);
            return x;
        };

        System.out.println(f1.apply("gao"));
    }

    @Override
    public String toString() {
        return "I am lamda acope";
    }

    public static void main(String[] args) {
        new LamdaScope();
    }
}
