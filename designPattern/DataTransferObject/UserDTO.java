package is.designPattern.DataTransferObject;


public class UserDTO {//DTO: contiene solo i dati da trasferire.
 private String name;
 private String email;
 private String ruolo;

 public UserDTO(String name, String email, String ruolo) {
     this.name = name;
     this.email = email;
     this.ruolo = ruolo;
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