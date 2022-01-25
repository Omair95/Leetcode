import java.util.*;
import static java.util.Map.Entry.comparingByValue;
import java.util.stream.Collectors;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> sortedMapByValue = frequencyMap.entrySet().stream().sorted(comparingByValue(Comparator.reverseOrder())).limit(k).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return sortedMapByValue.keySet().stream().mapToInt(i->i).toArray();
    }

    public static void main (String [] args) {
        //Arrays.stream(topKFrequent(new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3 }, 2)).forEach(x -> System.out.println(x));
        //Arrays.stream(topKFrequent(new int[]{ 1 }, 1)).forEach(x -> System.out.println(x));
        Arrays.stream(topKFrequent(new int[]{ 1, 2 }, 2)).forEach(x -> System.out.println(x));
    }
}