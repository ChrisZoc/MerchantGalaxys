package com.christian.merchantgalaxys;

import junit.framework.TestCase;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ApplicationTest extends TestCase {

    @Test
    public void testApp1() {
    }

    @Test
    public void testApp2() {
    }

    @Test
    public void testApp3() {
        Application application = new Application();


        List<String> input = new ArrayList<>();
        input.add("prok is I");
        input.add("how much is glob ?");
        input.add("how much is prok ?");
        input.add("glob is V");
        input.add("how much is glob ?");

        List<String> result = application.run(input);


        List<String> expected = new ArrayList<String>();
        expected.add("I have no idea what you are talking about");
        expected.add("prok is 1");
        expected.add("glob is 5");

        Assert.assertThat(result, is(expected));

    }

    @Test
    public void testApp4() {
    }

    @Test
    public void testApp5() {
    }

}