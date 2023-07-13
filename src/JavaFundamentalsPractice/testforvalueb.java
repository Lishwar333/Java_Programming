package JavaFundamentalsPractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testforvalueb {

    testvalueb tb = new testvalueb();
    int a = tb.valueb(2);

    @BeforeAll
    static void beforeclass() {

        System.out.print("inside before class");
    }

    @Test
    void testcase1() {

        assertEquals(22,a);
    }

    @AfterAll
    static void after()
    {

        System.out.println("\ninside after");
    }
}
