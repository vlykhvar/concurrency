package test.com.company.hw2;

import com.company.hw2.CreateList;
import com.company.hw2.Recursive;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RecursiveTest {
    private Recursive recursive;
    private CreateList createList;

    @Before
    public void setUp(){
        createList = new CreateList();
    }

    @Test
    public void computeTestOne() {
        recursive = new Recursive(createList.createList(1));
        Assertions.assertEquals(1_000_000, recursive.compute());
    }

    @Test
    public void computeTestTwo() {
        recursive = new Recursive(createList.createList(2));
        Assertions.assertEquals(2_000_000, recursive.compute());
    }
    @Test
    public void computeTestThree () {
        recursive = new Recursive(createList.createList(-2));
        Assertions.assertEquals(-2_000_000, recursive.compute());
    }
}
