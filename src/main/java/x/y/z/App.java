package x.y.z;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("first");
        
        new Thread(new Runnable() {
            
            @Override
            public void run() {
                Singleton b = Singleton.getInstance();
                System.out.println(b.hashCode());
            }
        }, "second").start();
        
        Singleton b1 = Singleton.getInstance();
        System.out.println(b1.hashCode());
    }
    
}

class Singleton {
    
    private volatile static Singleton instance = null;
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        
        return instance;
        
    }
    
}