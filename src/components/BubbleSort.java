package components;

public class BubbleSort extends Algorithm {

    public BubbleSort(String name, int[] numbers) {
        super(name, numbers);
    }

    @Override
    public void sorting() {

        int n = this.numbers.length;
        int temp;

        while (n != 0) {

            temp = 0;

            for (int i = 1; i < n; i++) {
                if (this.numbers[i-1] > this.numbers[i]) {
                    int swap = this.numbers[i-1];
                    this.numbers[i -1] = this.numbers[i];
                    this.numbers[i] = swap;
                    temp = i;
                }
            }

            n = temp;
        }

    }
}
