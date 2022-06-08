package gestionSalarie;

 public abstract class Employe extends Personne {

     int netSalaire;
     public abstract String getMission();

     //public abstract int calculerSalaireBrut();

     public Employe(String name, String surname, String ssNumber, Address address) {

         setName(name);
         setSurname(surname);
         setSsNumber(ssNumber);
         setAddress(address);
     }

     /*public int calulerSalaireNet() {

     }*/

}
