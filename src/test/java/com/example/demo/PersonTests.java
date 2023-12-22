package com.example.demo;

import com.example.demo.person.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTests {
    @Test
    public void testGetName() {
        Person person = new Person("John");
        String name = person.getName();
        assertEquals("John", name);
    }
}
