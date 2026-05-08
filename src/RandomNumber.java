public class RandomNumber {
    private int count;
    private int[] array;

    public RandomNumber(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return this.array;
    }

    public void printNumber() {
        int[] randomNumbers = new int[getCount()];

        for (int i = 0; i < getCount(); i++) {
            randomNumbers[i] = (int)(Math.random() * 30) + 1;
        }

        setArray(randomNumbers);

        System.out.println("生成された数字は、");
        printArray(getArray());
        System.out.println("です。");
    }

    public void orderDescending() {
        int[] array = getArray();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        setArray(array);

        System.out.println("降順に並べ替えた数字は、");
        printArray(getArray());
        System.out.println("です。");
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.print("、");
            }
        }
    }
}