/*
 * Написать программу, определяющую правильность расстановки скобок в выражении.

    a+(d*3) - истина
    \[a+(1*3) - ложь
    \[6+(3*3)] - истина
    {a}\[+\]{(d*3)} - истина
    <{a}+{(d*3)}> - истина
    {a+]}{(d*3)} - ложь
 */

package task_003;

import java.util.ArrayDeque;
import java.util.Deque;

public class program {
    public static void main(String[] args) {
        String[] arr = {"a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "<{a}+{(d*3)}>", "{a+]}{(d*3)}"};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s: %s\n", arr[i], function(arr[i]));
        }
    }

    public static boolean function(String str){
        char[] array = str.toCharArray();
        Deque<Character> dq = new ArrayDeque<>();
        for (Character c : array) {
            switch (c){
                case '(':
                case '[':
                case '{':
                    dq.addFirst(c);
                    break;
                case ')':
                    if (dq.isEmpty() || !dq.removeFirst().equals('(')) 
                        return false;
                    break;
                case ']':
                    if (dq.isEmpty() || !dq.removeFirst().equals('[')) 
                        return false;
                    break;
                case '}':
                    if (dq.isEmpty() || !dq.removeFirst().equals('{')) 
                        return false;
                    break;
            }
        }
        return dq.isEmpty();
    }
}
