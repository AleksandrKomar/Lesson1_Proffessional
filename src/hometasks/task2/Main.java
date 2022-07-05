package hometasks.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add("Елемент " + i);
        }

        //как было сказано в материалах урока для листов,
        //что лучше использовать оптимизированный итератор под cписки

        for (ListIterator<String> stringIterator = list.listIterator(); stringIterator.hasNext(); ) {
            System.out.println(stringIterator.next());
        }

        //но можно и через обычный - урезанный по методам
        System.out.println("--------------------");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
