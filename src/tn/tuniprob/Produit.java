package tn.tuniprob;

import java.util.Date;

public class Produit {
    private int id;
    private String libelle,marque;
    private float prix;
    private Date date;

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return this.prix;
    }

    public void setPrix(float prix) {
        if(prix>0)
            this.prix = prix;
        else
            System.out.println("Prix invalide");
    }
    public Produit(int id, String libelle, String marque, float prix, Date date) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.date = date;
    }

    public Produit (){}

    public void Afficher(){
        System.out.println("ID :"+this.id);
        System.out.println("Libelle :" +this.libelle);
        System.out.println("Marque :" +this.marque);
        System.out.println("Prix :"+this.prix);
        System.out.println("Date :"+this.date);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", libelle='" + getLibelle() + "'" +
                ", marque='" + getMarque() + "'" +
                ", prix='" + getPrix() + "'" +
                ", Date='" + getDate() + "'" +
                "}";
    }

    public boolean comparer(Produit p){
        return p.equals(this);
    }

    public static boolean comparer (Produit p, Produit p2){
        return p.equals(p2);
    }
}