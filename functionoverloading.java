class base{
    void function(){
        System.out.println("function without argument");
    }
    void function(int i ){
        System.out.println("function with integer argument " +i);
    }
    void function(float f ){
        System.out.println("function with float argument "+f);
    }
}
public class functionoverloading{
    public static void main(String [] arg){
        base b = new base();
        b.function();
        b.function(45);
        b.function(3.6f);
    }

}
