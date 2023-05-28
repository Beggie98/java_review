package task;


import lombok.*;

//@Getter
//@Setter
//@ToString
@Builder //creates an object easily
@Data
public class Orange {

    private int weight;
    private Color color;




}
//@Builder generates an @AllArgsConstructor unless there is another @XConstructor