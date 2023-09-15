




public class Composition {
    public static void main(String[] args) {

        int arr1[] = {0,1,2,3};
        int arr2[] = {};
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = i+1; j < arr1.length; j++) {
//                if(arr1[i] > arr1[j]){
//
//                    int temp = arr1[i];
//
//                    arr1[i] = arr1[j];
//                    arr1[j] = temp;
//
//                }
//            }
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }
//        int largest = arr1[0]; // Assume the first element is the largest
//
//        for (int i = 1; i < arr1.length; i++) {
//            if (arr1[i] > largest) {
//                largest = arr1[i]; // Update largest if a larger element is found
//            }
//        }
//        System.out.println("Largest element in the array is: " + largest);
//

        for (int i = arr1.length; i>=0; i--) {
            System.out.print(i+" ");
        }

    }
}
