package org.example.Exercise.Ex0718;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor

public class Student1 {

    private  String name;
    private int kor;
    private int eng;
    private int math;

    public float getAverage(){
        return (kor+eng+math)/(float)3;
    }
    public int getTotal(){
        return kor+eng+math;
    }
}
