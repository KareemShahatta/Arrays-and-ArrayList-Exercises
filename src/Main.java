import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main
{
    int[] numberArray = randomIntArray();
    String[] countriesArray = {"Egypt", "Switzerland", "Argentina", "Spain", "Portugal", "USA","UAE" , "Sudan" , "Mexico"};

    ArrayList numbersArrayList = new ArrayList();
    ArrayList countriesArrayList = new ArrayList();

    public static void main(String[] args)
    {
        Main main = new Main();
        main.createArrayListFromArrays();

        main.createNumberArrayExample();
        main.createCountriesArrayExample();
        main.createNumberArraylistExample();
        main.createCountriesArrayListExample();
    }

    private void createArrayListFromArrays() {
        convertIntArrayToArrayList(numbersArrayList, numberArray);
        Collections.addAll(countriesArrayList, countriesArray);
    }

    private void createNumberArrayExample() {
        System.out.println("Unsorted Number Array: " + Arrays.toString(numberArray));
        Arrays.sort(numberArray);
        System.out.println("Sorted Number Array: " +  Arrays.toString(numberArray));
    }
    private void createCountriesArrayExample() {
        System.out.println("\nUnsorted Countries Array: " + Arrays.toString(countriesArray));
        Arrays.sort(countriesArray);
        System.out.println("Sorted Countries Array: " +  Arrays.toString(countriesArray));
    }
    private void createNumberArraylistExample() {
        Collections.sort(numbersArrayList);
        System.out.println("\nSorted Number ArrayList: " + numbersArrayList.toString());
        numbersArrayList.add(5);
        System.out.println("Modified Unsorted Number ArrayList: " + numbersArrayList.toString());
        Collections.sort(numbersArrayList);
        System.out.println("Modified Sorted Number ArrayList: " + numbersArrayList.toString());

    }
    private void createCountriesArrayListExample() {
        Collections.sort(countriesArrayList);
        System.out.println("\nSorted Countries ArrayList: " + countriesArrayList.toString());
        countriesArrayList.add("France");
        System.out.println("Modified Unsorted Countries ArrayList: " + countriesArrayList.toString());
        Collections.sort(countriesArrayList);
        System.out.println("Modified Sorted Countries ArrayList: " + countriesArrayList.toString());
    }


    private int[] randomIntArray() {
        int[] array = new int[20];
        for(int i = 0 ; i < 20 ; i++)
        {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    private void convertIntArrayToArrayList(ArrayList arrayList, int[] array) {
        for(int num : array)
        {
            arrayList.add(num);
        }
    }
}
