package recursion;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class KeyBoard 
{
    // Top-down recursive function to find all possible combinations of words formed
    // from the mobile keypad
    public static void findCombinations(List<List<Character>> keypad, int[] keys,
                            Set<String> combinations, String result, int index)
    {
        // if we have processed every digit of the key, print the result
        if (index == -1) {
            combinations.add(result);
            return;
        }
 
        // stores the current digit
        int digit = keys[index];
 
        // one by one, replace the digit with each character in the corresponding
        // list and recur for the next digit
        for (char c : keypad.get(digit)) {
            findCombinations(keypad, keys, combinations, c + result, index - 1);
        }
    }
 
    public static Set<String> combinations(List<List<Character>> keypad, int[] keys) {
 
        // HashSet to store all combinations
        Set<String> combinations = new HashSet<>();
 
        // invalid input - return empty set
        if (keypad == null || keypad.size() == 0 || keys == null || keys.length == 0) {
            return combinations;
        }
 
        // find and return all combinations
        findCombinations(keypad, keys, combinations, "", keys.length - 1);
        return combinations;
    }
 
    public static void main(String[] args)
    {
        // mobile keypad
        List<List<Character>> keypad = Arrays.asList(
                // 0 and 1 digit doesn't have any characters associated
                Arrays.asList(),
                Arrays.asList(),
                Arrays.asList('A', 'B', 'C'),
                Arrays.asList('D', 'E', 'F'),
                Arrays.asList('G', 'H', 'I'),
                Arrays.asList('J', 'K', 'L'),
                Arrays.asList('M', 'N', 'O'),
                Arrays.asList('P', 'Q', 'R', 'S'),
                Arrays.asList('T', 'U', 'V'),
                Arrays.asList('W', 'X', 'Y', 'Z')
        );
 
        // input number in the form of an array (number cannot start from 0 or 1)
        int[] keys = {2, 3, 4};
 
        // find all combinations
        System.out.println(combinations(keypad, keys));
    }
}