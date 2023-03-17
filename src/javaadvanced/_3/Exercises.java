package javaadvanced._3;
import java.util.*;

import static java.util.stream.Collectors.toSet;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
     *
     *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        // Your code here
        Set<String> set = new HashSet<>(list);
        List<String> newList = new ArrayList<>(set);
        System.out.println(newList);
        if (newList.size() == 3){
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     *    Scrivere un metodo che accetta una list di stringhe o un set di stringhe e restituisce un set di stringhe.
     *      * Il metodo deve accettare una collection come parametro
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        System.out.println(toSet(list));

        System.out.println(toSet(set));
    }

    // Write your method for exercise 2 here
    public static <T>Set<T> toSet(Collection<T> collection) {
        return new LinkedHashSet<>(collection);
    }



    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.



        // Your code here
        for (String word : words) {
            int count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, count + 1);
        }
        System.out.println(wordCount);
        /*Ho utilizzato un ciclo for each per iterare tutte le parole contenute nell'arraystream "words",
        dopodichè ho istanziato una variabile int "count" che sfrutta il metodo getOrDefault che restituisce un valore se la chiave esiste
        o 0 se non esiste. Infine ho usato il metodo "put" affinchè mi mandi in output le parole contenute nella mappa wordCount e il numero
        di volte che vengono utilizzate attravrso il + 1 se sono già utilizzate.
        Ho capito bene?
         */


    }

    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer:
     *    A list, is an orderly method of managing our items
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer:
     *    HashMap, allows us to indicate our elements with key value ( students ) and value ( grade )
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer:
     *    TreeMap, will list the values in order according to their age
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer:
     *    HashMap, as for example 2
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer:
     *    List, as for example 1
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer:
     *    HashMap, city (values), population (keys)
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer:
     *    HashMap
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer:
     *    HashMap, courses (keys ) and professors (List?)
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer:
     *    HashMap, movies (keys ) and release dates (values)
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer:
     *    HashMap, flight (keys) and destination times (values)
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer:
     *    HashMap, articles (keys) and publication dates (values)
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer:
     *    HashMap, songs (keys) and release dates (values)
     */

}
