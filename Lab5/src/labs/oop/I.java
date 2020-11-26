package oop;

public class I extends H {
    protected String I;
    I(String _A, X _X) {
        super(_A, _X);
        I = _A;
    }

    @Override
    public String toString() {
        return "I{" +
                "I ='" + I + '\'' +
                "}\n" + super.toString();
    }
    //This was the original code, before the higher-level tasks
    /*protected I(){
        this.H = "This is class I, a subclass of class H;";
    }
    @Override
    protected void setLetter() {
        System.out.println(getI());
    }
    public String getI() {
        return I;
    }*/
}
