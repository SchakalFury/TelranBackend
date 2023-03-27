package Homework09032023;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IntegerListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 5000; i++) {
            list.add(new Integer(i));
        }

        //добавить в список элемент (в начало и в конец)

        Integer int1 = new Integer(5002);
        Integer int2 = new Integer(5006);

        list.addFirst(int1);
        list.addLast(int2);


        //узнать длину списка
        System.out.println(list.size());

        //удалить элемент из списка (по индексу и без)

        list.remove(4000);
        list.remove((Integer)5006);

        //узнать пустой список или нет (вернет false если присутствуют элементы,true если пустой)

        System.out.println(list.isEmpty());

        //обойти список и вывести на консоль каждый элемент.

        ListIterator<Integer> listIter = list.listIterator();
        while(listIter.hasNext()){

            System.out.println(listIter.next());
        }

        //2)
        //Могут ли реализации интерфейса java.util.List хранить одинаковые
        //элементы (дубликаты)? Напишите код программы, который демонстрирует ответ на этот вопрос.

        //Да, реализации интерфейса `java.util.List` могут хранить дубликаты элементов.

        List<String> list1 = new ArrayList<String>();

        list1.add("apple");
        list1.add("banana");
        list1.add("apple");
        list1.add("cucumber");

        System.out.println(list);

        //В этом примере мы создаем список `list` и добавляем в него элементы "apple", "banana", "apple" и "cucumber". Метод `System.out.println(list)` выводит содержимое списка на экран:
        //[apple, banana, apple, cucumber]
        //Как видно из вывода, список хранит дубликаты элемента "apple".
    }
}
