package lombok;

import java.util.Objects;

//@NoArgsConstructor
@AllArgsConstructor
@Data
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor
public class Student {
    //Boilerplate code
    //this is the structure that is fixed (not changed)
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private int age;
}
