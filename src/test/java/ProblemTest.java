import org.junit.Test;

import static org.junit.Assert.*;

/*
    "oh boy this really bugs me"
 */

public class ProblemTest {

    // Okay to change
    @Test
    public void testBubbleSortNullInputCheck() {
        int[] input = null;

        try {
            Problem.bubbleSort(input);
        } catch (Exception e) {
            assertFalse(true); // it shouldn't throw exception
        }

        assertNull(input);
    }

    @Test
    public void testBubbleSortEmptyInputCheck() {
        int[] input = {};

        try {
            Problem.bubbleSort(input);
        } catch (Exception e) {
            assertFalse(true); // it shouldn't throw exception
        }

        assertNotNull(input);
        assertTrue(input.length==0);
    }

    @Test
    public void testBubbleSort() {
        int inputs[][] = {
                {},
                {3, 3, 3},
                {3, 2, 1},
                {3, 5, -1, 9, 12, 13, 8, 7},
        };
        int expects[][] = {
                {},
                {3, 3, 3},
                {1, 2, 3},
                {-1, 3, 5, 7, 8, 9, 12, 13},    // bug was here
        };

        for (int i = 0; i < inputs.length; i++) {
            Problem.bubbleSort(inputs[i]);
            for (int j = 0; j < inputs[i].length; j++) {
                assertArrayEquals(expects[i], inputs[i]);
            }
        }
    }
}
