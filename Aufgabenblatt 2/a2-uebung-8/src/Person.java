
public abstract class Person {
    private String name;
    private String vorname;
    public Person(String name, String vorname){
        this.name = name;
        this.vorname = vorname;
    }

    protected boolean equals(Person p){
        if(p == null)
            return false;
        return this.name.equals(p.name) && this.vorname.equals(p.vorname);
    }

    @Override
    public String toString() {
        return name+", "+vorname;
    }
}
