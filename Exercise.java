//Arraylist 15-21
//#15. Write a Java program to join two array lists.
//import java.util.ArrayList;
//
//public class Exercise{
//    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("alma");
//        list1.add("almurut");
//        list1.add("juzum");
//
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("limon");
//        list2.add("mango");
//        list2.add("alcha");
//
//        ArrayList<String> combinedList = new ArrayList<>(list1);
//        combinedList.addAll(list2);
//
//        System.out.println("New Array" +combinedList);
//    }
//}

//#16. Write a Java program to clone an array list to another array list.
//import java.util.ArrayList;
//
//public class Exercise {
//    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("c1");
//        list1.add("c2");
//        list1.add("c3");
//        list1.add("c4");
//        System.out.println("Original list: " + list1);

//        ArrayList<String> list2 = (ArrayList<String>) list1.clone();
//        System.out.println("Cloned list: " + list2);
//    }
//}

//#17. Write a Java program to empty an array list.
//import java.util.ArrayList;
//
//public class Exercise {
//    public static void main(String[] args) {
//        ArrayList<String> words = new ArrayList<>();
//        words.add("c1");
//        words.add("c2");
//        words.add("c3");
//        words.add("c4");
//
//        System.out.println("Original list: " + words);
//
//        words.clear();
//
//        System.out.println("List after clearing: " + words);
//    }
//}

//#18. Write a Java program to test whether an array list is empty or not.
//import java.util.ArrayList;
//
//public class Exercise {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("purplee");
//        colors.add("greeen");
//        colors.add("white");
//        colors.add("black");
//
//        System.out.println("first  list: " + colors);
//        System.out.println("is the list empty? " + colors.isEmpty());
//
//        colors.clear();
//        System.out.println("list after deletion: " + colors);
//        System.out.println("is the list empty? " + colors.isEmpty());
//    }
//}

//#19. Write a Java program for trimming the capacity of an array list.
//import java.util.ArrayList;
//
//public class Exercise {
//    public static void main(String[] args) {
//        ArrayList<String> w1 = new ArrayList<>();
//        w1.add("salam");
//        w1.add("kaksyn");
//        w1.add("viyyy");
//        w1.add("bro");
//
//        System.out.println("first list " + w1);
//        System.out.println("trimming the list size");
//        w1.trimToSize();
//        System.out.println(w1);
//    }
//}

//#20. Write a Java program to increase an array list size.
//import java.util.ArrayList;
//
//public class Exercise {
//    public static void main(String[] args) {
//        ArrayList<String> w1 = new ArrayList<>(2);
//        w1.add("salam");
//        w1.add("bro");
//        w1.add("kaksyn");
//
//        System.out.println("first list: " + w1);
//
//        w1.ensureCapacity(5);
//        w1.add("salam");
//        w1.add("ozun");
//
//        System.out.println("new list: " + w1);
//    }
//}

//#21. Write a Java program to replace the second element of an ArrayList with the specified element.
//import java.util.ArrayList;
//
//public class Exercise {
//    public static void main(String[] args) {
//        ArrayList<String> words = new ArrayList<>();
//        words.add("asd");
//        words.add("krf");
//
//        System.out.println("first list: " + words);
//
//        words.set(1, "fsdf");
//
//        System.out.println("new list: " + words);
//    }
//}

//Linkedlist 20-26
//#20. Write a Java program to retrieve, but not remove, the first element of a linked list.
//import java.util.LinkedList;
//
//public class Exercise{
//    public static void main(String[] args) {
//
//        LinkedList<String> wordsList = new LinkedList<>();
//        wordsList.add("hjak");
//        wordsList.add("gfha");
//        wordsList.add("adde");
//        wordsList.add("word");
//
//        System.out.println("initially " + wordsList);
//
//        String firstElement = wordsList.peekFirst();
//
//        System.out.println("first element: " + firstElement);
//
//        System.out.println("after peeking" + wordsList);
//    }
//}

//21. Write a Java program to retrieve, but not remove, the last element of a linked list.
//import java.util.LinkedList;
//
//public class Exercise {
//    public static void main(String[] args) {
//        LinkedList<String> colorsList = new LinkedList<>();
//
//        colorsList.add("black");
//        colorsList.add("green");
//        colorsList.add("blueee");
//        colorsList.add("purplee");
//        colorsList.add("whitee");
//
//        System.out.println("original linked list: " + colorsList);
//
//        String lastElement = colorsList.peekLast();
//        System.out.println("the last element " + lastElement);
//
//        System.out.println("original linked list: " + colorsList);
//    }
//}

//#22. Write a Java program to check if a particular element exists in a linked list.
//import java.util.LinkedList;
//public class Exercise {
//    public static void main(String[] args) {
//        LinkedList<String> colors = new LinkedList<>();
//        colors.add("Red");
//        colors.add("Green");
//        colors.add("Black");
//        colors.add("White");
//        colors.add("Pink");
//
//        System.out.println("First linked list: " + colors);
//
//        if (colors.contains("white")) {
//            System.out.println("color white is present in the linked list.");
//        } else {
//            System.out.println("color white is not present in the linked list.");
//        }
//
//        if (colors.contains("orange")) {
//            System.out.println("color orange is present in the linked list.");
//        } else {
//            System.out.println("color orange is not present in the linked list.");
//        }
//    }
//}

//#23. Write a Java program to convert a linked list to an array list
//import java.util.*;
//
//public class Exercise {
//    public static void main(String[] args) {
//        LinkedList<String> items = new LinkedList<>();
//        items.add("aple");
//        items.add("bana");
//        items.add("almurut");
//        items.add("adfs");
//        items.add("fwrf");
//
//        System.out.println("first list: " + items);
//
//        List<String> list = new ArrayList<>(items);
//
//        for (String str : list) {
//            System.out.println(str);
//        }
//    }
//}

//#24. Write a Java program to compare two linked lists.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String[] args) {
//        LinkedList<String> list1 = new LinkedList<>();
//        list1.add("affpple");
//        list1.add("anana");
//        list1.add("ffrry");
//        list1.add("sefe");
//        list1.add("sdf");
//
//        LinkedList<String> list2 = new LinkedList<>();
//        list2.add("affpple");
//        list2.add("anana");
//        list2.add("fsfapes");
//        list2.add("fgrange");
//
//        LinkedList<String> comparisonResult = new LinkedList<>();
//        for (String element : list1) {
//            comparisonResult.add(list2.contains(element) ? "Yes" : "No");
//        }
//
//        System.out.println(comparisonResult);
//    }
//}

//#25. Write a Java program to check if a linked list is empty or not.
//import java.util.LinkedList;
//
//public class Exercise {
//    public static void main(String[] args) {
//        LinkedList<String> colors = new LinkedList<>();
//        colors.add("hhple");
//        colors.add("ggnana");
//        colors.add("fferry");
//        colors.add("afe");
//        colors.add("saf");
//
//        System.out.println("first list: " + colors);
//        System.out.println("check: " + colors.isEmpty());
//
//        colors.removeAll(colors);
//
//        System.out.println("linked list after removing: " + colors);
//        System.out.println("check: " + colors.isEmpty());
//    }
//}

//#26. Write a Java program to replace an element in a linked list.
//import java.util.LinkedList;
//
//public class Exercise {
//    public static void main(String[] args) {
//        LinkedList<String> fruits = new LinkedList<>();
//        fruits.add("banangj");
//        fruits.add("anana");
//        fruits.add("almy");
//        fruits.add("appe");
//        fruits.add("egve");
//
//        System.out.println("first list: " + fruits);
//
//        fruits.set(1, "orange");
//
//        System.out.println("second element changed.");
//        System.out.println("new list: " + fruits);
//    }
//}


//HashSet 3-9
//#3. Write a Java program to get the number of elements in a hash set.
//import java.util.HashSet;
//
//public class Exercise {
//    public static void main(String[] args) {
//        HashSet<String> fruits = new HashSet<>();
//
//        fruits.add("fgple");
//        fruits.add("avna");
//        fruits.add("svsry");
//        fruits.add("deffg");
//        fruits.add("sggrberry");
//
//
//        System.out.println("first HashSet: " + fruits);
//        System.out.println("size HashSet: " + fruits.size());
//    }
//}

//#4. Write a Java program to empty an hash set.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String[] args) {
//        HashSet<String> fruits = new HashSet<>();
//
//        fruits.add("dassle");
//        fruits.add("avana");
//        fruits.add("fewgrry");
//        fruits.add("ate");
//
//        System.out.println("first HashSet: " + fruits);
//
//        fruits.removeAll(fruits);
//
//        System.out.println("HashSet after removing" + fruits);
//    }
//}

//#5. Write a Java program to test if a hash set is empty or not.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String[] args) {
//        HashSet<String> first = new HashSet<>();
//        first.add("Red");
//        first.add("Green");
//        first.add("Black");
//        first.add("White");
//
//        System.out.println("first HashSet: " + first);
//        System.out.println("HashSet empty? " + first.isEmpty());
//
//        System.out.println("Removing all elements");
//        first.removeAll(first);
//
//        System.out.println("Hash Set after removing" + first);
//    }
//}

//#6. Write a Java program to clone a hash set to another hash set.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String[] args) {
//        HashSet<String> first = new HashSet<>();
//        first.add("Black");
//        first.add("White");
//        first.add("Pink");
//        first.add("Yellow");
//
//        System.out.println("first Hash Set: " + first);
//
//        HashSet<String> last = (HashSet<String>) first.clone();
//        System.out.println("cloned HashSet: " + last);
//    }
//}

//#7. Write a Java program to convert a hash set to an array.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String[] args) {
//        HashSet<String> first = new HashSet<>();
//        first.add("Red");
//        first.add("Green");
//        first.add("Yellow");
//
//        System.out.println("first Hash Set: " + first);
//
//        String[] last = new String[first.size()];
//        first.toArray(last);
//
//        System.out.println("new elements: ");
//        for (String element : last) {
//            System.out.println(element);
//        }
//    }
//}

//#8. Write a Java program to convert a hash set to a tree set.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String[] args) {
//        HashSet<String> first = new HashSet<>();
//        first.add("Black");
//        first.add("White");
//        first.add("Pink");
//        first.add("Yellow");
//
//        System.out.println("first Hash Set: " + first);
//
//        Set<String> last = new TreeSet<>(first);
//
//        System.out.println("treeSet elements: ");
//        for (String element : last) {
//            System.out.println(element);
//        }
//    }
//}

//#9. Write a Java program to find numbers less than 7 in a tree set.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String[] args) {
//        HashSet<String> first = new HashSet<>();
//        first.add("Red");
//        first.add("Green");
//        first.add("Black");
//        first.add("White");
//        first.add("Pink");
//        first.add("Yellow");
//
//        System.out.println("first Hash Set: " + first);
//
//        List<String> last = new ArrayList<>(first);
//
//        System.out.println("ArrayList contains: " + last);
//    }
//}

//Treeset 10-16
//#10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
//import java.util.TreeSet;
//
//public class Exercise {
//    public static void main(String[] args) {
//        TreeSet<Integer> first = new TreeSet<>();
//
//        first.add(40);
//        first.add(22);
//        first.add(66);
//        first.add(65);
//        first.add(20);
//        first.add(100);
//        first.add(89);
//        first.add(76);
//        first.add(10);
//
//        System.out.println("Greater than or equal to 89 : " + first.ceiling(89));
//        System.out.println("Greater than or equal to 22 : " + first.ceiling(22));
//    }
//}

//#11. Write a Java program to get the element in a tree set less than or equal to the given element.
//import java.util.TreeSet;
//
//public class Exercise {
//    public static void main(String[] args) {
//
//        TreeSet<Integer> tree_num = new TreeSet<Integer>();
//
//        tree_num.add(10);
//        tree_num.add(22);
//        tree_num.add(36);
//        tree_num.add(25);
//        tree_num.add(16);
//        tree_num.add(70);
//        tree_num.add(82);
//        tree_num.add(89);
//        tree_num.add(14);
//
//        System.out.println("Less than or equal to 86 : " + tree_num.floor(86));
//        System.out.println("Less than or equal to 29 : " + tree_num.floor(29));
//    }
//}

//#12. Write a Java program to get the element in a tree set strictly greater than or equal to the given element.
//import java.util.TreeSet;
//import java.util.Iterator;
//
//public class Exercise {
//    public static void main(String[] args) {
//        // creating TreeSet
//        TreeSet <Integer>tree_num = new TreeSet<Integer>();
//        TreeSet <Integer>treeheadset = new TreeSet<Integer>();
//
//        // Add numbers in the tree
//        tree_num.add(10);
//        tree_num.add(22);
//        tree_num.add(36);
//        tree_num.add(25);
//        tree_num.add(16);
//        tree_num.add(70);
//        tree_num.add(82);
//        tree_num.add(89);
//        tree_num.add(14);
//
//        System.out.println("Strictly greater than 70: "+tree_num.higher(70));
//        System.out.println("Strictly greater than 22 : "+tree_num.higher(22));
//    }
//}

//#13. Write a Java program to get an element in a tree set that has a lower value than the given element.
//import java.util.TreeSet;
//import java.util.Iterator;
//
//public class Exercise {
//    public static void main(String[] args) {
//        // creating TreeSet
//        TreeSet <Integer>tree_num = new TreeSet<Integer>();
//        TreeSet <Integer>treeheadset = new TreeSet<Integer>();
//
//        // Add numbers in the tree
//        tree_num.add(10);
//        tree_num.add(22);
//        tree_num.add(36);
//        tree_num.add(25);
//        tree_num.add(16);
//        tree_num.add(70);
//        tree_num.add(82);
//        tree_num.add(89);
//        tree_num.add(14);
//
//        System.out.println("Strictly less than 82 : "+tree_num.lower(82));
//        System.out.println("Strictly less than 22 : "+tree_num.lower(22));
//    }
//}

//#14. Write a Java program to retrieve and remove the first element of a tree set.
//import java.util.TreeSet;
//
//public class Exercise {
//    public static void main(String[] args) {
//        TreeSet<Integer> treeNum = new TreeSet<>();
//
//        treeNum.add(10);
//        treeNum.add(22);
//        treeNum.add(36);
//        treeNum.add(25);
//        treeNum.add(16);
//        treeNum.add(70);
//        treeNum.add(82);
//        treeNum.add(89);
//        treeNum.add(14);
//
//        System.out.println("Original: " + treeNum);
//        System.out.println("First: " + treeNum.pollFirst());
//        System.out.println("After first removed: " + treeNum);
//    }
//}

//#15. Write a Java program to retrieve and remove the last element of a tree set.
//import java.util.TreeSet;
//
//public class Exercise {
//    public static void main(String[] args) {
//        TreeSet<Integer> treeNum = new TreeSet<>();
//
//        treeNum.add(10);
//        treeNum.add(22);
//        treeNum.add(36);
//        treeNum.add(25);
//        treeNum.add(16);
//        treeNum.add(70);
//        treeNum.add(82);
//        treeNum.add(89);
//        treeNum.add(14);
//
//        System.out.println("Original: " + treeNum);
//        System.out.println("Last: " + treeNum.pollLast());
//        System.out.println("After last removed: " + treeNum);
//    }
//}

//#16. Write a Java program to remove a given element from a tree set.
//import java.util.TreeSet;
//
//public class Exercise {
//    public static void main(String[] args) {
//        TreeSet<Integer> treeNum = new TreeSet<>();
//
//        treeNum.add(10);
//        treeNum.add(22);
//        treeNum.add(36);
//        treeNum.add(25);
//        treeNum.add(16);
//        treeNum.add(70);
//        treeNum.add(82);
//        treeNum.add(89);
//        treeNum.add(14);
//
//        System.out.println("Original: " + treeNum);
//        System.out.println("Remove 82: " + treeNum.remove(82));
//        System.out.println("After remove: " + treeNum);
//    }
//}

//PriorityQueue 7-12
//#7. Write a Java program to compare two priority queues.
//import java.util.PriorityQueue;
//
//public class Exercise {
//    public static void main(String[] args) {
//        PriorityQueue<String> pq1 = new PriorityQueue<>();
//        pq1.add("Red");
//        pq1.add("Pink");
//        pq1.add("Black");
//        pq1.add("Orange");
//
//        PriorityQueue<String> pq2 = new PriorityQueue<>();
//        pq2.add("Red");
//        pq2.add("Green");
//        pq2.add("Black");
//        pq2.add("White");
//
//        System.out.println("First: " + pq1);
//        System.out.println("Second: " + pq2);
//
//        for (String element : pq1) {
//            System.out.println(pq2.contains(element) ? "Yes" : "No");
//        }
//    }
//}

//#8. Write a Java program to retrieve the first element of the priority queue.
//import java.util.PriorityQueue;
//
//public class Exercise {
//    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//        pq.add(5);
//        pq.add(18);
//        pq.add(33);
//        pq.add(21);
//        pq.add(12);
//        pq.add(67);
//        pq.add(79);
//        pq.add(90);
//        pq.add(27);
//
//        System.out.println("Original: " + pq);
//        System.out.println("First: " + pq.peek());
//    }
//}
//

//#9. Write a Java program to retrieve and remove the first element.
//import java.util.PriorityQueue;
//
//public class Exercise {
//    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//        pq.add(7);
//        pq.add(20);
//        pq.add(34);
//        pq.add(29);
//        pq.add(11);
//        pq.add(65);
//        pq.add(78);
//        pq.add(88);
//        pq.add(19);
//
//        System.out.println("Original: " + pq);
//        System.out.println("Removes first: " + pq.poll());
//        System.out.println("After removing: " + pq);
//    }
//}

//#10. Write a Java program to convert a priority queue to an array containing all its elements.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String[] args) {
//        PriorityQueue<String> pq = new PriorityQueue<>();
//
//        pq.add("Blue");
//        pq.add("Yellow");
//        pq.add("Orange");
//        pq.add("Purple");
//
//        System.out.println("Original: " + pq);
//
//        List<String> list = new ArrayList<>(pq);
//        System.out.println("Array list: " + list);
//    }
//}

//#11. Write a Java program to convert a Priority Queue element to string representations.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String[] args) {
//        PriorityQueue<String> pq = new PriorityQueue<>();
//
//        pq.add("Blue");
//        pq.add("Yellow");
//        pq.add("Orange");
//        pq.add("Purple");
//
//        System.out.println("Original: " + pq);
//        System.out.println("As String: " + pq.toString());
//    }
//}

//#12. Write a Java program to change priorityQueue to maximum priority queue.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>(10, Collections.reverseOrder());
//
//        pq.add(45);
//        pq.add(32);
//        pq.add(18);
//        pq.add(57);
//        pq.add(63);
//        pq.add(91);
//        pq.add(27);
//        pq.add(44);
//        pq.add(50);
//
//        System.out.println("\nOriginal Priority Queue: " + pq);
//
//        System.out.print("\nMaximum Priority Queue: ");
//        Integer val;
//        while ((val = pq.poll()) != null) {
//            System.out.print(val + "  ");
//        }
//        System.out.print("\n");
//    }
//}

//HashMap 7-12
//#7. Write a Java program to test if a map contains a mapping for the specified key.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String args[]) {
//        HashMap < String, Integer > hash_map = new HashMap < String, Integer > ();
//        hash_map.put("Apple", 1);
//        hash_map.put("Banana", 2);
//        hash_map.put("Cherry", 3);
//        hash_map.put("Grape", 4);
//        hash_map.put("Peach", 5);
//
//
//        System.out.println("The Original map: " + hash_map);
//
//        System.out.println("1. Is key 'Banana' exists?");
//        if (hash_map.containsKey("Banana")) {
//            System.out.println("yes! - " + hash_map.get("Banana"));
//        } else {
//            System.out.println("no!");
//        }
//
//        System.out.println("\n2. Is key 'Mango' exists?");
//        if (hash_map.containsKey("Mango")) {
//            System.out.println("yes! - " + hash_map.get("Mango"));
//        } else {
//            System.out.println("no!");
//        }
//    }
//}

//#8. Write a Java program to test if a map contains a mapping for the specified value.
//import java.util.*;
//
//public class Exercise{
//    public static void main(String args[]) {
//        HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
//        hash_map.put(1, "Apple");
//        hash_map.put(2, "Banana");
//        hash_map.put(3, "Cherry");
//        hash_map.put(4, "Grape");
//        hash_map.put(5, "Peach");
//
//        // print the map
//        System.out.println("The Original map: " + hash_map);
//
//        System.out.println("1. Is value 'Banana' exists?");
//        if (hash_map.containsValue("Banana")) {
//            System.out.println("Yes!");
//        } else {
//            System.out.println("No!");
//        }
//
//        System.out.println("\n2. Is value 'Mango' exists?");
//        if (hash_map.containsValue("Mango")) {
//            System.out.println("Yes!");
//        } else {
//            System.out.println("No!");
//        }
//    }
//}

//#9. Write a Java program to create a set view of the mappings contained in a map.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String args[]) {
//        HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
//        hash_map.put(1, "Apple");
//        hash_map.put(2, "Banana");
//        hash_map.put(3, "Cherry");
//        hash_map.put(4, "Grape");
//        hash_map.put(5, "Peach");
//
//        Set set = hash_map.entrySet();
//
//        System.out.println("Set values: " + set);
//    }
//}

//#10. Write a Java program to get the value of a specified key in a map.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String args[]){
//        HashMap<Integer, String> colorMap = new HashMap<Integer, String>();
//        colorMap.put(10, "Yellow");
//        colorMap.put(20, "Purple");
//        colorMap.put(30, "Brown");
//        colorMap.put(40, "Grey");
//        colorMap.put(50, "Pink");
//
//        String color = colorMap.get(30);
//        System.out.println("Color for key 30 is: " + color);
//    }
//}

//#11. Write a Java program to get a set view of the keys contained in this map.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String args[]){
//
//        HashMap<Integer, String> colorMap = new HashMap<>();
//
//        colorMap.put(1, "Red");
//        colorMap.put(2, "Blue");
//        colorMap.put(3, "Green");
//        colorMap.put(4, "Black");
//        colorMap.put(5, "Orange");
//
//        Set<Integer> keys = colorMap.keySet();
//        System.out.println("The keys in the map are: " + keys);
//    }
//}

//#12. Write a Java program to get a collection view of the values contained in this map.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String args[]){
//
//        HashMap<Integer, String> colorMap = new HashMap<>();
//
//        colorMap.put(1, "Red");
//        colorMap.put(2, "Yellow");
//        colorMap.put(3, "Purple");
//        colorMap.put(4, "White");
//        colorMap.put(5, "Pink");
//
//        System.out.println("Map values: " + colorMap.values());
//    }
//}


//Tree Map 21-26
//#21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
//import java.util.*;
//import java.util.Map.Entry;
//
//public class Exercise {
//    public static void main(String args[]) {
//
//        TreeMap < Integer, String > color_map = new TreeMap < Integer, String > ();
//        SortedMap < Integer, String > sub_color_map = new TreeMap < Integer, String > ();
//
//        color_map.put(12, "Blue");
//        color_map.put(28, "Yellow");
//        color_map.put(38, "Purple");
//        color_map.put(42, "Orange");
//        color_map.put(52, "Gray");
//
//        System.out.println("Initial TreeMap content: " + color_map);
//
//        sub_color_map = color_map.subMap(25, 50);
//
//        System.out.println("Sub map of color values: " + sub_color_map);
//    }
//}

//#22. Write a Java program to get the portion of a map whose keys range from a given key to another key.
//import java.util.*;
//import java.util.Map.Entry;
//
//public class Exercise {
//    public static void main(String args[]) {
//
//        TreeMap < Integer, String > color_map = new TreeMap < Integer, String > ();
//        SortedMap < Integer, String > sub_color_map = new TreeMap < Integer, String > ();
//
//        color_map.put(15, "Blue");
//        color_map.put(25, "Yellow");
//        color_map.put(35, "Purple");
//        color_map.put(45, "Orange");
//        color_map.put(55, "Gray");
//
//        System.out.println("Initial TreeMap content: " + color_map);
//
//        sub_color_map = color_map.subMap(20, true, 45, true);
//
//        System.out.println("Sub map of color values: " + sub_color_map);
//    }
//}

//#23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String args[]) {
//
//        TreeMap < Integer, String > color_map = new TreeMap < Integer, String > ();
//
//        color_map.put(12, "Blue");
//        color_map.put(22, "Yellow");
//        color_map.put(32, "Purple");
//        color_map.put(42, "Orange");
//        color_map.put(52, "Gray");
//
//        System.out.println("Initial TreeMap content: " + color_map);
//        System.out.println("Keys greater than or equal to 22: " + color_map.tailMap(22));
//    }
//}

//#24. Write a Java program to get a portion of a map whose keys are greater than a given key.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String args[]) {
//
//        TreeMap < Integer, String > fruit_map = new TreeMap < Integer, String > ();
//
//        fruit_map.put(10, "Apple");
//        fruit_map.put(20, "Banana");
//        fruit_map.put(26, "Cherry");
//        fruit_map.put(40, "Date");
//        fruit_map.put(50, "Elderberry");
//
//        System.out.println("Original TreeMap content: " + fruit_map);
//        System.out.println("Keys are greater than 26: " + fruit_map.tailMap(26, false));
//    }
//}

//#25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
//import java.util.*;
//
//public class Exercise {
//    public static void main(String args[]) {
//
//        TreeMap < Integer, String > fruit_map = new TreeMap < Integer, String > ();
//
//        fruit_map.put(10, "Apple");
//        fruit_map.put(20, "Banana");
//        fruit_map.put(30, "Cherry");
//        fruit_map.put(40, "Date");
//        fruit_map.put(50, "Elderberry");
//
//        System.out.println("Original TreeMap content: " + fruit_map);
//        System.out.println("Keys greater than or equal to 10: " + fruit_map.ceilingEntry(10));
//        System.out.println("Keys greater than or equal to 40: " + fruit_map.ceilingEntry(40));
//        System.out.println("Keys greater than or equal to 30: " + fruit_map.ceilingEntry(30));
//    }
//}

//#26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
import java.util.*;

public class Exercise {
    public static void main(String args[]) {

        TreeMap < Integer, String > fruit_map = new TreeMap < Integer, String > ();

        fruit_map.put(10, "Apple");
        fruit_map.put(20, "Banana");
        fruit_map.put(40, "Cherry");
        fruit_map.put(50, "Date");
        fruit_map.put(60, "Elderberry");

        System.out.println("Original TreeMap content: " + fruit_map);
        System.out.println("Keys greater than or equal to 20: " + fruit_map.ceilingKey(20));
        System.out.println("Keys greater than or equal to 40: " + fruit_map.ceilingKey(40));
        System.out.println("Keys greater than or equal to 10: " + fruit_map.ceilingKey(10));
    }
}













