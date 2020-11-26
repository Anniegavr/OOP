package oop;

public class A {
    protected String A;

    protected X x = new X("xxx");
    A(String _A, X _X){
        A = _A;
        x = _X;
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + A + "'|" + x.toString() +
                '}';
    }
}
//This was the initial code, before the harder level tasks
    /*protected A(){
        this.A = "This is class A. It's the most superior class. The big boss.";
    }
    protected void setLetter() {
        System.out.println(getA());
    }

    public String getA() {
        return A;
    }*/

