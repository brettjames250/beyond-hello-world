package org.example.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AverageService {


    public static Double meanAverage(File file) throws FileNotFoundException {
        List<Double> list = fileToList(file);
        Double sum = 0.0;
        for (Double eachNumber : list) {
            sum += eachNumber;
        }
        return sum / list.size();
    }

    public static Double minimum(File file) throws FileNotFoundException {
        List<Double> list = fileToList(file);
        Optional<Double> min = list.stream().min(Comparator.naturalOrder());
        return min.get();
    }

    public static Double maximum(File file) throws FileNotFoundException {
        List<Double> list = fileToList(file);
        Optional<Double> max = list.stream().max(Comparator.naturalOrder());
        return max.get();
    }

    public static Double medianAverage(File file) throws FileNotFoundException {
        List<Double> list = fileToList(file);
        list.sort(Comparator.naturalOrder());
        return (list.size() / 2) == 0 ? list.get((list.size() / 2))  : list.get((list.size() / 2) + 1);
    }

    private static List<Double> fileToList(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<Double> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            list.add(Double.valueOf(line));
        }
        return list;
    }

}
