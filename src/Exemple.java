import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemple {
    public static void main(String[] args) {
        int[] intArray = {24, 32, 0, 34, 12, 210, 2};

        int maxNum = intArray[0];

        for (int j : intArray) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println("le plus grand nombre  = " + maxNum);
    }
    public static Integer getMin(List<Integer> list)
    {
        int[] intArray = {24, 32, 0, 34, 12, 210, 2};
        List<Integer> sortedList = new ArrayList<>(list);
        sortedList.add(5);
        sortedList.add(9);
        sortedList.add(-2);
        sortedList.add(41);

        Collections.sort(sortedList);

        return sortedList.get(0);
    }

}


