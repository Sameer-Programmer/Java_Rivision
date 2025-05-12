package Abstract_Package;

abstract  class ManualTesting
    {
    abstract public void planning();
    public void m1(){
        System.out.println("M1");
    }

    }


class Execution extends ManualTesting {
    public void planning (){
        System.out.println(" we have to develop the Test Plan  ");
    }
}



public class Test1 {
    public static void main(String[] args) {
        Execution execution = new Execution();
        execution.planning();
    }
}
