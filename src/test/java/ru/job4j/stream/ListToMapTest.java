package ru.job4j.stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ListToMapTest {

    @Test
    @DisplayName("Test convert when list doesn't have duplicates")
    public void whenInputListNotHaveDuplicate() {
        List<Student> list = Arrays.asList(
                new Student(30, "Ivanov"),
                new Student(40, "Petrov"),
                new Student(50, "Sidorov")
        );
        Map<String, Student> result = ListToMap.convert(list);
        Map<String, Student> expected = new LinkedHashMap<>();
        expected.put("Ivanov", new Student(30, "Ivanov"));
        expected.put("Petrov", new Student(40, "Petrov"));
        expected.put("Sidorov", new Student(50, "Sidorov"));
        assertThat(expected, is(result));
    }

    @Test
    @DisplayName("Test convert when list has duplicates")
    public void whenInputListHaveDuplicate() {
        List<Student> list = Arrays.asList(
                new Student(30, "Ivanov"),
                new Student(40, "Petrov"),
                new Student(50, "Ivanov"),
                new Student(60, "Sidorov"),
                new Student(70, "Petrov")
        );
        Map<String, Student> result = ListToMap.convert(list);
        Map<String, Student> expected = new LinkedHashMap<>();
        expected.put("Ivanov", new Student(30, "Ivanov"));
        expected.put("Petrov", new Student(40, "Petrov"));
        expected.put("Sidorov", new Student(60, "Sidorov"));
        assertThat(expected, is(result));
    }
}