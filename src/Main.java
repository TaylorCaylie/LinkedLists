import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    GenLinkedList<Integer> list = new GenLinkedList<>();

    list.addFront(5);
    System.out.println("Adding unto the front of the list (first iteration) : ");
    list.output();

    System.out.println("\nAdding unto the front of the list (second iteration) : ");
    list.addFront(10);
    list.output();

    System.out.println("\nAdding unto the front of the list (third iteration) : ");
    list.addFront(15);
    list.output();

    System.out.println("\nAdding unto the back of the list (first iteration) : ");
    list.addEnd(0);
    list.output();

    System.out.println("\nAdding unto the back of the list (second iteration) : ");
    list.addEnd(-5);
    list.output();

    System.out.println("\nRemove front element");
    list.removeFront();
    list.output();

    System.out.println("\nRemove back element");
    list.removeEnd();
    list.output();

    System.out.println("\nAdd item to nth index in the list\n(In this case add value 5 at index 0): ");
    list.set(0,5);
    list.output();

    System.out.println("\nGet element at position n\n(In this case position 1): ");
    System.out.println(list.get(1));

    System.out.println("\nSwitch two items given their positions\n(): ");
    list.swap(0,1);
    list.output();

    System.out.println("\n Remove occurences of a given value: ");
    list.removeMatching(5 );
    list.output();

    System.out.println("\n Shift list a given value (by 2 in this case): ");
    list.shift(2 );
    list.output();

    System.out.println("\n Shift list a given value (by 2 in this case): ");
    list.shift(2 );
    list.output();


    System.out.println("\n Erase elements in list with given index start value and number of elements: ");
    list.erase(2,1 );
    list.output();

    System.out.println("\n Insert list with given list: ");
    list.insertList(5,5);
    list.output();

    }
}
