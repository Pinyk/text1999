package grocery;

import java.util.Optional;
import java.util.Scanner;

public class Operator {
    private static Scanner scanner = new Scanner(System.in);
    private Grocery grocery;

    public Operator(Grocery grocery) {
        this.grocery = grocery;
    }

    public void printInstructions(){
        System.out.println("0. Instructions" +
                "1. List Items" +
                "3. Modify Item" +
                "4.Remove Item"+
                "5. Search Item"+
                "6. quit");
    }
    public void waitingForinput(){
        boolean quit = false;
        int choice = 0;
        while(!quit){
            System.out.println("Enter your ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    grocery.listAll();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modify();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        }
    }

    private void findItem() {
        System.out.println("tianjia");
        String item = scanner.nextLine();
        grocery.findItem(item);
    }

    private void deleteItem() {
        System.out.println("enter the position");
        int position = scanner.nextInt();
        scanner.nextLine();
        grocery.delItem(position-1);
    }

    private void modify() {
        System.out.println("Enter the position");
        int position = scanner.nextInt();
        if(position>grocery.total()){
            System.out.println("error");
        }else{
            System.out.println("enter new item");

            String item = scanner.next();
            grocery.modifyItem(position-1,item);
        }


    }

    private void addItem() {
        System.out.println("Enter the item:");
        grocery.addItem(scanner.nextLine());
    }


    public static void main(String[] args) {
        Grocery grocery = new Grocery();
        Operator operator = new Operator(grocery);
        operator.printInstructions();
        operator.waitingForinput();
    }
}
