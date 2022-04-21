package ru.itmo.lessons.lesson17;

import ru.itmo.lessons.lesson16.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsAPI {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>(Course.getInstances(20));
        // TODO 1: Создать мапу, где ключи - названия курсов, значения
        //  - списки курсов с указанным в ключе названием

        Map<String, List<Course>> map1 = courses.stream()
                .collect(Collectors.groupingBy(Course::getName));



        // TODO 2: Создать мапу, где ключи - продолжительность курсов,
        //  значения - списки курсов с указанной в ключе продолжительностью


        Map<Integer, ArrayList<Course>> map2 = courses.stream()
                .collect(Collectors.groupingBy(Course::getDuration,
                        Collectors.toCollection(ArrayList::new)));

        // TODO 3: Создать мапу, где ключи - названия курсов,
        //  значения - количество курсов с указанным в ключе названием

        Map<String, Long> map3 = courses.stream()
                .collect(Collectors.groupingBy(Course::getName,
                        Collectors.counting()));


        // TODO 3: Создать мапу, где ключи - названия курсов,
        //  значения - средняя стоимость курсов с указанным в ключе названием

        Map<String, Double> map4 = courses.stream()
                .collect(Collectors.groupingBy(Course::getName,
                        Collectors.averagingDouble(Course::getPrice)));


        // TODO 4: Создать мапу, где ключи - названия курсов,
        //  значения - мапа,
        //  в которой  ключи - продолжительность курса,
        //  а значения - списки курсов с указанной в ключе продолжительностью

        Map<String, Map<Integer,List<Course>>> map5 = courses.stream()
                .collect(Collectors.groupingBy(Course::getName,
                        Collectors.groupingBy(
                                Course::getDuration
                        )));

        // TODO 5: Создать множество уникальных названий курсов в отсортированном порядке
    }
}