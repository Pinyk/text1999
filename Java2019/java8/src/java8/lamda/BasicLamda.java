package java8.lamda;




public class BasicLamda {
    private static void engine(Calculator calculator){
        int x = 2, y = 4;
        int result = calculator.calculate(x,y);
        System.out.println(result);
    }

    private static Calculator generate(){
        return (x, y) -> y / x;//lamda表达式可以作为返回的参数
    }


    public static void main(String[] args) {
        //Calculator calculator = (x,y) -> x + y;
        //engine(calculator);相当于下面
        engine((x, y) -> x + y);
        engine(generate());

        Calculator c1 = generate();
        System.out.println(c1.calculate(3,10));
    }
}
