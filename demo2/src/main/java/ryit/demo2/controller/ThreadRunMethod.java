package ryit.demo2.controller;


import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
@Slf4j
public class ThreadRunMethod implements Callable {

    private int num=111;

    public ThreadRunMethod(int num){
        this.num= num;
    }

    @Override
    public Object call() throws Exception {
        log.info(Thread.currentThread().getName());
        return num;
    }
}
