package ru.easyjava.java;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class HelloStreamsTest {
    private static final String EXPECTED = "Hello, world";

    private HelloStreams testedObject = new HelloStreams();

    @Test
    public void testGreet() throws Exception {
        assertThat(testedObject.greet(), is(EXPECTED));
    }

    @Test
    public void testOldSchooldGreet() throws Exception {
        assertThat(testedObject.oldSchoolGreet(), is(EXPECTED));
    }
}