import java.util.Arrays;

public class DZ4 {


    public static void someMethod(String[][] arr) throws Exception {
        if (!Arrays.deepEquals(arr, new String[4][4])) {
            throw new MyArraySizeException("Wrong Array Size, should be 4x4");
        }

        arr[0][0] = "1";
        arr[0][1] = "2";
        arr[0][2] = "3";
        arr[0][3] = "4";
        arr[1][0] = "5";
        arr[1][1] = "6";
        arr[1][2] = "7";
        arr[1][3] = "8";
        arr[2][0] = "9";
        arr[2][1] = "10";
        arr[2][2] = "11";
        arr[2][3] = "12";
        arr[3][0] = "13";
        arr[3][1] = "14";
        arr[3][2] = "15";
        arr[3][3] = "16";

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    System.out.println(sum += (Integer.parseInt(arr[i][j])));
                } catch (Exception e) {
                    throw new MyArrayDataException("Element in " + i + "X" + j + " is not digit or null");
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        try {
            someMethod(new String[4][4]);
        } finally {
            System.out.println("Finished");
        }
    }
}
