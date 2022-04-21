package ru.itmo.lessons.lesson17;

import ru.itmo.lessons.lesson16.Course;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        // TODO 1: Создать поток целых чисел (-560, 312, 12, -1, 45, 0, 0, 23, -2, 221)
        //  - оставить в потоке только отрицательные элементы
        //  - выбрать 5 первых элементов
        //  - возвести каждый элемент в квадрат
        //  - вывести каждый элемент в консоль

        Stream<Integer> integerStream = Stream.of(-560, 312, 12, -1, 45, 0, 0, 23, -2, 221);
        integerStream.filter(num -> num<0)
                .limit(5)  //поток из 5 элементов
                .map(num -> num*num) //промежуточные методы
                .forEach(System.out::println); //конечный метод либо .foreach(elem -> System.out.println(elem));
        // после конечной операции мы закрываем поток и не можем больше с ним работать

        // TODO 2: Создать поток целых чисел (-6, 45, 12, -77, 77, 45, 6, -6, 0, 0, 12)
        //  - оставить в потоке только уникальные элементы
        //  - отсортирует в натуральном порядке
        //  - вывести каждый элемент в консоль

        //конечные методы

        Stream<Integer> integerStream1 = Stream.of(-6, 45, 12, -77, 77, 45, 6, -6, 0, 0, 12);
        integerStream1.distinct()
                .sorted()
                .forEach(System.out::println);

        // TODO 3: anyMatch, allMatch, noneMatch
        //  - создать поток целых чисел (411, 7, 90, -1000, 0, 2, 71) и
        //    проверить, есть ли в потеке элемент со значением 0

        Stream<Integer> integerStream2 = Stream.of(411, 7, 90, -1000, 0, 2, 71);
        System.out.println(integerStream2.anyMatch(num -> num ==0)); //true

                //  - создать поток целых чисел (411, 7, 90, -1000, 0, 2, 71) и
        //    проверить, состоит ли поток из только положительных элементов

        Stream<Integer> integerStream3 = Stream.of(411, 7, 90, -1000, 0, 2, 71);
        System.out.println(integerStream3.allMatch(num -> num >0)); //false

        //  - создать поток целых чисел (411, 7, 90, -1000, 0, 2, 71) и
        //    проверить, что в потоке нет значений больше 10_000

        Stream<Integer> integerStream4 = Stream.of(411, 7, 90, -1000, 0, 2, 71);
        System.out.println(integerStream4.noneMatch(num -> num >10000));//true ни один не больше 10000


        String[] colors = {"white", "black", "red", "yellow", "yellowgreen"};
        // TODO 4: findFirst - взять первый | findAny - взять произвольный

//конечные методы
        // Optional<T> - null Safe Container
        String color = Arrays.stream(colors).findFirst().get();
        color = Arrays.stream(colors).findFirst().orElse("yellow");
       boolean isPresent =  Arrays.stream(colors).findFirst().isPresent(); //возвращает тру если в контейнере не нал


        // TODO 5: Создать поток из элементов массива colors
        //  - пропустить 2 первых элемента
        //  - оставить в потоке только цвета, начинающиеся на 'y'
        //  - вывести каждый элемент в консоль

        Arrays.stream(colors).skip(2)
                .filter(elem -> elem.startsWith("y"))
                .forEach(System.out::println);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(Course.getInstance());
        courses.add(Course.getInstance());
        courses.add(Course.getInstance());
        courses.add(Course.getInstance());
        courses.add(Course.getInstance());
        courses.add(Course.getInstance());

        // TODO 6: Создать поток из элементов списка course и выбрать минимальный по стоимости курс,
        //  вывести курс в консоль

        Course minByPrice = courses.stream()
                .min((c1, c2) -> (int) (c1.getPrice() - c2.getPrice()))  //конечные методы method compare int compare (T o1, To2);
                .orElse(Course.getInstance());
        System.out.println(minByPrice);

        // TODO 7: Создать поток из элементов списка course и выбрать максимальный по продолжительности курс,
        //  вывести курс в консоль

        Course maxByDuration = courses.stream()
                .max(Comparator.comparing(Course::getDuration))  //второй способ компеир
                .orElse(Course.getInstance());
        System.out.println(maxByDuration);

        // TODO 7: на основе списка курсов получить массив курсов дороже 20000
        //  В итоге должен получиться массив Course[]

        Course[] coursesArr = courses.stream()
                .filter(course -> course.getPrice()>20000)
                //.toArray(); Object[] - будет типа обджект
                .toArray(Course[] ::new); //ссылка на конструктор массива заданного типа


        // TODO 8: увеличить стоимость каждого курса с продолжительностью более 3х месяцев на 5000 (из списка course)
        //  В итоге должен получиться List<Course>
        // map(function) - peek (consumer)
        //function создает новые, peek не создается новых элементов
        //если бы мы написали .map new stream

        List<Course> courseList = courses.stream()
                .filter(course -> course.getDuration()>3)
                .peek(course -> course.setPrice(course.getPrice()+5000))
                .collect(Collectors.toList()); // List<Course> // arraylist
        //.collect(Collectors.toSet()); - если нужно множество // Set<Course> //hashmap
        //.collect(Collectors.toCollection(ArrayList::new));


        // TODO 9:  на основе списка курсов создать множество, в который войдут курсы с продолжительностью
        //  меньше 4 месяцев.  В итоге должен получиться Set<Course>

        // TODO 10:  на основе списка курсов создать список, в который войдут уникальные курсы,
        //  отсортированные по стоимости и продолжительности.
        //  В итоге должен получиться ArrayList<Course>


        colors = new String[]{"blue", "orange", "brown", "white"};
        // TODO 11:  на основе массива colors создать мапу Map<String, Integer>,
        //  где ключи - элементы массива, значения - размер элемента массива

        Map<String, Integer> map = Arrays.stream(colors)
                .collect(Collectors.toMap(
                        //elem -> elem
                        Function.identity(),  //ключи color
                       elem -> elem.length(),   // значение
                        (elem1, elem2) -> elem1 //как формировать значения, если ключи одинаковые
                ));
        System.out.println(map);

        String[][] strings = {
                {"45", "78", "-90", "0", "1", "1"},
                {"441", "14","14", "28"},
                {"122", "-6", "10", "50"},
        };

        // map - flatMap
        // TODO 12: В каждом вложенном массиве оставить только уникальные элементы, отсортировать каждый вложенный массив.
        //  В итоге должен получиться массив String[][]

        String[][] strings1 = Arrays.stream(strings)
                .map(elem -> Arrays.stream(elem).distinct().sorted().toArray(String[]::new))  //elem - подмассив
                .toArray(String[][]::new);
        System.out.println(Arrays.deepToString(strings1));

        // TODO 13: На основе массива strings создать одномерный массив уникальных элементов, массив отсортировать.
        //  В итоге должен получиться массив String[]
        String[] strings2 = Arrays.stream(strings)
                .flatMap(elem -> Arrays.stream(elem).distinct().sorted())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(strings2));

    }
}