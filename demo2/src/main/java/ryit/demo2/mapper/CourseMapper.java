package ryit.demo2.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import ryit.demo2.entity.Course;

@Mapper
public interface CourseMapper {


    @Select("select * from Course where c_id=#{c_id}")
    public Course getCourse(int c_id);

}
