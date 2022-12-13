/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - 
 * помещает элемент в конец очереди, dequeue() - возвращает первый элемент из 
 * очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
 */

package task_002;

import java.util.LinkedList;

public class program {
    // LinkedList<Integer> lList = new LinkedList<>();
    public static int front = -1;
    public static int rear = -1;

    public static void main(String[] args) {
        LinkedList<Integer> lList = new LinkedList<>();
        System.out.println("Заполнение");
        enqueue(lList, 1);
        enqueue(lList, 2);
        enqueue(lList, 3);
        enqueue(lList, 4);

        System.out.println("Первый элемент");
        first(lList);

        System.out.println("Удоление первого элемента");
        dequeue(lList);

        // printArray(numbList);
    }

    public static boolean isEmpty(){
        if (front ==  -1 && rear == -1){
            return true;
        }
        else return false;
    }

    public static void enqueue(LinkedList<Integer> lList, int element){
        if (front == -1) front = 0;
            rear++;
            lList.add(element);
        printArray(lList);
    }

    public static void dequeue(LinkedList<Integer> lList){
        if (isEmpty()){
            System.out.println("Очередь пуста!");
        }else{
            lList.remove(front);
            if (front >= rear){
                front = -1;
                rear = -1;
            }else front++;
        }
        printArray(lList);
    }

    public static void first(LinkedList<Integer> lList){
        if (isEmpty()){
            System.out.println("Очередь пуста!");
        }else {
            System.out.println(lList.peekFirst());
        }
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
