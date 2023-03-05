package homework4;

import java.util.Arrays;

public class HW_4_2 {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Base: " + Arrays.toString(arr)); // виводимо початковий масив

        int[] sortedArrAsc = sortArrayAscending(arr); // сортуємо масив від найменшого до найбільшого
        System.out.println("Asc: " + Arrays.toString(sortedArrAsc));

        int[] sortedArrDesc = sortArrayDescending(arr); // сортуємо масив від найбільшого до найменшого
        System.out.println("Desc: " + Arrays.toString(sortedArrDesc));

        int[] sortedArrInner = sortArrayInner(arr); // сортуємо масив - від країв найбільші в середині найменші
        System.out.println("Inner: " + Arrays.toString(sortedArrInner));
    }

    // метод для сортування масиву від найменшого до найбільшого
    public static int[] sortArrayAscending(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    // метод для сортування масиву від найбільшого до найменшого
    public static int[] sortArrayDescending(int[] arr) {
        Arrays.sort(arr);
        int[] sortedArrDesc = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArrDesc[i] = arr[arr.length - i - 1];
        }
        return sortedArrDesc;
    }

    // метод для сортування масиву - з країв найбільші, всередині найменші
    public static int[] sortArrayInner(int[] arr) {
        Arrays.sort(arr);
        int[] sortedArrInner = new int[arr.length];
        int count = 1;
        for (int i = arr.length; i > 0; i--) {
            if ((arr.length - i)%2 == 0) {
                sortedArrInner[(arr.length - i) / 2] = arr[i - 1];
            } else {
                sortedArrInner[arr.length - count] = arr[i - 1];
                count++;
            }
        }
        return sortedArrInner;
    }
}

