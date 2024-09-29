import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>(10);
        System.out.println(arr.size());
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(-100, 100));
//            arr.set(i,rnd.nextInt(-100, 100));
        }
        System.out.println(arr);
        ArrayList<Integer> newArr = filterNegative(arr);
        System.out.println(newArr);
        int[] arr_new = {1, 2, 2, 3, 4, 4, 5};
        System.out.println(noDouble(arr_new));
        String[] arr03 = {"cat", "elephant", "dog", "giraffe"};
        String[] resArr = filtrLength(arr03);
        for (String s : resArr) {
            System.out.println(s);
        }
        int[] arr04 = new int[]{4, 2, 7, 5, 1};
        System.out.println(average(arr04));
    }
    /*
    Задача 1
    Реализуйте метод, который принимает на вход целочисленный массив и
удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
только неотрицательные числа.
     */
    public static ArrayList<Integer> filterNegative(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)<0) arr.remove(i--);
        }
        return arr;
    }
    /*
    Задача 2. Уникальные числа
Напишите метод, который принимает целочисленный массив и возвращает
новый массив, содержащий только уникальные элементы из исходного
массива.

     */
    public static ArrayList<Integer> noDouble(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : arr) {
            if (!result.contains(i)) result.add(i);
        }
        return result;
    }
    /*
    Задача 3. Длина слов
Реализуйте метод, который принимает на вход массив строк и возвращает
новый массив, содержащий только строки, длина которых больше 3 символов.
Пример:
["cat", "elephant", "dog", "giraffe"]
     */
    public static String[] filtrLength (String[] arr){
        ArrayList<String> res = new ArrayList<>();
        for (String s : arr) {
            if(s.length()>3) res.add(s);
        }
        String[] result = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
    /*
    Задача 4*. Среднее значение массива
Напишите метод, который принимает массив целых чисел и возвращает
среднее значение элементов массива, округленное до ближайшего целого
числа.
Пример:
[4, 2, 7, 5, 1]

     */
    public static int average(int[] arr){
        if (arr.length ==0) return 0;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double result = (double) sum / arr.length;
        return (int) Math.round(result);
    }
}