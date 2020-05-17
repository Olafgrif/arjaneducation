public class Medewerker extends Persoon {

    public String medewerkerId;

    public Medewerker(int hoogte, String medewerkerId) {
        super(hoogte);
        this.medewerkerId = medewerkerId;
    }

    public Medewerker() {
        super("anonieme medewerker", 150);
        this.medewerkerId = "1a";
    }

}