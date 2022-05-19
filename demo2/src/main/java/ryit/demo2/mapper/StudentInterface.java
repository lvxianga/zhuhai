package ryit.demo2.mapper;

import org.apache.ibatis.annotations.*;
import ryit.demo2.entity.Score;
import ryit.demo2.entity.Student;

import java.util.List;

@Mapper
public interface StudentInterface {

   @Select("select s_id,s_name,s_birth,s_sex,s_riqi from student where s_id=#{s_id}")
//   @Results({
//           @Result(property = "s_id",column = "s_id"),
//           @Result(property = "s_name",column = "s_name"),
//           @Result(property = "s_birth",column = "s_birth"),
//           @Result(property = "s_sex",column = "s_sex"),
//           @Result(property = "score",column = "s_id",
//                   javaType = List.class,
//                   one = @One(select = "ryit.demo2.mapper.ScoreMapper.findById"))
//   })
    List<Student> getStudent(int s_id);

    @Insert("insert into student value(#{s_id},#{s_name},#{s_birth},#{s_sex},#{s_riqi})")
    int addStudent(Student student);

    @Update("update student set s_name='吕xiao翔' where s_id=9")
    int updateStudent(Student student);
}
