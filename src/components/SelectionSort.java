package components;

public class SelectionSort extends Algorithm {

    public SelectionSort(String name, int[] numbers) {
        super(name, numbers);
    }

    @Override
    public void initialize() {
        System.out.println("I'm the super algorithm " + this.name);
    }

    @Override
    public void sorting() {
        for (int i = 0; i < this.numbers.length; i++) {
            int min = this.numbers[i];
            int minId = i;
            for (int j = i+1; j < this.numbers.length; j++) {
                if (this.numbers[j] < min) {
                    min = this.numbers[j];
                    minId = j;
                }
            }
            // swapping
            int temp = this.numbers[i];
            this.numbers[i] = min;
            this.numbers[minId] = temp;
        }

    }
}
