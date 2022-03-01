package org.example;


import org.example.util.AverageService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    private static File file;

    @BeforeAll
    static void setUp() {
        file = TestUtil.getFile("src/test/resources/test1.txt");
    }

    @Test
    public void meanAverageTest() throws FileNotFoundException {
        assertEquals(5.428571428571429, AverageService.meanAverage(file));
    }

    @Test
    public void medianAverageTest() throws FileNotFoundException {
        assertEquals(6.0, AverageService.medianAverage(file));
    }

    @Test
    public void minimumTest() throws FileNotFoundException {
        assertEquals(2.0, AverageService.minimum(file));
    }

    @Test
    public void maximumTest() throws FileNotFoundException {
        assertEquals(11.0, AverageService.maximum(file));
    }
}
