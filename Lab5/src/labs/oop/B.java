package oop;

public class B extends A {
    protected String B;

    B(String _A, X _X) {
        super(_A, _X);
        B = _A;
    }

    public String toString() {
        return "B{" +
                "B='" + B + '\'' +
                "}\n" + super.toString();
    }
}
//This was the initial code, before the higher-level tasks
   /* protected B(){
        this.B = "This is class B, a subclass of class A;";
    }
    @Override
    protected void setLetter() {
        System.out.println(getB());
    }
    public String getB() {
        return B;
    }
} */
