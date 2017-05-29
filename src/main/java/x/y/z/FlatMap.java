package x.y.z;

import static java.util.Arrays.asList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlatMap {
    
    public static void main(String[] args) {
        List<Integer> together = Stream.of(asList(10, 2), asList(3, 7, 4))
                .flatMap(numbers -> numbers.stream()).sorted(Comparator.comparing(i -> i.intValue()))
                .collect(Collectors.toList());
        log.info(together.toString());
    }
    
}
