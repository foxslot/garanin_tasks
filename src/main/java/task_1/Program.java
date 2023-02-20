package task_1;

public class Program {
    public static void main(String[] args) {

        int[] arrInt = {1, 2, 3, 4, 5};

        findMaxMinInArr(arrInt);

    }

    public static void findMaxMinInArr(int[] arrInt){

        int lengthArr = arrInt.length;

        int resMax = arrInt[0];
        int resMin = arrInt[0];
        int summ = arrInt[0];


        for(int i = 1; i < lengthArr; i++){

            if (resMax < arrInt[i]){
                resMax = arrInt[i];
            }

            if (resMin > arrInt[i]){
                resMin = arrInt[i];
            }

            summ += arrInt[i];

        }

        int average = summ/lengthArr;

        System.out.println("Максимальное значение: " + resMax);
        System.out.println("Минимальное значение: " + resMin);
        System.out.println("Среднее значение: " + average);

    }
}
