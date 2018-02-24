package com.bayqa.mobile.testultimateandroidbootcamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParametrizedTest {
    public ParametrizedTest(int param) {

    }

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(5000);
    }
}
