package oop;

public class E extends D {
    protected String E;

    E(String _A, X _X) {
        super(_A, _X);
        E = _A;
    }

    @Override
    public String toString() {
        return "E{" +
                "E ='" + E + '\'' +
                "}\n" + super.toString();
    }
    //Code written bfore higher-level tasks
   /* protected E(){
        this.E = "This is class E, a subclass of class D;";
    }
    @Override
    protected void setLetter() {
        System.out.println(getE());
    }
    public String getE() {
        return E;
    }*/
}
