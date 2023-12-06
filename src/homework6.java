public class homework6 {
    //Домашнее задание №6

    public static void main(String[] args) {

        //Task 1

        int[] arr = {1, 3, 4, 1, 5, 5};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum / arr.length);
    }

        //Task 2

        int[] arr = {1, 3, 4, 1, 5, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    System.out.println(arr[i]);
            }
        }
    }

        //Task 3.1

        int[] arr = {1, 3, -6, 23, 14, 2};
        int x = 23;

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("true");
            }
        }
    }

        //Task 3.2

        int[] arr = {1, 3, -6, 23, 14, 2};
        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("false");
            }
        }
    }

        //Task 4.1

        int[] arr = {1, 3, -6, 23, 14, 2};
        int x = 23;

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println(i);
            }
        }
    }

        //Task 4.2

        int[] arr = {1, 3, -6, 23, 14, 2};
        int x = 5;

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println(i);
            }
        }
    }

        //Task 5.1

        int[] arr = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3, m = 8;

        for (int i = n; i <= m; i++) {
            System.out.println(arr[i]);
        }
    }

        //Task 5.2

        int[] arr = {1, 3, -6, 23, 14, 2};
        int n = 1, m = 3;

        for (int i = n; i <= m; i++) {
            System.out.println(arr[i]);
        }
    }

        //Task 6

        int[] arr = {1, 3, -6, 23, 14, 2};
        int min = arr[0], max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);
    }

        //Task 7

        int[] arr = {1, 3, -6, 23, 14, 2};
        int min1 = arr[0], min2 = min1;

        for (int i = 0; i < arr.length; i++) {
            if (min1 > arr[i]) {
                min2 = min1;
                min1 = arr[i];
            }
        }
        System.out.println("Наименьший элемент = " + min1);
        System.out.println("Второй наименьший элемент = " + min2);
    }

        //Task 8

        int[] arr = {1, 2, 3, 0, 4, 6};
        int max, k = -1;
        String result = "";

        for (int j = 0; j < arr.length; j++) {
            max = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0 && max < arr[i]) {
                    max = arr[i];
                    k = i;
                }
            }
            if (k >= 0) {
                arr[k] = -1;
            }
            result += max;
        }
            System.out.println(result);
    }
}

