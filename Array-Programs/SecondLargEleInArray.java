public class SecondLargEleInArray {
    public static void main(String[] args) {

        int[] arr = {10, 8, 9, 5};

        int max = arr[0];
        int secondMax = arr[1];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax);
    }
}
//SecondLargestElement in the Array