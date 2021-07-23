public class HelloPersonne{

  public static void main(String[] args) {
   Personne personne = new Personne("Dupont", "Jean", 30);
   System.out.println("Hello " + personne.printing());

   Personne autrePersonne = personne;
   System.out.println("Hello" + autrePersonne.printing());
   System.out.println("Hello" + personne.printing());

   personne.nom = "Perez";
   System.out.println("Hello" + autrePersonne.printing());
   System.out.println("Hello" + personne.printing());
  }

}