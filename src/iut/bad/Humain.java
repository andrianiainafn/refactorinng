package iut.bad;

public class Humain implements Consommation {
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
    
    // Méthode toString() qui retourne une chaîne formatée
    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }
    
    // Méthode details() qui utilise toString() pour afficher les informations
    public void details() {
        System.out.println(this.toString());
    }
    
    // Implémentation de la méthode manger() de l'interface Consommation
    @Override
    public void manger() {
        System.out.println(nom + " " + prenom + " est en train de manger.");
    }
    
    // Implémentation de la méthode boire() de l'interface Consommation
    @Override
    public void boire() {
        System.out.println(nom + " " + prenom + " est en train de boire.");
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
