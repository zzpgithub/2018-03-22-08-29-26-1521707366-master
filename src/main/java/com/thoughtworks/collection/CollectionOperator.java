package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        //throw new NotImplementedException();
        List<Integer> result = new ArrayList<>();
        if (left <= right) {
            for (int i = left; i <= right; i++)
                result.add(i);
        } else {
            for (int i = left; i >= right; i--) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
//        throw new NotImplementedException();
        List<Integer> result = new ArrayList<>();
        if (left <= right) {
            for (int i = left; i <= right; i++)
                if (i % 2 == 0) {
                    result.add(i);
                }
        } else {
            for (int i = left; i >= right; i--)
                if (i % 2 == 0) {
                    result.add(i);
                }
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i : array) {
            if(i % 2 == 0){
                result.add(i);
            }
        }
        return result;
    }

    public int popLastElment(int[] array) {
//        throw new NotImplementedException();
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result = new ArrayList<>();
        List<Integer> arrayToList = new ArrayList<>();
        for (int i : firstArray) {
            arrayToList.add(i);
        }
        for (int i : secondArray) {
            if (arrayToList.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> result = new ArrayList<>();
        for (int i : firstArray) {
            result.add(i);
        }
        for (int i:secondArray) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
