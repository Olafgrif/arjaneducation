public class Persoon {

    private String naam;
    private int hoogte;

    public Persoon(String naam, int hoogte) {
        this.naam = naam;
        this.hoogte = hoogte;
    }

    public Persoon(int hoogte) {
        //this.naam = "anoniem";
        this.hoogte = hoogte;
    }

    
    public String getNaam() {
        return this.naam;
    }

    public int getHoogte() {
        return this.hoogte;
    }

    public void setHoogte(int nieuweHoogte) {
        this.hoogte = nieuweHoogte;
    }

    @Override
    public String toString() {
        return "Persoon met naam " + this.naam + " en hoogte " + this.hoogte;
    }
}