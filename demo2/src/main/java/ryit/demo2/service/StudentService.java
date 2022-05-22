package ryit.demo2.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ryit.demo2.entity.Student;
import ryit.demo2.mapper.StudentInterface;


@Slf4j
@Service
public class StudentService {/*
    @Async
    @Scheduled(fixedDelay = 5000)*/
    public void getStudent(){
        int id = 2022516;
        log.info("开始打印第一个任务{}",id);
    }

    /*@Async
    @Scheduled(cron = "0/5 * * * * ?")*/
    public void getStudent1(){
        int id = 111111;
        log.info("开始打印第二个任务{}",id);
    }

    @Autowired
    StudentInterface studentInterface;

//    @Transactional
//    public int insertStudent(Student student){
//        int num = studentInterface.addStudent(student);
//
//        int num2 = studentInterface.updateStudent(student);
//        return num+num2;
//    }
}
