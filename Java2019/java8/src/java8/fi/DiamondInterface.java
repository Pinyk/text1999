package java8.fi;

interface InterfaceA{
    void doSomething();
}

interface InterfaceB{
    void doSomething();
}

interface InterfaceC extends InterfaceA,InterfaceB{
    void doSomething();
}

public class DiamondInterface implements InterfaceA,InterfaceB,InterfaceC{
    @Override
    public void doSomething(){
        System.out.println("AAAAAA");
    }

    public static void main(String[] args) {
        InterfaceA obja = new DiamondInterface();
        InterfaceB objb = new DiamondInterface();
        InterfaceC objc = new DiamondInterface();

        obja.doSomething();
        objb.doSomething();
        objc.doSomething();
    }
}
