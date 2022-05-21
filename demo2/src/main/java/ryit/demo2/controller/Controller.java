package ryit.demo2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {
    @RequestMapping("/get")
    public void get(){
      log.info("get马上就开始了");
    }
}
