package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
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
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        return (double)sum/arrayList.size();
    }

    public double getOrderedMedian() {
        List<Integer> result = arrayList;
        int size = result.size();
        if(size % 2 == 0){
            return (double)(result.get(size/2 - 1) + result.get(size/2))/2;
        }else {
            return result.get(size/2);
        }
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
