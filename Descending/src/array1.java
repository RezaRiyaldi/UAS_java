import java.util.Scanner;

public class array1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);        
        int n = 5;

        //deklarasi array
        String kata[] = new String[n];
        
        //input data ke array
        for (int i=0; i<kata.length; i++){
            System.out.print("Kata ke - " + (i + 1) + " : ");
            kata[i] = input.next();
        }
        
        //menampilkan data dalam array
        System.out.println("Kata-kata yang dimasukan : ");
        for (int i=0; i<kata.length; i++){
            System.out.println(kata[i]);
        }
    }
}
