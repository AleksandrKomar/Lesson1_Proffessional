package hometasks.task3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //для теста - сделал так, чтобы не переназывать переменные

        //1.Ничего не равно

        System.out.println("-------- Все элементы класса Animal разные --------\n---------Но по умолчанию первыми сравниваются скорости-----------\n");

        {
            Animal cat = new Animal("Oriental", 7, 25, 5000);
            Animal cat1 = new Animal("Oriental1", 6, 26, 5005);
            Animal dog = new Animal("Labrador", 10, 30, 5025);
            Animal dog1 = new Animal("Labrador1", 11, 33, 5007);
            Animal bird = new Animal("King Penguin", 25, 15, 50010);
            Animal bird1 = new Animal("King Penguin1", 30, 40, 5015);

            //при изменении при создании объекта параметров,
            // вывод меняется, согласно сортировки
            Animal[] c = {cat, dog, bird, cat1, dog1, bird1};

            Arrays.sort(c);   // ClassCastException w/o Comparable

            for (Animal tmp : c) {
                System.out.println(tmp);
            }
        }


        System.out.println("\n-------- Идентичная скрость --------\n");
        //идентичная скорость
        {
            Animal cat = new Animal("Oriental", 7, 25, 5000);
            Animal cat1 = new Animal("Oriental1", 6, 25, 5005);
            Animal dog = new Animal("Labrador", 10, 25, 5025);
            Animal dog1 = new Animal("Labrador1", 11, 25, 5007);
            Animal bird = new Animal("King Penguin", 25, 25, 50010);
            Animal bird1 = new Animal("King Penguin1", 30, 25, 5015);

            //при изменении при создании объекта параметров,
            // вывод меняется, согласно сортировки
            Animal[] c = {cat, dog, bird, cat1, dog1, bird1};

            Arrays.sort(c);   // ClassCastException w/o Comparable

            for (Animal tmp : c) {
                System.out.println(tmp);
            }
        }

        System.out.println("\n-------- Идентичная скорость и вес --------\n");

        //идентичная скорость и вес
        {
            Animal cat = new Animal("Oriental", 10, 25, 5000);
            Animal cat1 = new Animal("Oriental1", 10, 25, 5005);
            Animal dog = new Animal("Labrador", 10, 25, 5025);
            Animal dog1 = new Animal("Labrador1", 10, 25, 5007);
            Animal bird = new Animal("King Penguin", 10, 25, 50010);
            Animal bird1 = new Animal("King Penguin1", 10, 25, 5015);

            //при изменении при создании объекта параметров,
            // вывод меняется, согласно сортировки
            Animal[] c = {cat, dog, bird, cat1, dog1, bird1};

            Arrays.sort(c);   // ClassCastException w/o Comparable

            for (Animal tmp : c) {
                System.out.println(tmp);
            }
        }

        System.out.println("\n-------- Идентичная скорость и цена --------\n");
        //идентичная скорость и цена
        {
            Animal cat = new Animal("Oriental", 7, 25, 5000);
            Animal cat1 = new Animal("Oriental1", 6, 25, 5000);
            Animal dog = new Animal("Labrador", 10, 25, 5000);
            Animal dog1 = new Animal("Labrador1", 11, 25, 5000);
            Animal bird = new Animal("King Penguin", 25, 25, 5000);
            Animal bird1 = new Animal("King Penguin1", 30, 25, 5000);

            //при изменении при создании объекта параметров,
            // вывод меняется, согласно сортировки
            Animal[] c = {cat, dog, bird, cat1, dog1, bird1};

            Arrays.sort(c);   // ClassCastException w/o Comparable

            for (Animal tmp : c) {
                System.out.println(tmp);
            }
        }

        System.out.println("\n-------- Идентичная скорость, цена и вес --------\n");
        //идентичная скорость/цена / вес
        {
            Animal cat = new Animal("Oriental", 10, 25, 5000);
            Animal cat1 = new Animal("Oriental1", 10, 25, 5000);
            Animal dog = new Animal("Labrador", 10, 25, 5000);
            Animal dog1 = new Animal("Labrador1", 10, 25, 5000);
            Animal bird = new Animal("King Penguin", 10, 25, 5000);
            Animal bird1 = new Animal("King Penguin1", 10, 25, 5000);

            //при изменении при создании объекта параметров,
            // вывод меняется, согласно сортировки
            Animal[] c = {cat, dog, bird, cat1, dog1, bird1};

            Arrays.sort(c);   // ClassCastException w/o Comparable

            for (Animal tmp : c) {
                System.out.println(tmp);
            }
        }

    }

}
