import java.util.ArrayList;
public class QuickSort {

static ArrayList left = new ArrayList();
static ArrayList right = new ArrayList();

static int[] nums = {3,2,4,1,5,9,7,6,10};

static int numsLength = nums.length;

static int pivot = nums[0];

static void divideArrays() {
    for (int i = 0; i < numsLength; i++){
            if (nums[i] < pivot) {
                left.add(nums[i]);
            } else if (nums[i] > pivot) {
                right.add(nums[i]);
            } else {
                continue;
            }
        }

    System.out.print("this is left: " + left + ",");
    System.out.println();
    System.out.print("this is right: " + right + ",");
}



    public static void main(String[] args) {
        divideArrays();
    }
}
