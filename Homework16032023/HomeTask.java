package Homework16032023;

import Homework16032023.UtilPackage.Book;
import Homework16032023.UtilPackage.Person;
import Homework16032023.UtilPackage.UniqueLinkedListValues;
import Homework16032023.UtilPackage.UniqueWordsCounter;

import java.util.*;

import static Homework16032023.UtilPackage.Intersection.intersection;

public class HomeTask {
    public static void main(String[] args) {


        //Написать метод, который принимает на вход список (LinkedList) строк
        // и возвращает новый список, состоящий только из уникальных значений из первоначального списка.


//        LinkedList<String> list = new LinkedList<>();
//        list.add("foo");
//        list.add("bar");
//        list.add("baz");
//        list.add("foo");
//        list.add("qux");
//        list.add("bar");
//
//
//        LinkedList<String> uniqueValues = UniqueLinkedListValues.getUniqueValues(list);
//        for (String value : uniqueValues) {
//            System.out.println(value);
//        }

        //Найти количество уникальных слов в тексте с помощью коллекции HashSet:
//        String text = "This is a test text. It contains several words, some of which may be repeated. The test is case-insensitive.";
//        int uniqueWordsCount = UniqueWordsCounter.countUniqueWords(text);
//        System.out.println("The text contains " + uniqueWordsCount + " unique words.");



//       Создать множество HashSet и вывести элементы, у которых длина строки больше 5 символов:
//        HashSet<String> mySet = new HashSet<>();
//        mySet.add("apple");
//        mySet.add("banana");
//        mySet.add("orange");
//        mySet.add("peach");
//        mySet.add("pineapple");
//        mySet.add("strawberry");
//
//
//        for (String element : mySet) {
//            if (element.length() > 5) {
//                System.out.println(element);
//            }
//        }


//Создать карту HashMap, в которой хранятся номера телефонов и фамилии людей. По номеру телефона вывести фамилию:
//        HashMap<String, String> phoneBook = new HashMap<>();
//
//        phoneBook.put("555-1234", "Smith");
//        phoneBook.put("555-5678", "Johnson");
//        phoneBook.put("555-9012", "Williams");
//
//
//        String lastName = phoneBook.get("555-5678");
//        System.out.println("Last name: " + lastName);

        //Написать метод, который принимает на вход два списка (LinkedList)
        // и возвращает новый список, состоящий только из элементов, которые есть в обоих списках.

//        LinkedList<Integer> list1 = new LinkedList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//
//        LinkedList<Integer> list2 = new LinkedList<>();
//        list2.add(2);
//        list2.add(3);
//        list2.add(4);
//
//        LinkedList<Integer> intersection = intersection(list1, list2);
//        System.out.println(intersection);

        //Создать класс Person с полями name и age. Создать ArrayList с
        //объектами класса Person и отсортировать его по возрасту в порядке возрастания

//
//        ArrayList<Person> people = new ArrayList<>();
//        people.add(new Person("Alice", 25));
//        people.add(new Person("Bob", 20));
//        people.add(new Person("Charlie", 30));
//
//
//        Comparator<Person> ageComparator = new Comparator<Person>() {
//            public int compare(Person p1, Person p2) {
//                return p1.getAge() - p2.getAge();
//            }
//        };
//
//        Collections.sort(people, ageComparator);
//        for (Person person : people) {
//            System.out.println(person.getName() + " " + person.getAge());
//        }
      //Создать класс Book с полями title, author и price. Создать TreeSet с
        // объектами класса Book и отсортировать его по цене в порядке убывания

//        TreeSet<Book> books = new TreeSet<>();
//        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 9.99));
//        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 8.99));
//        books.add(new Book("1984", "George Orwell", 7.99));
//
//        // Print the sorted set of books
//        for (Book book : books) {
//            System.out.println(book.getTitle() + " by " + book.getAuthor() + " - $" + book.getPrice());
        }
    }



