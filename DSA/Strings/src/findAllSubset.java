import java.util.ArrayList;
import java.util.List;

public class findAllSubset {
    public static void main(String[] args) {
        int[] arr = {1,3,4};
        List<List<Integer>> res = subsets(arr);
        System.out.println(res);

    }
        public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            generateSubsetElementsHelper(0, new ArrayList<>(), nums, result);
            return result;
        }

        private static void generateSubsetElementsHelper(int index, List<Integer> current, int[] nums, List<List<Integer>> result) {
            if (index == nums.length) {
                result.add(new ArrayList<>(current));
                return;
            }
            current.add(nums[index]);
            // Exclude the current element and move to the next
            generateSubsetElementsHelper(index + 1, current, nums, result);
            // Include the current element and move to the next

            current.remove(current.size() - 1);
            generateSubsetElementsHelper(index + 1, current, nums, result);
            // Backtrack to remove the current element

        }
    }


