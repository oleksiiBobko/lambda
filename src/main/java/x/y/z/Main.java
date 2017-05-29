package x.y.z;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
        String[] a = "The official site of - Scorpions".split("[>.|+]|( - )");
        System.out.println(Arrays.toString(a));
        
    }

}
