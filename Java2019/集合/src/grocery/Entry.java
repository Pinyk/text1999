package grocery;

public class Entry {

    private static Grocery grocery = new Grocery();

    public static void main(String[] args) {
        grocery.addItem("huawei");
        grocery.addItem("desk");
        grocery.addItem("cheery");
        grocery.addItem("pen");


        System.out.println(grocery.total());

        grocery.delItem(2);
        grocery.delItemtwo("pen");

        grocery.modifyItem(0,"xiaomi");

        grocery.findItem("cheery");

        System.out.println("cheery");

        System.out.println(grocery.total());
    }
}
