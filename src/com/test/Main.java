package com.test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //найти уникальные символы
        Stream.of("a, b , c, a b csdfs d esdf  fdgdf d c d d")
                .map(e-> e.split("")) //получаем массив букв
                .flatMap(Arrays::stream) //все это превращаем в одинарный stream
                .distinct() //оставляем только уникальные значения
                .sorted() //сортируем по алфавиту
                .forEach(System.out::print);// выводим на печать
        System.out.println("\n__________________________");
//OUTPUT
/*
  ,abcdefgs

// */

        //найти уникальные символы
        System.out.println(
                Stream.of("hello hi hi my name is is bye hello bye how are how you")
                        .map(e-> e.split(" "))
                        .flatMap(Arrays::stream)
                        .distinct()
                        .sorted()
                        .collect(Collectors.joining(" ", "Уникальные слова: ", ""))//результат собираем в одну строку, объяединяем выводим с помощью пробела, в начале пишем Уникальные слова, в конце ничего не ставим
        );

        //OUTPUT
        /*
        * Уникальные слова: are bye hello hi how is my name you
        * */
    }
}
