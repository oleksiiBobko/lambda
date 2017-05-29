package x.y.z;

import java.util.function.Function;
import java.util.stream.Stream;

import org.apache.commons.math3.util.Pair;

import lombok.Builder;;

@Builder
public class SomeClass<T> {
    
    //private Stream<T> src;
    private T body;
    private Function<T, T> correction;
    private Function<T, Integer> mapSource;
    
    public Stream<Pair<T, Integer>> stream() {
        body = correction.apply(body);
        return Stream.of(Pair.create(body, mapSource.apply(body)));
    }
    
}
