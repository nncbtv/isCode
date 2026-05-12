package is.designPattern.DataTransferObject;


public class UserMapper {//Mapper / Assembler: converte Domain Object <-> DTO.

 public static UserDTO toDTO(User user) {// Converte un oggetto User in UserDTO.
     return new UserDTO(
         user.getName(),
         user.getEmail(),
         user.getRuolo()
     );
 }
 public static User toDomain(UserDTO dto) {// Converte un UserDTO in un oggetto User.
     return new User(
         null,
         dto.getName(),
         dto.getEmail(),
         dto.getRuolo()
     );
 }
}