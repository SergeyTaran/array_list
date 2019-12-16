package com.telran;

import com.telran.collection.OurArrayList;
import com.telran.performance_test.ArrayListOperationsStrategy;
import com.telran.performance_test.LinkedListOperationsStrategy;
import com.telran.performance_test.ListOperationsStrategy;
import com.telran.performance_test.ListPerformanceTester;


public class Application {

    public static void main(String[] args) {
//        OurArrayList list = makeHumanList();
//
//        Human anotherPetya = new Human("Petya", 20);
//        list.remove(anotherPetya);
//
//        System.out.println(anotherPetya);
//        System.out.println(anotherPetya.toString());

        ListOperationsStrategy arrayStrategy = new ArrayListOperationsStrategy();
        ListOperationsStrategy linkedStrategy = new LinkedListOperationsStrategy();

        ListPerformanceTester arrayTester = new ListPerformanceTester(arrayStrategy);
        ListPerformanceTester linkedTester = new ListPerformanceTester(linkedStrategy);

        arrayTester.testAppendPerformance(1000);
        arrayTester.testGetPerformance(1000,100);
        linkedTester.testAppendPerformance(1000);
        linkedTester.testGetPerformance(1000,100);

    }

    static OurArrayList makeHumanList() {
        Human vasya = new Human("Vasya", 20);
        Human petya = new Human("Petya", 20);
        Human masha = new Human("Masha", 20);

        OurArrayList res = new OurArrayList();
        res.append(vasya);
        res.append(petya);
        res.append(masha);
        return res;
    }

}
