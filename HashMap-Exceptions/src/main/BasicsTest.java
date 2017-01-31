package main;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BasicsTest {

    @Test
    public void testAddition() {
        int a = 0;
        int b = 10;
        int sum = a + b;
        Assert.assertEquals(10, sum);
    }

    @Test
    public void commonSyntax() {
        int a = 0;
        int b = 10;
        int sum = a + b;
        assertEquals(10, sum);
    }

    @Test
    public void anotherExample() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);

        List<Integer> evens = onlyEven();

        assertThat(list, equalTo(evens));
    }

    private List<Integer> onlyEven() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
