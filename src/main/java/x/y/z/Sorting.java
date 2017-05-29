package x.y.z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Sorting {
    
    public static void main(String[] args) {
        
        List<SomePojo> collection = new ArrayList<SomePojo>();
        
        for(int i = 0; i < 100; i++) {
            collection.add(new SomePojo(new Random().nextInt(1000)));
        }
        
        //System.out.println(Arrays.toString(collection.toArray(new SomePojo[collection.size()])));
        
        //Collections.sort(collection, Comparator.comparing(SomePojo::getValueo -> o.getValue()));
        
        Collections.sort(collection, Comparator.comparing(SomePojo::getValue));
        
        List<SomePojo> collection1 = collection.stream()
                .sorted(
                        Comparator.comparing(p -> p.getValue())
                        )
                .collect(Collectors.toList());
        
        collection1.forEach(System.out::println);
        
    }
}
