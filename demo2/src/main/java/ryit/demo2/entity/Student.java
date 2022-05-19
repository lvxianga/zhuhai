package ryit.demo2.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Student {
    private List<Score> score;
    public String s_id;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh-mm-ss")
    public Date s_riqi = new Date();
    public String s_name;
    public String s_sex;
    private String s_birth;

//    public void setDate(String s_riqi){
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
//        try {
//            this.s_riqi=sdf.parse(s_riqi);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }
}
