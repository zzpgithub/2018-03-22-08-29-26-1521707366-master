package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int max = arrayList.get(0);
        for (Integer integer : arrayList) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }

    public double getMinimum() {
        int min = arrayList.get(0);
        for (Integer integer : arrayList) {
            if (integer <  min) {
                min = integer;
            }
        }
        return min;
    }

    public double getAverage() {
        throw new NotImplementedException();
    }

    public double getOrderedMedian() {
        throw new NotImplementedException();
    }

    public int getFirstEven() {
        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
