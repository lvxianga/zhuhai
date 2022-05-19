package ryit.demo2.entity;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
public class Score {
    private Course course;
    private String s_id;
    private String s_score;
    private String c_id;
}
