package org.exam;

import com.github.javafaker.Faker;

public class testclass {
    public static void main(String[] args) {
System.out.println(Faker.instance().address().fullAddress());
    }
}
