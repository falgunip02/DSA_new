import java.util.ArrayList;
import java.util.List;

public class diceCombination {
    public static void main(String[] args) {
        // Create a list to store the results
        List<String> ans = new ArrayList<>();

        // Call the combination method with an initial empty string, the target sum, and the list
        combination("", 4, ans);

        // Print the results
        System.out.println(ans); // This will print all combinations
    }

    public static void combination(String p, int target, List<String> ans) {
        // Base case: if target is 0, add the current combination to the list
        if (target == 0) {
            ans.add(p);
            return;
        }

        // Recursive case: iterate over possible dice rolls (1 to 6) that don't exceed the target
        for (int i = 1; i <= 6 && i <= target; i++) {
            combination(p + i, target - i, ans);
        }
    }
}
