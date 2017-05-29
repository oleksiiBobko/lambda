package x.y.z;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bar {
    public synchronized void name() throws InterruptedException {
        log.info(Thread.currentThread().getName() + " in synch block");
        wait();
        Thread.sleep(2000);
        log.info(Thread.currentThread().getName() + " in synch block after sleep");
    }
    
    
    public synchronized void qname() {
        notifyAll();
    }

}
