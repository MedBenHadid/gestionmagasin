package tn.tuniprob;


import tn.employee.Caissier;
import tn.employee.Responsable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input,choice;
        List<Magasin> magasins = new ArrayList<Magasin>();
        magasins.add(new Magasin(1,"Carrefour", "Centre-Ville",50));
        magasins.add(new Magasin (1,"Monoprix",  "Menzah 6", 50));
        do {
            System.out.println("1 : Ajouter produit !");
            System.out.println("2 : Afficher les produits !");
            System.out.println("3 : Chercher un produit !");
            System.out.println("4 : Supprimer un produit !");
            System.out.println("5 : Afficher le nombre totale des produits !");
            System.out.println("6 : Gestion des employées !");
            System.out.println("0 : Exit");
            do {
                input = sc.nextInt();
            } while (input > 6 || input < 0);

            switch (input) {
                case 0:
                    System.out.println("Exiting, later nerd");
                    break;
                case 1:
                    int id;
                    String libelle, marque;
                    float prix;
                    Date date ;
                    boolean f=false;
                    int i;
                    i=0;
                    for (Magasin mag : magasins ) {
                        System.out.println(i +" : "+ mag.getNom());
                        i++;
                    }
                    System.out.println("-1 : Back to main mennu");
                    do{
                        choice = sc.nextInt();
                    }while(choice>magasins.size()||choice<-1);
                    if (choice>-1){
                        System.out.println("Veuillez saisir l'id du produit :");
                        id = sc.nextInt();
                        for (Produit prod : magasins.get(choice).produits) {
                            if (prod.getId() == id) {
                                f=true;
                            }
                        }
                        if(!f){
                            System.out.println("Veuillez saisir le libelle :");
                            libelle = sc.next();
                            System.out.println("Veuillez saisir la marque:");
                            marque = sc.next();
                            System.out.println("Veuillez saisir le prix");
                            prix = sc.nextFloat();
                            System.out.println("Veuillez saisir l'année");
                            int year = sc.nextInt();
                            System.out.println("Veuillez saisir le mois");
                            int mois = sc.nextInt();
                            System.out.println("Veuillez saisir le jour");
                            int jour = sc.nextInt();
                            date = new Date(year-1900, mois, jour);
                            Produit prod = new Produit(id,libelle,marque,prix,date);
                            magasins.get(choice).produits.add(prod);
                        }else{
                            System.out.println("Produit déja inséré !!");
                        }
                    }else if (choice == -1)
                        break;


                case 2:
                    i=0;
                    for (Magasin mag : magasins ) {
                        System.out.println(i +" : "+ mag.getNom());
                        i++;
                    }
                    System.out.println("-1 : Back to main mennu");
                    do{
                        choice = sc.nextInt();
                    }while(choice>magasins.size()||choice<-1);
                    if (choice>-1){
                        System.out.println("-----------------------------------------");
                        for (Produit prod : magasins.get(choice).produits) {
                            System.out.println(prod.toString());
                        }
                        System.out.println("-----------------------------------------");
                    } else if (choice==-1){
                        break;
                    }
                    break;
                case 3:
                    boolean found;
                    int idx;
                    i=0;
                    for (Magasin mag : magasins ) {
                        System.out.println(i +" : "+ mag.getNom());
                        i++;
                    }
                    System.out.println("-1 : Back to main mennu");
                    do{
                        choice = sc.nextInt();
                    }while(choice>magasins.size()||choice<-1);
                    if (choice > -1){
                        System.out.println("Veuillez entrer l'identifiant du produit a chercher :");
                        idx = sc.nextInt();
                        found = false;
                        for (Produit prod : magasins.get(choice).produits) {
                            if(prod.getId()==idx){
                                System.out.println("-----------------------------------------");
                                System.out.println(prod.toString());
                                System.out.println("-----------------------------------------");
                                found=true;
                            }
                        }
                        if(!found)
                            System.out.println("Produit introuvable");
                        break;
                    } else if (choice == -1){
                        break;
                    }
                case 4:
                    int ids;
                    i=0;
                    for (Magasin mag : magasins ) {
                        System.out.println(i +" : "+ mag.getNom());
                        i++;
                    }
                    System.out.println("-1 : Back to main mennu");
                    do{
                        choice = sc.nextInt();
                    }while(choice>magasins.size()||choice<-1);
                    if (choice > -1){
                        found=false;
                        System.out.println("Veuillez entrer l'identifiant du produit supprimer :");
                        ids = sc.nextInt();
                        for (Produit prod : magasins.get(choice).produits) {
                            if(prod.getId()==ids){

                                System.out.println("-----------------------------------------");
                                System.out.println("Produit supprimé");
                                System.out.println("-----------------------------------------");
                                found=true;
                            }
                        }
                        if(!found)
                            System.out.println("Produit introuvable!");
                        break;
                    }else if (choice==-1){
                        break;
                    }
                case 5:
                    i=0;
                    int total = 0;
                    for (Magasin mag : magasins ) {
                        System.out.println("Nombre totale des produits dans "+magasins.get(i).getNom()+":"+magasins.get(i).produits.size());
                        total = total + magasins.get(i).produits.size();
                        i++;
                    }
                    System.out.println("Nombre totale des produits "+total);

                    break;
                case 6:
                    // TODO : Ajout des employés et affichage des salaires
                    int gest;
                    String nom,adresse;
                    float nbr_heures;
                    i=0;
                    for (Magasin mag : magasins ) {
                        System.out.println(i +" : "+ mag.getNom());
                        i++;
                    }
                    System.out.println("-1 : Back to main mennu");
                    do{
                        choice = sc.nextInt();
                    }while(choice>magasins.size()||choice<-1);

                    if (choice > -1){
                        System.out.println("1 : Ajouter un Caissier ");
                        System.out.println("2 : Ajouter un Responsable ");
                        System.out.println("3 : Ajouter un Vendeur ");
                        System.out.println("4 : Afficher le salaire des employées");
                        System.out.println("5 : Afficher les employées");
                        do{
                            gest = sc.nextInt();
                        }while(gest<1||gest>5);
                        switch (gest){
                            case 1:
                                System.out.println("Veuillez saisir lidentifiant :");
                                id = sc.nextInt();
                                System.out.println("Veuillez saisir le nom :");
                                nom = sc.next();
                                System.out.println("Veuillez saisir l'adresse :");
                                adresse = sc.next();
                                System.out.println("Veuillez saisir le nombre d'heures travaillé :");
                                nbr_heures = sc.nextFloat();
                                magasins.get(choice).addEmployees(new Caissier(id,nom,adresse,nbr_heures));
                                break;
                            case 2:
                                float prime;
                                System.out.println("Veuillez saisir lidentifiant :");
                                id = sc.nextInt();
                                System.out.println("Veuillez saisir le nom :");
                                nom = sc.next();
                                System.out.println("Veuillez saisir l'adresse :");
                                adresse = sc.next();
                                System.out.println("Veuillez saisir le nombre d'heures travaillé :");
                                nbr_heures = sc.nextFloat();
                                System.out.println("Veuillez saisir la prime :");
                                prime = sc.nextFloat();
                                magasins.get(choice).getEmployees().add(new Responsable(id,nom,adresse,nbr_heures,prime));
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                System.out.println(""+magasins.get(choice).getEmployees().toString());
                                break;
                            default:break;
                        }
                        break;
                    }else if (choice==-1){
                        break;
                    }
                    break;
                default:break;
            }
        }while(input!=0);
        sc.close();

    }
}
