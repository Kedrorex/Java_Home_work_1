package Home_work_1;
public class HJ_1 {
    public static void main(String[] args) {
        // 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
        // ;

        int[] nums = new int[] { 4, 5, 9, 47, 2, 3, 61, 45, 0, -4, 15, -8, 26 };
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++)
        {
            if(min > nums[i]) min = nums[i];
            if(max < nums[i]) max = nums[i];
        }

        System.out.println("Минимальное число " + min);
        System.out.println("Максимальное число " + max);
    }
}