package tn.employee;

public class Employee {
    private int id;
    private String nom,adresse;
    private float nbr_heures;

    public Employee() {
    }

    public Employee(int id, String nom, String adresse, float nbr_heures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public float getNbr_heures() {
        return nbr_heures;
    }

    public void setNbr_heures(float nbr_heures) {
        this.nbr_heures = nbr_heures;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nbr_heures=" + nbr_heures +
                '}';
    }
}
