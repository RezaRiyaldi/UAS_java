// import java.util.Scanner;
public class uas {
    public static void garis() {
        System.out.println("\n============================");
    }
    public static void main(String [] args) {
        garis();
        System.out.println("Program No. 1");
        // no1();
        garis();
        System.out.println("Program No. 2");
        // no2();
        garis();
        System.out.println("Program No. 3");
        // no3();
        garis();
        System.out.println("Program No. 4");
        // no4();
        garis();
        System.out.println("Program No. 5");
        no5();
    }
    // public static void no1() {
    //     Scanner input = new Scanner(System.in);        
    //     int n = 5;

    //     //deklarasi array
    //     String kata[] = new String[n];
        
    //     //input data ke array
    //     for (int i=0; i<kata.length; i++){
    //         System.out.print("Kata ke - " + (i + 1) + " : ");
    //         kata[i] = input.next();
    //     }
        
    //     //menampilkan data dalam array
    //     System.out.println("\nKata-kata yang dimasukan : ");
    //     for (int i=0; i<kata.length; i++){
    //         System.out.println(kata[i]);
    //     }
    // }

    // public static void no2() {
    //     Scanner inputan = new Scanner(System.in);
    //     int A[][] = new int[2][3];
    //     int B[][] = new int[2][3];
    //     int C[][] = new int[2][3];
    //     System.out.println("[baris][kolom]");
    //     System.out.println("Masukan nilai Matriks A : ");
    //     System.out.println("-----------------------------");
    //     for(int i=0; i<2; i++){
    //         for(int j=0; j<3; j++){
    //             System.out.print("[" +(i+1)+ "][" +(j+1)+ "]: ");
    //             A[i][j] = inputan.nextInt();
    //         }
    //     }
        
    //     System.out.println("Masukan nilai Matriks B : ");
    //     System.out.println("-----------------------------");
    //     for(int i=0; i<2; i++){
    //         for(int j=0; j<3; j++){
    //             System.out.print("[" +(i+1)+ "][" +(j+1)+ "]: ");
    //             B[i][j] = inputan.nextInt();
    //         }
    //     }
        
    //     //penjumlahan matriks
    //     for(int i=0; i<2; i++){
    //         for(int j=0; j<3; j++){
    //             C[i][j] = A[i][j] + B[i][j];
    //         }
    //     }
        
    //     System.out.println("Hasil penjumlahan matriks : ");
    //     System.out.println("-----------------------------");
    //     for(int i=0; i<2; i++){
    //         for(int j=0; j<3; j++){
    //             System.out.print(+(C[i][j])+" ");
    //         }
    //         System.out.println(" ");
    //     }
    // }

    // public static void no3(){
    //     int angka[] = {3, 6, 1, 4, 2};
    //     int temp;
    //     System.out.println("Data sebelum diurut:");
    //     for (int i = 0; i < angka.length; i++){
    //         System.out.print(angka[i] + " ");
    //     }
    //     System.out.println();

    //     for (int i = angka.length - 1; i > 0; i--) {
    //         for (int j = 0; j < i; j++) {
    //             if (angka[i] > angka[j]) {
    //                 temp = angka[i];
    //                 angka[i] = angka[j];
    //                 angka[j] = temp;
    //             }
    //         }
    //     }

    //     System.out.println("\nData setelah diurut:");
    //     for (int i = 0; i < angka.length; i++) {
    //         System.out.print(angka[i] + " ");
    //     }

    //     System.out.println("");
    // }

    // public static void no4(){
    //     int input = 100;
    //     System.out.println("Bilangan Prima 1 - 100 = ");
    //     for(int i=2; i<input; i++){
    //         boolean isPrima = true;
    //         for (int j=2; j<i; j++){
    //             if(i % j == 0){
    //                 isPrima = false;
    //                 break;
    //             }
    //         }
            
    //         if(isPrima == true){
    //             System.out.print(i);
    //             System.out.print(", ");
    //         }
    //     }
    // }
    public static void no5(){
        int a,x,y;      
        a = 5;
        int[][]b = new int[100][100];

        for(x = 1; x <= a; x = x + 1){
            for(y = 1; y <= x; y++){
                if(x == 0 || y == x){
                    b[x][y] = 1;
                    System.out.print(" "+ b[x][y] + " ");
                }
                else{
                    b[x][y] = b[x-1][y-1] + b[x-1][y];
                    if(b[x][y] > 99)
                        System.out.print(" " + b[x][y] + " ");
                    else if(b[x][y] > 9)
                        System.out.print(" " + b[x][y] + " ");
                    else
                        System.out.print(" " + b[x][y] + " ");
                }
            }
            System.out.println();
        }
    }
}
