package ru.fomin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework {

    private static List<Thing> things;
    private static Bag bag;

    public static void main(String[] args) {
        System.out.println(pow(4,4));
        things = new ArrayList<>(Arrays.asList(
                new Thing(5, 3),
                new Thing(2, 7),
                new Thing(4, 1),
                new Thing(9, 8),
                new Thing(3, 3)
        ));
        bag = new Bag();

        System.out.println(pack(things.size()-1, 12));
    }

    /***
     * ВОзведение в степень
     * @param a - число
     * @param b - степень
     * @return - результат возведения
     */
    public static int pow(int a, int b){
        if(b == 1){
            return a;
        }
        return pow(a, b-1)*a;
    }

    public static int pack(int i, int weight){
        if(i < 0){
            return 0;
        }
        if(weight < things.get(i).getWeight()){
            return pack(i-1, weight);
        }

        return Math.max(pack(i-1, weight - things.get(i).getWeight()) + things.get(i).getTreasure(),
                pack(i-1, weight));
    }
}
