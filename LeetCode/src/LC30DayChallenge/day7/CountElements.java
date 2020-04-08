package LC30DayChallenge.day7;

import java.util.HashMap;

public class CountElements {

    // 1 ms Runtime
    public int countElements(int[] arr) {
        int result = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr){
            if (map.containsKey(x)){
                int count = map.get(x);
                map.put(x, count + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (int x : map.keySet()){
            if (map.containsKey(x+1)){
                result += map.get(x);
            }
        }
        return result;
    }

    // 2ms Runtime
    public int countElements2(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == x + 1) {
                    result++;
                    break;
                }
            }
        }

        return result;
    }

}
