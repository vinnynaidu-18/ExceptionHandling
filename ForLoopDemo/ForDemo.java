package ForLoopDemo;

public class ForDemo {
    public static void main(String[] args) {

        int array[] = {3, 4, 1, 5};
        for (int index = 0; index < array.length; index++) {
            for (int j = index + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    int temp = array[index];
                    array[index] = array[j];
                    array[j] = temp;
                }
            }

            System.out.println(array[index]);
        }
    }
}
