package oop;

public class J extends I {
    protected String J;

    J(String _A, X _X) {
        super(_A, _X);
        J = _A;
    }

    @Override
    public String toString() {
        return "J{" +
                "J ='" + super.I + '\'' +
                "}\n" + super.toString();
    }
    /*
    protected J(){
       // super(A, _X);
        //this.J = A;
        this.J = "This is class J, a subclass of class I;";
    }
    @Override
    protected void setLetter() {

        System.out.println(getJ());
    }
    public String getJ() {
        return J;
    }*/

    public static void main(String[] args) {
        J j = new J("J", new X("J"));
        System.out.println(j);
    }
}
