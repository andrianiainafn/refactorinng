package iut.bad;

public class Humain {
    // Classe parente pour Homme et Femme
    // Les attributs sont maintenant dans la classe parente
    protected String nom;
    protected String prenom;
    protected int age;
    
    // Constructeur par défaut
    public Humain() {
        this.nom = "";
        this.prenom = "";
        this.age = 0;
    }
    
    // Constructeur avec paramètres
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    // Méthode details() qui affiche nom, prénom et âge en un seul System.out.println
    public void details() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }
    
    // Getters et setters
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
