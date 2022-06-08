package gestionSalarie;

 public class Employe extends Personne {

     int salary;

     public Employe(String name, String surname, String ssNumber, Address address) {

         setName(name);
         setSurname(surname);
         setSsNumber(ssNumber);
         setAddress(address);
     }

}
