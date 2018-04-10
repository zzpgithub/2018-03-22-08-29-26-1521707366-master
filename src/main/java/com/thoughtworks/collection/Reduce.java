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
        for (Integer integer : arrayList) {
            if (integer % 2 == 0) {
                return integer;
            }
        }
        return -1;
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (this.arrayList.size() != arrayList.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if(this.arrayList.get(i) != arrayList.get(i)){
                return false;
            }
        }
        return true;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        for (Integer integer : arrayList) {
            singleLink.addTailPointer(integer);
        }
        if (arrayList.size() % 2 == 0) {
            return (double) (Integer.parseInt(singleLink.getNode(arrayList.size() / 2).toString()) + Integer.parseInt(singleLink.getNode(arrayList.size() / 2 + 1).toString()))/2;
        } else {
            return (double) Integer.parseInt(singleLink.getNode(arrayList.size() / 2).toString());
        }
    }

    public int getLastOdd() {
        for(int i = arrayList.size()-1; i>=0; i--) {
            if (arrayList.get(i) % 2 == 1) {
                return arrayList.get(i);
            }
        }
        return -1;
    }

    public int getIndexOfLastOdd() {
        for(int i = arrayList.size()-1; i>=0; i--) {
            if (arrayList.get(i) % 2 == 1) {
                return i;
            }
        }
        return -1;
    }
}
