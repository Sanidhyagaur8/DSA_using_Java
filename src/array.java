public class array {
    /*public static void main(String[] args) {
        int[] array;
        array = new int[8];
        System.out.println("Array before data: ");
        display(array);

        //insertion
        for (int i = 0; i < array.length; i++) {
            System.out.println("Adding " + i + " at " + i);
            array[i] = i;
        }
        System.out.println();
        System.out.println("Array after adding elements: ");
        display(array);

        //insertion at index
        int index=5;
        array[index]=10;
        System.out.println("Adding element at: "+index);
        display(array);

        //search using index
        System.out.println("Data at index "+index+" is: "+array[5]);


        //search using value
        int value=4;
        for (int j : array) {
            if (j == value) {
                System.out.println(value + " Found at index " + j);
                break;
            }
        }
    }


        private static void display(int[] array){
            System.out.print("Array: [");
            for (int j : array) {
                System.out.print(" " + j);
            }
            System.out.print(" ]");
            System.out.println();
            System.out.println();
        }
    */

    public static void main(String[] args) {
        int[] a = new int[5];
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            a[i]=count;
            System.out.print("Index: "+i+" Element: "+a[i]+"  \n");
            count++;
        }
        System.out.println(" ");

        //2D array
        int[][] a1=new int[3][3];
        count=1;
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a1[i].length;j++){
                a1[i][j]=count;
                System.out.print(a1[i][j]+" ");
                count++;
            }
            System.out.println(" ");
        }

    }
}








