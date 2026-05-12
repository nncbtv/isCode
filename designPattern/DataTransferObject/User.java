package is.designPattern.DataTransferObject;


public class User { //Domain Object: rappresenta l'utente nel dominio applicativo e contiene tutti i dati dell'utente.
 private Long id;
 private String name;
 private String email;
 private String ruolo;

 public User(Long id, String name, String email, String ruolo) {
     this.id = id;
     this.name = name;
     this.email = email;
     this.ruolo = ruolo;
 }

 public Long getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 public String getEmail() {
     return email;
 }

 public String getRuolo() {
     return ruolo;
 }
}