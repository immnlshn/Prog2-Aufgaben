public class Student extends Person{
    private int matrikelnummer;

    public Student(String name, String vorname, int matrikelnummer){
        super(name, vorname);
        this.matrikelnummer = matrikelnummer;
    }

    public boolean equals(Student s){
        return super.equals(s) && this.matrikelnummer == s.matrikelnummer;
    }

    public int getMatrikelnummer(){
        return matrikelnummer;
    }

    @Override
    public String toString() {
        return super.toString()+" "+matrikelnummer;
    }


}
