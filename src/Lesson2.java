public class Lesson2 {
    public static void main(String[] args) {
        int x = 4;
        int[] myArray = new int[5];
        myArray[2] = ++x;
        myArray[4] = 78;
        System.out.println(myArray[2]);
        System.out.println(myArray.length);
        System.out.println(myArray.length - 1);

        double[] doubleArray = {1.45, 3.6, 8.87, 85.4, 22.1 };
        double[] doubleArray2 = new double[]{1.5, 14.3};
        System.out.println(doubleArray2[0]);

        short xx = 9;
        int[][] a = {{2, xx, 12}, {5, ++xx, 21}};
        System.out.println(a[0][1] );

        if (x < xx){
            System.out.println("Positive!");
        }
        else
            if (x>=xx || x <= a[1][0]){
                System.out.println("Again Positive!");
            }
            else{
                System.out.println("Negative((");
            }

            int m = 9;
            switch (m) {
                case 1:
                    System.out.println("One!");
                    break;
                default:
                    System.out.println("No Result");
                    break;
                case 2:
                    System.out.println("Two!");
                     break;
                case 8:
                    System.out.println("Eight");
                    break;


                    }
        }

    }

