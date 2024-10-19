package EX2;

import static EX2.CompareArrays.compareArrays;

public class Main {
    public static void main(String[] args) {

        Float [] floatArray1 = {1.5f, 2.2f, 3.3f};
        Float [] floatArray2 = {1.5f, 2.2f, 3.3f};
        boolean result = compareArrays(floatArray2,floatArray1);
        System.out.println(result);
    }
}
