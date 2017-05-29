package x.y.z;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Foo {
    
    int val = 42;
    
    final Bar b = new Bar();
    
    public static void main(String[] args) {
        
        Foo f = new Foo();
        f.createThreads();
    }
    
    public void createThreads() {
        
        for (int i = 1; i < 4; i++) {
        
            new Thread(new Runnable() {
                public void run() {
                    try {
                        log.info(Thread.currentThread().getName() + " in");
                        b.name();
                        log.info(Thread.currentThread().getName() + " out");
                    } catch (InterruptedException e) {
                        log.error("", e);
                    }
                }
            }, "thread-" + i).start();
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            log.error("", e1);
        }
        
        //wake up thread
        new Thread(new Runnable() {
            public void run() {
                try {
                    while(true) {
                        log.info("wake up");
                        b.qname();
                    }
                } catch (Exception e) {
                    log.error("", e);
                }
            }
        }, "wake-up").start();
        
    }
    
}
