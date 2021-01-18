package pulse.payload.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.DateType;

import java.util.Set;

import javax.validation.constraints.*;
@Getter
@Setter
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

    private String first_name;
    private String last_name;
    private String middle_name;
    private String birth_date;
    private String address;
    private String faculty;
    private String speciality;
    private int course;
    private boolean active;

}
