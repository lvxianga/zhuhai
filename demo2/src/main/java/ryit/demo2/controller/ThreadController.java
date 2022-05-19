package ryit.demo2.controller;

import com.sun.org.apache.xpath.internal.functions.FuncTrue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Slf4j
@RestController
public class ThreadController {

    @Autowired
    ThreadPool threadPool;

    private int num = 0;

    ThreadRunMethod threadRunMethod = new ThreadRunMethod(++num);

    @RequestMapping("/threadController")
    public void threadController() throws ExecutionException, InterruptedException {

       Future<Integer> future =  threadPool.executorService.submit(threadRunMethod);
       log.info("值为{}",future.get());
    }
}
