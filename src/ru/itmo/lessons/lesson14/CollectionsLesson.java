package ru.itmo.lessons.lesson14;

import java.util.*;

public class CollectionsLesson {
    public static void main(String[] args) {
        // 1. многопоточная или однопоточная среда
        // 2. возможность хранить дублирующиеся элементы
        // 3. возможность хранить элементы в порядке добавления
        // 4. возможность хранить элементы в отсортированном виде и тд

        System.out.println("ArrayList");
        // реализован на основе массива
        // можно хранить null
        // можно хранить дублирующиеся элементы
        // порядок хранения элементов соответсует порядку добавления

        Student student1 = new Student(1, "Max", 17);
        Student student2 = new Student(2, "Anna", 21);
        Student student3 = new Student(3, "Paul", 23);
        Student student4 = new Student(4, "Helen", 19);

        ArrayList<Student> studentArrayList = new ArrayList<>(); //10 жлементов по умолчанию хранит
        studentArrayList = new ArrayList<>(30); // тут сами указали сколько
        //  System.out.println(studentArrayList.size()); //0 возвращает количество элементов - мы еще не добавили ничего
        studentArrayList.add(student1);
        studentArrayList.add(1, student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4); //index = 10 - IndexOutOfBounder обращение к несуществующему индексу
        System.out.println(studentArrayList.size());
        studentArrayList.add(null);
        //   studentArrayList.trimToSize(); // метод который урезает количесвто коллекции, когда добавили меньше, чем сам размер
        System.out.println(studentArrayList.get(1)); //Student{id=2, name='Anna', age=21} возращает ссылку на объект

        //удаление
        System.out.println(studentArrayList.remove(4)); // возвращает ссылку на удаленный элемент
        studentArrayList.remove(student1); //true
        System.out.println(studentArrayList);

        //создание лист
        Student[] students = {student1, student2};
        List<Student> studentList = Arrays.asList(students);
        studentArrayList.removeAll(studentList);
        System.out.println(studentArrayList);

        studentArrayList.clear(); //удаляет все элементы из коллекции
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        for (Student student : studentArrayList) {
            // к имени каждого студента добавить строку "Student:"
            student.setName("Student: " + student.getName());
            //  удвление элемента в цикле приведет к
            // ConcurrentModificationException
        }
        // удалить всех старше 20 лет
        Iterator<Student> iterator = studentArrayList.listIterator();
        while (iterator.hasNext()) { //пока есть след элемент цикл продолжается
            if (iterator.next().getAge() > 20) {
                iterator.remove();
            }
        }

        //LinkedList
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(student1);// создается объект типа Node
        // внутри не массив
        // можно хранить дублирующиеся элементы
        //порядок хранения элементов соответсвует порядку добавления

        System.out.println("Set");
        // множества используются для хранения уникальных элементов
        // обязательно должен быть переопределен метод equals

        // HashSet
        // позволяет хранить null (всегда будет на первом месте)
        // порядок хранения может отличаться от порядка добавления
        // основан на hash таблице и нужно преопределить метод hashcode

        Student student5 = new Student(1, "Max", 17);
        Student student6 = new Student(2, "Anna", 21);
        Student student7 = new Student(3, "Alex", 23);
        Student student8 = new Student(4, "Alex", 26);

        HashSet<Student> studentHashSet = new HashSet<>();
        List<Student> list = Arrays.asList(student5, student6, student7, student8);
        studentHashSet = new HashSet<>(list);//возратит тру или фолс так как икуалс переопределили в классе студент
        studentHashSet.add(student1);
        studentHashSet.remove(student7);
        int sum = 0;
        for (Student student:studentHashSet){
            sum = sum + student.getAge();
        }
        int mid = sum/studentHashSet.size();
        System.out.println(mid);

        // LinkedHashSet медленее, но порядок хранения соответсвует порядку добавлению

        // TreeSet
        // 1.хранит элементы в отсортированном виде
        // 2. нельзя добавить null - ошибка будет
        // 3. основан на алгоритме красно-черного дерева
        // для добавления элементов в TreeSet необходимо:
        // 1. чтобы класс, элементы которого будут храниться в TreeSet
        // реализовал интерфейс Comparable и его метод compareTo

        TreeSet<Student> treeSet1 = new TreeSet<>();
        treeSet1.add(student1);
        treeSet1.add(student2);
        treeSet1.add(student3);
        treeSet1.add(student4);
        treeSet1.add(student7);

        // 2. создать отдельные экзмепляры класса Comparator
        Comparator<Student> studentComparator = new NameComparator().thenComparing(new AgeComparator());
        TreeSet<Student> treeSet2 = new TreeSet<>(studentComparator);
      //  Student student7 = new Student(3, "Alex", 23);
      //  Student student8 = new Student(4, "Alex", 26);
        treeSet2.add(student7);
        treeSet2.add(student8);
        System.out.println(treeSet2);
    }
}
