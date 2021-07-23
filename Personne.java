
public class Personne {
  String nom;
  String prenom;
  int age;

  public Personne(String nomPersonne, String prenomPersonne, int agePersonne){
    nom = nomPersonne;
    prenom = prenomPersonne;
    age = agePersonne;
  }

  public String printing(){
    String output = "Nom: "+nom+", Prenom:"+prenom+ ", Age:" +age;
    return output; 
  }
}