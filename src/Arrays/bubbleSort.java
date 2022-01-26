package Arrays;
import java.util.Scanner;
class bubble {
    private int[] array;
    private int size;

    public void getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        array = new int[size];
        System.out.println("Enter the element in the array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
    }

    public void BubbleSort() {
        for (int i = size - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }


        }
            System.out.println("After the Bubble sort the array is :");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        }

    }


public  class bubbleSort {
    public static void main(String[] args) {
        bubble b=new bubble();
        b.getArray();
        b.BubbleSort();

    }
}
