package oop;

public class D extends oop.C {
    protected String D;

    protected X x = new X("696969");

    D(String _A, X _X) {
        super(_A, _X);
        D = _A;
    }

    @Override
    public String toString() {
        return "D{" +
                "D ='" + D + "'|"  + x.toString() +
                "}\n" + super.toString();
    }
    //Code written before higher-level tasks
   /* protected D(){
        this.D = "This is class D, a subclass of class C;";
    }
    @Override
    protected void setLetter() {
        System.out.println(getD());
    }
    public String getD() {
        return D;
    }
*/
}
