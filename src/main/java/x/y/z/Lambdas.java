package x.y.z;

import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Lambdas {
    
    private Runnable r = () -> {
        Supplier<Thread> s =Thread::currentThread;
        log.info(s.get().getName());
    };
    
    public void name() {
        new Thread(r, "my thread").start();
    }
    
    public static void main(String[] args) {
        Lambdas l = new Lambdas();
        l.name();
        
        String[] test = "e df ggr e rer wwewr e".split(" ");
        
        int max = Stream.of(test)
                .map(s -> s.length())
                .collect(Collectors.toSet()).stream()
                .mapToInt(i -> i.intValue())
                .max()
                .getAsInt();
        
        log.info("" + max);
        
        Map<Integer, String> m = Stream.of(test).collect(Collectors.toMap(String::length, v -> v, (k1, k2) -> {
            return k1;
        }));
        
        log.info(m.toString());
        
    }
    
}
