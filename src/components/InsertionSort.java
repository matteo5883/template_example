package components;

public class InsertionSort extends Algorithm {

    public InsertionSort(String name, int[] numbers) {
        super(name, numbers);
    }

    @Override
    public void sorting() {

        int n;
        int temp;

        for (int i = 1; i < this.numbers.length; i++){
            temp = this.numbers[i];
            n = i;

            while (n > 0 && this.numbers[n-1] > temp) {
                this.numbers[n] = this.numbers[n-1];
                n--;
            }

            numbers[n] = temp;
        }

    }
}
