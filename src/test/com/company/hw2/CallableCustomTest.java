package test.com.company.hw2;

import com.company.hw2.CreateList;
import com.company.hw2.ExecutorServiceCustom;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CallableCustomTest {
    private CreateList createList;
    ExecutorServiceCustom executor;


    @Before
    public void setUp() {
        createList = new CreateList();
        executor = new ExecutorServiceCustom();
    }


    @Test
    public void computeTestOne() {
        Assertions.assertEquals(1_000_000,  executor.getSum(createList.createList(1), 8));
    }

    @Test
    public void computeTestTwo() {
        Assertions.assertEquals(2_000_000,  executor.getSum(createList.createList(2), 8));
    }

    @Test
    public void computeTestThree () {
        Assertions.assertEquals(-2_000_000, executor.getSum(createList.createList(-2), 8));
    }
}
