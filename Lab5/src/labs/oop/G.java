package oop;

public class G extends F {
    protected String G;

    G(String _A, X _X) {
        super(_A, _X);
        G = _A;
    }

    @Override
    public String toString() {
        return "G{" +
                "G ='" + G + '\'' +
                "}\n" + super.toString();
    }
    //This was the original code, before the higher-level tasks
    /*protected G(){
        this.G = "This is class G, a subclass of class F;";
    }
    @Override
    protected void setLetter() {
        System.out.println(getG());
    }
    public String getG() {
        return G;
    }*/
}

