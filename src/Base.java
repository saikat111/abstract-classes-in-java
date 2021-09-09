abstract class Base {
    Base()
    {
        System.out.println("Base Constructor Called");
    }
    abstract void fun();
    void print(){
        System.out.println("Base class body");
    }
}
class A extends Base {
    A()
    {
        System.out.println("A Constructor Called");
    }
    void fun(){
        System.out.println("A fun() called");
    }

}
class Main{
    public static  void main(String args[]){
        A a = new A();
        a.fun();
        a.print();
    }
}