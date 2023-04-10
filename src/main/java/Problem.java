//  _
// | |
// | |__  _   _  __ _
// | '_ \| | | |/ _` |
// | |_) | |_| | (_| |
// |_.__/ \__,_|\__, |
//               __/ |
//              |___/

public class Problem {

    // Do not change signature (function name, parameters, return type)
    public static void bubbleSort(int[] data) {
        // bug was here: add input checks
        if (data == null || data.length == 0) {
            return;
        }

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j]; // bug was here, data[i] to data[j]
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}
