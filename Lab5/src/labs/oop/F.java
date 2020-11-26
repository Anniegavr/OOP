package oop;

public class F extends E {
    protected String F;

    F(String _A, X _X) {
        super(_A, _X);
        F = _A;
    }

    @Override
    public String toString() {
        return "F{" +
                "F ='" + F + '\'' +
                "}\n" + super.toString();
    }
    //This was the original code, before the higher-level tasks
    /*protected F(){
        this.F = "This is class F, a subclass of class E;";
    }
    @Override
    protected void setLetter() {
        System.out.println(getF());
    }
    public String getF() {
        return F;
    }*/
}
