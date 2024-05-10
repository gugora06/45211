public class Main {
    public static void main(String[] args) {
        //1 завдання
//        int array[] = new int[50];
//        for (int i = 1, j = 0; i < 100; i = i + 2, j++) {
//            array[j] = i;
//        }
//        for (int i = 0; i < array.length; i++)
//            System.out.print(array[i]+ " ");
//
        //2 завдання
//        int start = 0;
//        int array[]=new int[20];
//        for (int i = 0; i < 10; i++){
//            array[i] = (int) Math.round(Math.random() * 9);
//        }
//        for(int i = 0; i < 10; i++){
//            System.out.print(array[i] + " ");
//        }
//        for(int i = 0; i < 10; i++){
//            if(array[i] % 2 == 2){
//                array[i] = 0;
//            }System.out.print( +array[i] + " ");
//        }

        //3 завдання
        int array1[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[5];
        for(int i = 0; i < array1.length; i++){
            array1[i] = (int) Math.round(Math.random() * 6);
            array2[i] = (int) Math.round(Math.random() * 6);
            array3[i] = (int) Math.round(Math.random() * 6);
        }
        for(int i = 0; i < array1.length ; i++){
            System.out.print(array1[i] + " ");
        }System.out.println();
        for(int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }System.out.println();
        for(int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }System.out.println();

        int array1sum = 0;
        for(int i = 0; i < array1.length; i++){
            array1sum += array1[i];
        }

        int array2sum = 0;
        for(int i = 0; i < array2.length; i++){
            array2sum += array2[i];
        }

        int array3sum = 0;
        for(int i = 0; i < array3.length; i++){
            array3sum += array3[i];
        }

        


    }
}