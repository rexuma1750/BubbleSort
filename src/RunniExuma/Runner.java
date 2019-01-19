package RunniExuma;

public class Runner {public static void main(String[] args){
    int[] intArrBefore = InPlaceSorts.randIntArr(1000);
    double[] doubArrBefore = InPlaceSorts.randDoubleArr(1000);
    String[] stringArrBefore = InPlaceSorts.randStringArr(1000,4);

    int[] copyInt = InPlaceSorts.copyIntArray(intArrBefore);
    double[] copyDouble = InPlaceSorts.copyDoubleArray(doubArrBefore);
    String[] copyString = InPlaceSorts.copyStringArray(stringArrBefore);

    System.out.println(" Int Array Before: ");
    for (int num:intArrBefore){
        System.out.println(num+" ");
    }
    System.out.println();

    System.out.print("Double Array Before: "){
        for (double num:doubArrBefore){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.print("String Array Before: ");
        for (String num:stringArrBefore){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    long insertionTimeStart = 0;
    long selectionTimeStart = 0;
    long bubbleTimeStart = 0;
    long insertionTimeStop = 0;
    long selectionTimeStop = 0;
    long bubbleTimeStop = 0;

    insertionTimeStart = System.nanoTime();
    InPlaceSorts.insertionSort(intArrBefore);
    insertionTimeStop = System.nanoTime()-insertionTimeStart;

    selectionTimeStart = System.nanoTime();
    InPlaceSorts.selectionSort(doubArrBefore);
    selectionTimeStop = System.nanoTime()-selectionTimeStart;

    bubbleTimeStart = System.nanoTime();
    InPlaceSorts.bubbleSort(stringArrBefore);
    bubbleTimeStop = System.nanoTime()-bubbleTimeStart;

    System.out.println(" ");

    System.out.println("Time - Insertion Sort:"+insertionTimeStop+" nanoseconds.");
    System.out.println("Time - Selection Sort: "+selectionTimeStop+" nanoseconds.");
    System.out.println("Time - Bubble Sort: "+bubbleTimeStop+" nanoseconds.");
    System.out.println("    ");

    System.out.print(" Int Array After: ");
    for (int num:intArrBefore){
        System.out.print(num+" ");
    }
    System.out.println();
    System.out.println(InPlaceSorts.checkIntSorted(intArrBefore));
    System.out.println(InPlaceSorts.checkIntSum(intArrBefore, copyInt));

    System.out.print("Double Array After: ");
    for (double num:doubArrBefore){
        System.out.print(num+" ");
    }
    System.out.println();
    System.out.println(InPlaceSorts.checkDoubleSorted(doubArrBefore));
    System.out.println(InPlaceSorts.checkDoubleSum(doubArrBefore, copyDouble));

    System.out.print("String Array After: ");
    for (String num:stringArrBefore){
        System.out.print(num+" ");
    }
    System.out.println();
    System.out.println("Sorted.");
}
}
