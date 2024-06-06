public class Main {
    public static void main(String[] args) {
        try {
            // Création d'un EntierNaturel avec une valeur valide
            EntierNaturel entier1 = new EntierNaturel(5);
            System.out.println("Entier 1 : " + entier1.getVal());

            // Tentative de modification de la valeur à une valeur négative
            entier1.setVal(-3); // Cette ligne générera une exception
        } catch (NombreNegatifException e) {
            System.out.println("Exception : " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }

        try {
            // Création d'un EntierNaturel avec une valeur négative
            EntierNaturel entier2 = new EntierNaturel(-2); // Cette ligne générera une exception
        } catch (NombreNegatifException e) {
            System.out.println("Exception : " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }

        try {
            // Décrémentation d'un EntierNaturel jusqu'à zéro
            EntierNaturel entier3 = new EntierNaturel(1);
            System.out.println("Entier 3 avant décrémentation : " + entier3.getVal());
            entier3.decrementer();
            System.out.println("Entier 3 après décrémentation : " + entier3.getVal());
            entier3.decrementer(); // Cette ligne générera une exception
        } catch (NombreNegatifException e) {
            System.out.println("Exception : " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }
    }
}