package Home_work_1;

public class HJ_2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 2. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные
        // элементы единицами (можно только одну из диагоналей,
        // если обе сложно). Определить элементы одной из диагоналей
        // можно по следующему принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];
        int m2 = 10;
        int[][] qwadrat = new int[m2][m2];

        for (int i = 0; i < qwadrat.length; i++)
        {
            qwadrat[i][i] = 1;
            qwadrat[qwadrat.length - i - 1][i] = 1;
        }

        // Вывод
        for (int i = 0; i < qwadrat.length; i++)
        {
            for(int j = 0; j < qwadrat[i].length; j++)
            {
                if(qwadrat[i][j] != 1) qwadrat[i][j] = 0;
                System.out.print(qwadrat[i][j]);  
            }
            System.out.println("");
        }
            
        
    }

}
