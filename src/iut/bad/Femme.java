package iut.bad;

public class Femme extends Humain {
    
    // Constructeur par défaut
    public Femme() {
        super();
    }
    
    // Constructeur avec paramètres
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
    
    // Méthode main pour tester les fonctionnalités
    public static void main(String[] args) {
        // Instanciation d'un Homme
        Homme homme = new Homme("Martin", "Pierre", 30);
        
        // Instanciation d'une Femme
        Femme femme = new Femme("Dupont", "Marie", 25);
        
        // Affichage des détails de chaque personne
        System.out.println("=== Détails des personnes ===");
        homme.details();
        femme.details();
        
        System.out.println("\n=== Déclaration d'amitié ===");
        // Déclaration que l'homme est ami avec la femme
        homme.ami(femme);
        
        // Déclaration que la femme est amie avec l'homme
        femme.ami(homme);
        
        System.out.println("\n=== Test des méthodes de consommation ===");
        // Test des méthodes de consommation
        homme.manger();
        femme.boire();
    }
}
