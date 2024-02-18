package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString

public class UserDto {
    private String name;
    private String lastName;
    private String email;
    private String password;

}
