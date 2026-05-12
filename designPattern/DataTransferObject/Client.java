package is.designPattern.DataTransferObject;

public class Client {     //Client: usa il mapper per trasformare i dati.
 
	public static void main(String[] args) {
     
     User user = new User(1L, "Mario Rossi", "mario@example.com", "ADMIN");// Oggetto di dominio completo.
  
     UserDTO dto = UserMapper.toDTO(user); // Conversione da Domain Object a DTO.

     System.out.println(dto.getName() + " - " + dto.getEmail() + " - " + dto.getRuolo());
    
     UserDTO newUserDTO = new UserDTO("Luca Bianchi", "luca@example.com", "USER"); // DTO ricevuto, ad esempio, da un client remoto.

     User newUser = UserMapper.toDomain(newUserDTO); // Conversione da DTO a Domain Object.

     System.out.println(newUser.getName() + " - " + newUser.getEmail() + " - " + newUser.getRuolo());
 }
}