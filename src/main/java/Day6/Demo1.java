package Day6;

public class Demo1 {
    public void m1(){
        System.out.println(" class Demo 1- Method Called ");
    }
}
class Demo2 extends Demo1  {
    public void m1(){
        System.out.println(" class Demo 2- Method Called ");
    }
}

class Demo03 extends Demo2  {
    public void m1(){
        System.out.println(" class Demo 03- Method Called ");
    }
}