package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : array) {
            result.add(integer * 3);
        }
        return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
        for (Integer integer : array) {
            result.add(letters[integer - 1]);
        }
        return result;
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<>();
        for (Integer integer : array) {
            if ( (integer - 1 )/ letters.length < 1) {
                result.add(letters[integer - 1]);
            } else {
                result.add(letters[(integer - 1) / letters.length - 1] + letters[(integer - 1) % letters.length]);
            }
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        List<Integer> result = new ArrayList<>(array);
//        Collections.sort(result);
//        Collections.reverse(result);
        Collections.sort(result,(a,b)-> b.compareTo(a));
        return result;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> result = new ArrayList<>(array);
        //Collections.reverse(result);
        Collections.sort(result,(a,b)-> a.compareTo(b));
        return result;
    }
}
