package Home_work_1;

public class HJ_4 {
    public static void Karusel() {

    }

    public static void main(String[] args) {
        // 4.** Написать метод, которому на вход подается одномерный массив
        // и число n (может быть положительным, или отрицательным),
        // при этом метод должен сместить все элементы массива на n позиций.
        // Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
        // вспомогательными массивами.
        // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
        // [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в
        // какую сторону сдвиг можете выбирать сами.
        int [] base = new int []{ 3, 5, 6, 1, 7, 8, 14, 61, -14, 20, 9, 3};
        int n = -4;
        
        base = methodName(base, n);

        for(int i = 0; i < base.length; i++)
        {
            System.out.print(base[i] + " ");
        }
        
        
    }

    public static int[] methodName(int[] base, int n) {
        int buf = 0;
        // в право
        if (n > 0)
         {
            for (int i = 0; i < n; i++) 
            {
                buf = base[base.length - 1];
                for (int j = base.length - 2; j >= 0; j--) 
                {
                    base[j + 1] = base[j];
                }
                base[0] = buf;
            }
            return base;
            // влево
        } else if (n < 0)
        {
           for (int i = n; i < 0; i++) 
           {
               buf = base[0];
               for (int j = 0; j <= base.length - 2; j++) 
               {
                   base[j] = base[j + 1];
               }
               base[base.length - 1] = buf;
           }
           return base;
       }else 
       {
        return base;
       }
        
        // тело
    }
}
