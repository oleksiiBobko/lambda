package x.y.z;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1 ", "2", "3");
        
        Map<Integer, String> map = list
                .stream()
                .collect(
                        Collectors.toMap(
                                String::hashCode,
                                s -> s.trim())
                        );
        System.out.println("map: " + map);
    }

}
