import java.util.ArrayList;
import java.util.List;

public class findCombinationsSum {

    private void CombinationSum(int ind, int[] combinations, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (ind == combinations.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));

            }
            return;
        }

        if (combinations[ind] <= target) {
            ds.add(combinations[ind]);
            CombinationSum(ind, combinations, target - combinations[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        CombinationSum(ind + 1, combinations, target, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        CombinationSum(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }


    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;
        findCombinationsSum sol = new findCombinationsSum();
        List < List < Integer >> ls = sol.combinationSum(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}