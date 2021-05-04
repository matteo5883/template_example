package components;

public abstract class Algorithm {

    protected String name;
    protected int[] numbers;

    public Algorithm(String name, int[] numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void initialize() {
        System.out.println(String.format("Starting sorting with %s algorithm...", this.name));
    }

    public abstract void sorting();

    public void printResult(){
        System.out.println("Numbers sorted : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void sort() {
        initialize();
        sorting();
        printResult();
    }
}
