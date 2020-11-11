package ru.geekbrains.lessons;

import java.util.*;

public class Main {

    private static final String [] nameClass = {"A", "B", "C"};
    static final int maxClassSize = 25;

    public static void main(String[] args) {
	/*
	Разработать программу, распределяющую школьников по классам.
	Что должно быть реализовано:
1. Школьники разделяются между несколькими классами. "А", "Б", "В" и т.д. Минимум классов в параллели: 1.
2. В каждый учебный класс можно внести ученика Schoolboy, у которого есть имя, фамилия и возраст.
3. Минимальное кол-во учеников: 12, максимальное: 25.
4. Как только кол-во учеников подходит к крайней планке, добавляется еще один учебный класс и школьники
распределяются по классам с учетом нового. См. пункт 3 и 6*.
5. Добавить несколько классов (1, 2, 3, ... 11). Выбор, в какой определять, зависит от возраста школьника
6**. Распределение по буквам параллели зависит от средней оценки школьника (внести в объект Schoolboy).
Но при перераспределении учеников затрагивать лишь тех, кто не соответствует общему уровню подготовки
(школьники не хотят постоянно переходить из класса в класс, теряя друзей)
	 */

        ArrayList<Schoolboy> students = new ArrayList<>();
        students.add(new Schoolboy(12,4, "Русских Антон"));
        students.add(new Schoolboy(13,4,"Орлов Владислав"));
        students.add(new Schoolboy(12,3,"Бурдюков Константин"));
        students.add(new Schoolboy(12,4,"Орлов Владислав"));
        students.add(new Schoolboy(13,4,"Орлов Владислав"));
        students.add(new Schoolboy(12,4,"Орлов Владислав"));
        students.add(new Schoolboy(12,4,"Орлов Владислав"));
        students.add(new Schoolboy(13,4,"Орлов Владислав"));
        students.add(new Schoolboy(12,4,"Орлов Владислав"));
        students.add(new Schoolboy(13,4,"Орлов Владислав"));


        Map<String, ArrayList<Schoolboy>> schoolClasses = new HashMap<>(maxClassSize);
        if (Schoolboy.age == 12){
            schoolClasses.put(nameClass[0], students);
        } else if (Schoolboy.age > 12 && Schoolboy.age < 10){
            schoolClasses.put(nameClass[1], students);
        } else;


        // Сортировка учеников по возрасту
        Comparator<Schoolboy> compareByAge = new Comparator<Schoolboy>() {
            @Override
            public int compare(Schoolboy o1, Schoolboy o2) {
                return o1.age - o2.age;
            }
        };

        Collections.sort(students, compareByAge);
    }
}
