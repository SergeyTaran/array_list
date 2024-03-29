package com.telran.performance_test;

import com.telran.collection.OurList;

public class ListPerformanceTester {

    private final ListOperationsStrategy strategy;

    public ListPerformanceTester(ListOperationsStrategy strategy) {
        this.strategy = strategy;
    }

    public long testAppendPerformance(int nTimes) {
        long now = System.currentTimeMillis();
        strategy.append(nTimes);
        return System.currentTimeMillis() - now;
    }

    public long testGetPerformance(int nTimes, int length) {
        OurList list = strategy.getFilledList(length);
        long now = System.currentTimeMillis();
        strategy.get(nTimes, list);
        return System.currentTimeMillis() - now;
    }
}