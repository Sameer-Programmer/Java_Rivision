package NaveenReddy;
/*
We can Overload method -  I mean Same Name but it be will
differentiated by Parameters and Datatype
 */


public class Calcy {
    public void m1(int n1, int n2){
        System.out.println(n1+n2);
    }


    public void m1(int n1, int n2 , int n3){
        System.out.println(n1+n2+n3);
    }


    public void m1 (double n1 , double n2){
        System.out.println(n1+n2);
    }

}
