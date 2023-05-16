public class PufferPaar {
    public static void main(String[] args) {
        Puffer<Paar<Student, String>> servicePoint = new SchlangeMitArray<Paar<Student, String >>(10);
        Puffer<Paar<Boxer, String>> boxEvent = new StapelMitArray<Paar<Boxer, String >>(10);
        servicePoint.insert(new Paar<Student, String>(new Student("Seibert", "Thomas", 187), "Wie komme ich ins Wlan?"));
        servicePoint.insert(new Paar<Student, String>(new Student("Müller", "Fritz", 420), "Kann ich mein Passwort zurücksetzen?"));
        servicePoint.insert(new Paar<Student, String>(new Student("Berry", "Peter", 6969), "Wie komme ich in LEA?"));
        servicePoint.insert(new Paar<Student, String>(new Student("Weil", "Hilde", 200), "Kann ich einen Computer haben?"));

        boxEvent.insert(new Paar<Boxer, String>(new Boxer("Ali", "Muhammad", 80), "Kampf gegen Joe Frazier"));
        boxEvent.insert(new Paar<Boxer, String>(new Boxer("Fury", "Tyson", 88), "Kampf gegen Deontay Wilder"));
        boxEvent.insert(new Paar<Boxer, String>(new Boxer("Mayweather", "Floyd", 77), "Kampf gegen Manny Pacquiao"));

        for(Paar<Student, String> p : ((SchlangeMitArray<Paar<Student, String>>) servicePoint).localStorage) {
            System.out.println(p);
        }

        for(Paar<Boxer, String> p : ((StapelMitArray<Paar<Boxer, String>>) boxEvent).localStorage) {
            System.out.println(p);
        }
    }
}
