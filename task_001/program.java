/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет 
 * “перевернутый” список.
 */

import java.util.LinkedList;

public class program{
    public static void main(String[] args) {
        LinkedList<Integer> numbList = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            numbList.add(i);
        }
        printArray(numbList);
        
        int index = 1;   
        for (int i = 0; i < numbList.size(); i++) {
            for (int j = 0; j < numbList.size() - index; j++) {
                int temp = numbList.get(j);
                numbList.set(j, numbList.get(j + 1));
                numbList.set(j +1, temp);
            }

            index++;
        }
        printArray(numbList);

    }

    public static void printArray(LinkedList<Integer> array){
        StringBuilder printSB = new StringBuilder();
        for (Integer i : array) {
            // System.out.print(i + ", ");
            printSB.append(i + ", ");
        }
        String printOut = printSB.substring(0, printSB.length() - 2);
        System.out.println(printOut);
    }
}