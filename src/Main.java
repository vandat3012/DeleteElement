import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phần tử cần xóa :");
        int element = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }else {
            System.out.println("The element you want to delete is not exist");
        }

        System.out.println("New array :");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]);
        }
    }
}