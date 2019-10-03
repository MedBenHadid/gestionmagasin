package tn.tuniprob;


import tn.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Magasin {
    public List<Produit> produits = new ArrayList<Produit>();
    private List<Employee> employees = new ArrayList<Employee>();
    private int id, capacite;
    private String nom,adresse;

    public static Magasin supProd(Magasin mag1, Magasin mag2) {
        if (mag1.produits.size() > mag2.produits.size())
            return mag1;
        else return mag2;
    }

    public void add(Produit p) {
        if (this.produits.size() < 49)
            this.produits.add(p);
        else
            System.out.println("Capacité atteinte !");
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        if (capacite > 0 && capacite <= 50) this.capacite = capacite;
        else System.out.println("Capacité invalide");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void supprimer(Produit p) {
        this.produits.removeIf(produits -> Produit.comparer(p, produits));
    }

    public boolean chercher(Produit p) {
        return this.produits.contains(p);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployees (Employee employee){
        if (this.employees.size()<20)
            this.employees.add(employee);
        else
            System.out.println("Nombre maximum des employées atteint");
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", capacite='" + getCapacite() + "'" + ", adresse='" + getAdresse() + "'" + ", produits = '" + produits.toString() + "''" + "}";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Magasin(int id, String nom , String adresse , int capacite ) {
        this.id = id;
        this.nom = nom;
        this.capacite = capacite;
        this.adresse = adresse;
    }
}
