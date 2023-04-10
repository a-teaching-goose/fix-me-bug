//  _
// | |
// | |__  _   _  __ _
// | '_ \| | | |/ _` |
// | |_) | |_| | (_| |
// |_.__/ \__,_|\__, |
//               __/ |
//              |___/

import org.junit.Test;

import static org.junit.Assert.*;

public class ProblemTest {

    @Test
    public void testBubbleSort() {
        int inputs[][] = {
                {3, 3, 3},
                {3, 2, 1},
                {3, 5, -1, 9, 12, 13, 8, 7},
        };

        for (int i = 0; i < inputs.length; i++) {

            // call the function
            Problem.bubbleSort(inputs[i]);

            for (int j = 0; j < inputs[i].length - 1; j++) {
                // verify all elements are
                assertTrue(inputs[i][j] <= inputs[i][j + 1]);
            }
        }
    }
}
