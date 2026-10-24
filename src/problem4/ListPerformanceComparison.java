package problem4;

import java.util.*;

public class ListPerformanceComparison {

    private static final int SIZE = 100_000;        // total elements
    private static final int OPERATIONS = 10_000;   // random operations to test

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        System.out.println("---- Performance Comparison ----");

        System.out.println("---- Populate both lists ----");
        for (int i = 0; i < SIZE; i++) {
            //code here:
            arrayList.add(i);
            //code here:
            linkedList.add(i);
        }

        // 2️⃣ Random insertions and deletions
        testRandomInsertDelete(arrayList, "ArrayList");
        testRandomInsertDelete(linkedList, "LinkedList");

        // 3️⃣ Sequential insertions/deletions at beginning and end
        testSequentialInsertDelete(arrayList, "ArrayList");
        testSequentialInsertDelete(linkedList, "LinkedList");

        // 4️⃣ Random access test
        testRandomAccess(arrayList, "ArrayList");
        testRandomAccess(linkedList, "LinkedList");
    }

    // ------------------------------------------------------------

    private static void testRandomInsertDelete(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        // insert your code here
        for (int i = 0 ; i < OPERATIONS; i++ ){
            // we check if empty, i know we populated the lists but let's just generalize:
            if (list.isEmpty()){
                list.add(random.nextInt(10));
            }
            else{
                int idx = random.nextInt(list.size());
                if (random.nextBoolean()){
                    // we randomly append or delete:
                    list.add(idx,i);
                }
                else{
                    list.remove(idx);
                }
            }
        }

        long end = System.nanoTime();
        System.out.printf("%s - Random insert/delete: %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testSequentialInsertDelete(List<Integer> list, String name) {
        long start = System.nanoTime();

        // Insertions at beginning and end

        // add your code here
        for (int i = 0 ; i<OPERATIONS; i++){
            // we add at beginning:
            list.add(0,i);
            // we add at the end:
            list.add(i);
        }

        // Deletions at beginning and end

        // add your code here
        for (int i = 0 ; i<OPERATIONS; i++){
            // remove at beginning:
            list.remove(0);
            // remove at the end:
            list.remove(list.size()-1);

        }

        long end = System.nanoTime();
        System.out.printf("%s - Sequential insert/delete (start/end): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testRandomAccess(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        long sum = 0;
        // sum of the all elements in the list
       // insert your code here

        for (int i = 0 ; i < OPERATIONS ; i++){
            sum += list.get(random.nextInt(list.size()));
        }

        long end = System.nanoTime();
        System.out.printf("%s - Random access (get): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }
}

