import java.lang.management.MonitorInfo;

public class sortOfSort {

    public static void sortOfSort(int[] array){

        int startLimit = 0;
        int startIndex = 0;

        int endLimit = array.length - 1;
        int endIndex = array.length - 1;

        boolean atEnd = true;
        int count = 0;

        int i;
        int biggestIndex = startLimit;

        int temp;


        while(startLimit <= endLimit){

            biggestIndex = startLimit;

            for (i = startLimit; i <= endLimit; i++) {

                if (array[i] > array[biggestIndex]) {

                    biggestIndex = i;

                }
            }


            if(count == 2){

                count = 0;
                atEnd = !atEnd;

            }

            if(atEnd){

                temp = array[endLimit];
                array[endLimit] = array[biggestIndex];
                array[biggestIndex] = temp;

                endLimit--;
                count++;

            }

            if(!atEnd){

                temp = array[startLimit];
                array[startLimit] = array[biggestIndex];
                array[biggestIndex] = temp;

                startLimit++;
                count++;

            }
        }
    }
}
