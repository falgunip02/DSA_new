import java.util.ArrayList;

public class returnTypeArraylist {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8};
        ArrayList<Integer> ans = search(arr, 3, 0,new ArrayList<Integer>() );
        System.out.println(ans);
    }


    public static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }
        return search(arr,target,index+1,list);
    }
}
