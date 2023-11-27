package kz.issakov.arman;

import java.util.Random;

public class MontyHallProblem {

    Random rnd = new Random();

    /**
     * Метод перемешивания элементов массива.
     * @return возвращает перемешаный массив
     * */
    public int[] shuffleArray(){
        int[] array = new int[]{1,0,0};
        int[] shuffleArr = array;
        for (int i = array.length-1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = shuffleArr[index];
            shuffleArr[index] = array[i];
            array[i] = temp;
        }
        return shuffleArr;
    }
    /**
     * Метод доказывает парадокс Монти Холла
     * @param array массив выступающий в качестве трех дверей
     * @param attemts количество попыток
     * @return текст с результатами игры
     * */
    public String startMontyHoll(int[] array, int attemts){
        int userDontChangeChoice = 0;
        for (int i = 0; i < attemts; i++) {
            int userChoice = rnd.nextInt(3);
            if (array[userChoice] == 1){
                userDontChangeChoice++;
            }
        }
        int userChangeChoice = attemts - userDontChangeChoice;
        String text = "Пользователь не менял свой выбор = " + userDontChangeChoice + "\nПользватель менял свой выбор = " + userChangeChoice;
        return text;
    }


}
