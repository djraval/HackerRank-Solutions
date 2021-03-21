package com.company;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //Input
        int[] a = {1,2,3,4,5,6};
        int noOfRotations = 3;

        //Solution
        Integer[] src =  Arrays.stream(a).boxed().toArray( Integer[]::new );
        int offset = noOfRotations % src.length;

        Integer[] tempa = Arrays.copyOfRange(src,0,offset);
        Integer[] tempb = Arrays.copyOfRange(src,offset,src.length);

        int[] result  = Stream.of(tempb, tempa).flatMap(Stream::of).mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(result));

    }
}
