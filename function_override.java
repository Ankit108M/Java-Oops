class A{
    void money(){
        System.out.println("Money+car");
    }
    void wife(){
        System.out.println("preeti");
    }
}
class B extends A{
    void wife(){
        System.out.println("priyanka"); //function over_ride in java:
    }
}
public class function_override {
    public static void main(String[] arg){
        B b = new B();
        b.wife();
        b.money();
        A a = new A();
        a.money();
        a.wife();
    }
}
