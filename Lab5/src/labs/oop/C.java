package oop;

public class C extends B {
    protected String C;

    C(String _A, X _X) {
        super(_A, _X);
        C = _A;
    }

    @Override
    public String toString() {
        return "C{" +
                "C ='" + C + '\'' +
                "}\n" + super.toString();
    }

//This was the original code, before the higher-level tasks
   /* protected C(){
        this.C = "This is class C, a subclass of class B;";
    }
    @Override
    protected void setLetter() {
        System.out.println(getC());
    }
    public String getC() {
        return C;
    }*/
}
