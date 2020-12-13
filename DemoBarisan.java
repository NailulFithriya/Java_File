package Abstract_Class;

/**
 * Write a description of class DemoBarisan here.
 *
 * @author Nailul Fithriya
 * @version 13 Desember 2020
 */

import java.util.Scanner;

public class DemoBarisan
{
    
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        while(true){
            System.out.println("\nPilihlah deret yang ingin ditampilkan");
            System.out.println("1. Barisan Aritmetika");
            System.out.println("2. Barisan Geometri");
            System.out.println("3. Barisan Fibonacci");
            System.out.println("4. Barisan Berpangkat");
            System.out.print("Pilihan : ");
            int pilih = inputUser.nextInt();
        
            cetakUrutan20(pilih);
            
            System.out.println("\n\nApakah anda ingin menampilkan deret lainnya?");
            System.out.println("jawab 1 jika ya dan 0 jika tidak");
            System.out.print("Pilihan : ");
            int pilih2 = inputUser.nextInt();
            
            if (pilih2 == 1){
                continue;
            }
           else if (pilih2 == 0){
               System.out.println("Program selesai...");
               break;
            }
            else{
                System.out.println("input salah!");
            }
        }
        
        
    }
    
    public static void cetakUrutan20(int pilih){
        Scanner inputUser = new Scanner(System.in);
        Barisan ar;
        
        if (pilih <= 2){
            System.out.print("\nMasukkan nilai Awal = ");
            int awal = inputUser.nextInt();
            System.out.print("Masukkan nilai kenaikan = ");
            int naik = inputUser.nextInt();
        
            if (pilih == 1){
                ar = new BarisanAritmetika(awal, naik);
                System.out.println("\nBarisan Aritmatikanya adalah : ");
                System.out.print(awal);
        
                for (int i = 0; i < 19; i++){
                    
                    System.out.print( " "+ar.berikutnya());
                }
            }
        
            else if (pilih == 2){
                ar = new BarisanGeometri(awal, naik);
                System.out.println("\nBarisan Geometrinya adalah : ");
                System.out.print(awal);
        
                for (int i = 0; i < 19; i++){
                    System.out.print(" "+ar.berikutnya());
                }
            }
            
        }
        else if (pilih == 3){
            ar = new BarisanFibonacci();
            System.out.println("\nBarisan Fibonaccinya adalah : ");
            System.out.print(ar.nilaiBerikutnya);
            
            for (int i = 0; i < 19; i++){
                System.out.print(" "+ar.berikutnya());
            }
        }
        
        else if (pilih == 4){
            System.out.print("\nMasukkan nilai Awal = ");
            int awal = inputUser.nextInt();
            System.out.print("Masukkan nilai pangkat = ");
            int pangkat = inputUser.nextInt();

            for (int i = awal; i < awal+20; i++){
                ar = new BarisanPangkat(i, pangkat);
                System.out.print(ar.berikutnya()+ " ");
            }
        }
        
        else{
            System.out.println("input salah!");
        }
    }
}
