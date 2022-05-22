package ryit.demo2.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ryit.demo2.aop.MyLambdaInterface;
import ryit.demo2.entity.Student;
import ryit.demo2.mapper.ScoreMapper;
import ryit.demo2.mapper.StudentInterface;
import ryit.demo2.service.StudentService;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.alibaba.fastjson.JSONObject.*;

@Slf4j
@RestController
public class StudentController {

    @Autowired
    StudentInterface studentInterface;

    @RequestMapping("/getstudent/{s_id}")
    public String getStudent(@PathVariable int s_id){
        return studentInterface.getStudent(s_id).toString();
    }

//    @RequestMapping("/lambda")
//    public void lambda(){
//        MyLambdaInterface myLambdaInterface = num->{
//            HashMap<String,String> hashMap = new HashMap<>();
//            hashMap.put("1","吕巷");
//            hashMap.put("2","蒋小杰");
//            return hashMap.get(num);
//        };
//       String hashMap = myLambdaInterface.getStudent("1");
////        hashMap.forEach((String key,String value)->{
//            log.info("hashMap   {}",hashMap);
////        });
//    }
//
//    @Autowired
//    StudentInterface studentInterface;
//
//    @Autowired
//    StudentService studentService;
//
//    @RequestMapping("/getstudent/{id}")
//    public String getStudent(@PathVariable int id) {
//
//        PageHelper.startPage(1, 3);
//        List<Student> list = studentInterface.getStudent(id);
//
//        return list.get(0).toString();
//    }
//
//
//    @RequestMapping("/addstudent/{s_name}/{s_birth}/{s_sex}/{s_id}")
//    public int addStudent(Student student){
//        log.info("student的值{}",student.s_riqi);
//
//        return studentService.insertStudent(student);
//    }


//    @Autowired
//    RedisTemplate<String,String> redisTemplate;
//
//    @RequestMapping("/addredis/{key}/{value}")
//    public String addredis(@PathVariable String key,@PathVariable String value){
//        redisTemplate.opsForValue().set(key,value);
//        return redisTemplate.opsForValue().get(key);
//    }
//
//    @RequestMapping("/addredisset/{key}/{value}")
//    public String addredisSet(@PathVariable String key,@PathVariable String value){
//        redisTemplate.opsForSet().add(key,value);
//        return redisTemplate.opsForSet().pop(key);
//    }
}
