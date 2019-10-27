package com.zhengyu.lambda.stream;

import com.google.common.collect.ImmutableList;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author zhengyu.nie
 * 2019.10.27
 */
public class StreamTest {
    static final Person edison = new Person.Builder()
            .name("edison")
            .age(25)
            .companyName("a")
            .locationCity("hangzhou")
            .salary(100)
            .sex("male")
            .build();

    static final Person bruce = new Person.Builder()
            .name("bruce")
            .age(32)
            .companyName("a")
            .locationCity("hangzhou")
            .salary(30)
            .sex("male")
            .build();

    static final Person fiona = new Person.Builder()
            .name("fiona")
            .age(23)
            .companyName("b")
            .locationCity("beijing")
            .salary(200)
            .sex("female")
            .build();

    static final List<Person> personArrayList = ImmutableList.of(edison, bruce, fiona);

    public static void main(String[] args) {

        List<Person> resultList = personArrayList.stream()
                .filter(getPredicate())
                .sorted(getComparator())
                .collect(Collectors.toList());

        System.out.println(resultList);

    }

    private static Comparator<Person> getComparator() {
        return ageComparator().thenComparing(salaryComparator()).reversed()
                .thenComparing(sexComparator()).reversed();
    }

    private static Predicate<Person> getPredicate() {
        return namePredicate().and(agePredicate().or(salaryPredicate()));
    }

    private static Predicate<Person> namePredicate() {
        return person -> person.getName() != null;
    }

    private static Predicate<Person> agePredicate() {
        return person -> person.getAge() > 18;
    }

    private static Predicate<Person> salaryPredicate() {
        return person -> person.getSalary() > 50;
    }

    private static Comparator<Person> ageComparator() {
        return Comparator.comparing(Person::getAge);
    }

    private static Comparator<Person> salaryComparator() {
        return Comparator.comparing(Person::getSalary);
    }

    private static Comparator<Person> sexComparator() {
        return Comparator.comparing(Person::getSex);
    }
}
