package ryit.demo2.mapper;

import org.apache.ibatis.annotations.*;
import ryit.demo2.entity.Course;
import ryit.demo2.entity.Score;

import java.util.List;

@Mapper
public interface ScoreMapper {

    @Select("select s_id,s_score,c_id from score where s_id = #{s_id}")
    @Results({
            @Result(column = "s_id",property = "s_id"),
            @Result(column = "s_score",property = "s_score"),
            @Result(column = "c_id",property = "c_id"),
            @Result(column = "c_id",property = "course",
            javaType = Course.class,
            one= @One(select = "ryit.demo2.mapper.CourseMapper.getCourse"))
    })
    Score findById(int  s_id);

}
