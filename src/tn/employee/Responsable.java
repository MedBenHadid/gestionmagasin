package tn.employee;

public class Responsable extends Employee {
    private float prime;

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    public float calculerSalaire(){
        if (this.getNbr_heures()>160) {
            return ((160+this.prime)*10+(getNbr_heures()-160*12));
        } else {
            return (this.getNbr_heures()*10);
        }

    }

    public Responsable(int id, String nom, String adresse, float nbr_heures, float prime) {
        super(id, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable{" +
                "prime=" + prime +
                "} " + super.toString();
    }
}
