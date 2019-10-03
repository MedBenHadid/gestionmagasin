package tn.employee;

public class Vendeur extends Employee {
    float taux_de_vente;

    public float getTaux_de_vente() {
        return taux_de_vente;
    }

    public void setTaux_de_vente(float taux_de_vente) {
        this.taux_de_vente = taux_de_vente;
    }

    public float calculerSalaire(){
        return this.taux_de_vente*450;
    }

    public Vendeur(int id, String nom, String adresse, float nbr_heures, float taux_de_vente) {
        super(id, nom, adresse, nbr_heures);
        this.taux_de_vente = taux_de_vente;
    }
}
