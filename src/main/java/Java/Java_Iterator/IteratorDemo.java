package Java.Java_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String args[]) {
        // Создаём список массивов
        ArrayList al = new ArrayList();

        // Добавляем элементы к списку массивов
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Используем итератор, для отображения элементов al
        System.out.print("Начальное содержание al: ");
        Iterator itr = al.iterator();

        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
            if (element.equals("E")) break;
        }
        System.out.println();
        System.out.print("содержание al: ");
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
    }
}