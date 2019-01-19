package RunniExuma;

public class InPlaceSorts {

    //To make Swaps:
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void doubleSwap(double[] arr, int i, int j){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void stringSwap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //To make Copies:
    public static int[] copyIntArray(int[] arr){
        int[] intCopy = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            intCopy[i] = arr[i];

        }
        return intCopy;
    }

    public static double[] copyDoubleArray(double[] arr){
        double[] doubleCopy = new double[arr.length];
        for (int i=0; i<arr.length; i++){
            doubleCopy[i] = arr[i];
        }
        return doubleCopy;
    }

    public static String[] copyStringArray(String[] arr){
        String[] stringCopy = new String[arr.length];
        for (int i=0; i<arr.length; i++){
            stringCopy[i] = arr[i];
        }
        return stringCopy;
    }


    public static void bubbleSort(String[] arr){
        int count = 1;
        while (count != 0){
            count = 0;
            for (int i=0; i<arr.length-1; i++){
                if (arr[i].compareTo(arr[i+1])>=0){
                    stringSwap(arr, i, i+1);
                    count++;
                }
            }
        }
    }

    public static void selectionSort(double[] arr){
        for (int i=0; i<arr.length; i++){
            int minIter = i;
            for (int j=i; j<arr.length; j++){
                if (arr[j]<arr[minIter]){minIter = j; }
            }
            if (minIter!=i){
                doubleSwap(arr, i, minIter);
            }
        }
    }

    public static void insertionSort (int[] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=i; j>0; j--){
                if (arr[j-1]>arr[j]){
                    swap(arr, j-1,j);
                }
                else { j=0; }
            }
        }
    }

    public static int[] randIntArr(int count){
        int[] arr = new int[count];
        for (int i=0; i<count; i++){
            arr[i] = (int)(Math.random()*1000);
        }
        return arr;
    }

    public static double[] randDoubleArr(int count){
        double[] arrDouble = new double[count];
        for (int i=0; i<count; i++){
            arrDouble[i] = (double)(Math.random()*1000);
        }
        return arrDouble;
    }

    public static String[] randStringArr(int num, int length){
        String[] arrString = new String[num];
        while (num>0){
            int i=0;
            String s = "";
            while (i<length){
                char c = (char)((Math.random()*26)+97);
                s=s+c;
                i++;
            }
            num--;
            arrString[num] = s;
        }
        return arrString;
    }

    public static String checkIntSorted(int[] arr){
        int count = 0;
        String output = "";
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] <= arr[i+1]){
                count++;
                if (count==arr.length-1){
                    output = "Sorted.";
                }
                else{
                    output = "Not Sorted.";
                }
            }
        }
        return output;
    }

    public static String checkDoubleSorted(double[] arr){
        int count = 0;
        String output = "";
        for (int i=0; i<arr.length; i++){
            if (arr[i] <= arr[i+1]){
                count++;
                if (count==arr.length-1){
                    output = "Sorted.";
                }
                else {
                    output = "Not Sorted.";
                }
            }
        }
        return output;
    }

    public static String checkIntSum(int[] before, int[] after){
        int beforeSum = 0;
        int afterSum = 0;
        String output = "";
        for (int i=0; i<before.length; i++){
            beforeSum = beforeSum + before[i];
        }
        for (int j=0; j<after.length; j++){
            afterSum = afterSum + after[j];
        }
        if (beforeSum == afterSum){
            output = "Equal sums.";
        }
        else{
            output = "Unequal sums.";
        }
        return output;
    }

    public static String checkDoubleSum(double[] before, double[] after){
        double beforeSum = 0;
        double afterSum = 0;
        String output = "";
        for (int i=0; i<before.length; i++){
            beforeSum = beforeSum + before[i];
        }
        for (int j=0; j<after.length; j++){
            afterSum = afterSum + after[j];
        }
        if (beforeSum == afterSum){
            output = " Equal sums.";
        }
        else {
            output = "Unequal sums.";
        }
        return output;
    }
}
