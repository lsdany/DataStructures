package com.ld.simplelist;

import lombok.Builder;
import lombok.ToString;

@ToString(callSuper = true)
public class Student extends Human{


    private String id;

    @Builder
    private Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }


}
