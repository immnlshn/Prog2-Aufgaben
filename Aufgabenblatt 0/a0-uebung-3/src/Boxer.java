public class Boxer extends Person{
    private int gewicht;

    public Boxer(String name, String vorname, int gewicht){
        super(name, vorname);
        this.gewicht = gewicht;
    }

    public boolean equals(Boxer b){
        return super.equals(b) && this.gewicht == b.gewicht;
    }

    public int getGewicht(){
        return gewicht;
    }

    @Override
    public String toString() {
        return super.toString()+" "+gewicht;
    }
}
