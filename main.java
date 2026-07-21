public class Main {

    static int asciiSum(String word) {

        int sum = 0;

        for (int i = 0; i < word.length(); i++) {

            sum = sum + word.charAt(i);
        }

        return sum;
    }

    public static void main(String[] args) {

        String arr[] = {
                "cat",
                "car",
                "bat",
                "apple",
                "watermelon"
        };

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (asciiSum(arr[j]) > asciiSum(arr[j + 1])) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }
}
