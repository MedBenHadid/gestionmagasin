package tn.employee;

public class Caissier extends Employee {
    public float calculerSalaire(){
        if (this.getNbr_heures()>180){
            return 8;
        }else{
            return (float) (Math.floor(this.getNbr_heures())*5);
        }
    }

    public Caissier(int id, String nom, String adresse, float nbr_heures) {
        super(id, nom, adresse, nbr_heures);
    }

    @Override
    public String toString() {
        return "Caissier " + super.toString();
    }
}
