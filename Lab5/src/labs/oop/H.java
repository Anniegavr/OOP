package oop;

public class H extends G {
    protected String H;

    H(String _A, X _X) {
        super(_A, _X);
        H = _A;
    }

    @Override
    public String toString() {
        return "H{" +
                "H ='" + H + '\'' +
                "}\n" + super.toString();
    }
    //This was the original code, before the higher-level tasks
    /*protected H(){
        this.H = "This is class H, a subclass of class G;";
    }
    @Override
    protected void setLetter() {
        System.out.println(getH());
    }
    public String getH() {
        return H;
    }*/
}
