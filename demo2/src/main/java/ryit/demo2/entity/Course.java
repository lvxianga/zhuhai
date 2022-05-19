package ryit.demo2.entity;

import lombok.*;

@AllArgsConstructor
@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Course {

    private String c_id;
    private String c_name;
    private String t_id;
}
