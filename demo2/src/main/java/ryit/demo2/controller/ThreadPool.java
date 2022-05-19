package ryit.demo2.controller;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.*;

@Component
public class ThreadPool {

     ExecutorService executorService = new ThreadPoolExecutor(4, 4, 20, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));


}
