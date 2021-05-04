import components.Algorithm;
import components.BubbleSort;
import components.InsertionSort;
import components.SelectionSort;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {4, 10, 0, 7, -3, -1, 20, 6, 9};
        Algorithm bubble = new BubbleSort("BubbleSort", numbers);
        Algorithm insertion = new InsertionSort("InsertionSort", numbers);
        Algorithm selection = new SelectionSort("SelectionSort", numbers);
        bubble.sort();
        insertion.sort();
        selection.sort();
    }
}
