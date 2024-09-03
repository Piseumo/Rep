package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex02 {
    public static void main(String[] args) {
        List<Car> list = Arrays.asList(
                new Car("그렌저",3000),
                new Car("K8",3500),
                new Car("쏘렌토",2200)
        );
        for (Car car : list){
            System.out.println(car);
        }
        Collections.sort(list, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getDisp()-o1.getDisp();
            }
        });

        for (Car car : list){
            System.out.println("comparable 정렬 "+car);
        }
    }
}
