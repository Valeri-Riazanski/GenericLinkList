package com.val.riazanski;

public class Test {
    public static void main(String[] args) {
        GenericLinkList<String> genericList = new GenericLinkList<String>();
        Book book = new Book(3);
        String str = book.createWord(3);
        genericList.add(str);
        System.out.println(ConsoleColors.GREEN + genericList.size() + "  " + genericList.toString() + ConsoleColors.RESET);
        str = book.createMetaWord(3);
        genericList.add(str);
        System.out.println(ConsoleColors.GREEN + genericList.size() + "  " + genericList.toString() + ConsoleColors.RESET);
        genericList.removeFirst();
        System.out.println(ConsoleColors.PURPLE + genericList.size() + "  " + genericList.toString() + ConsoleColors.RESET);


    }
}