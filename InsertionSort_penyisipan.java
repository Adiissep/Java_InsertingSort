package Insertingsort;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
 
/**
 * 
 * @author adisepriyadi
 * TI20E Reg B
 *
 */
 
public class InsertionSort_penyisipan {
    public static void main(String[] args) throws IOException {
        //Objek BufferedReader berguna untuk membaca input stream berupa string, charakter dan array.
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan jumlah Data : ");    
        int jlh_data = Integer.parseInt(dataIn.readLine()); 
        //Jumlah Array untuk menampung nilai Data 
        int[] data = new int[jlh_data];
         
        //Menu pengisian
        System.out.println("\nMenu Pengisian Data");
        System.out.println("1. Di input oleh user");
        System.out.println("2. Di isi automatis acak oleh program");
        System.out.print("Pilihan : ");     
        int isi_data = Integer.parseInt(dataIn.readLine());
        //switch berguna untuk menentukan proses pemilihan
        switch(isi_data)
        {
            case 1  ://Manual isi
                     System.out.println();
                     for(int u = 0; u < jlh_data; u++)
                     {
                        System.out.print("Data ke-"+(u+1)+" : ");   
                        data[u] = Integer.parseInt(dataIn.readLine());
                     }
            break;            
            case 2  ://Automatis isi(acak)
                     System.out.println();
                     for(int r = 0; r < jlh_data; r++)
                        data[r] = new Random().nextInt(250);//syntax random dengan batasan nilai 250
                        //Tampilkan data oleh program acak
                        System.out.print("Data : ");
                        for(int r = 0; r < jlh_data; r++)
                            System.out.print(data[r]+" ");
            break;                      
            default :System.out.println("\nPilihan tidak tersedia, Coba memilih ulang pilihan yang ada!");
        }

        //Proses kerja Insertion Sort
        System.out.println("\nProses Insertion Sort");
        for(int i = 0; i < jlh_data-1; i++)
        {
            System.out.println("literasi "+(i+1));
            for(int j = 0; j < jlh_data; j++)
                System.out.print(data[j]+"\t");
             
            System.out.print(" -> Bandingkan "+data[i+1]+" dengan "+data[i]);
             
            for(int j = i+1; j > 0; j--)
            {
                String pesan = " -> Tidak ada pertukaran";
                if(data[j] < data[j-1])
                {
                    pesan = " -> "+data[j]+" tukar posisi dengan "+data[j-1];
                     
                    //Proses Pertukaran 
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                     
                    System.out.println();
                    for(int k = 0; k < jlh_data; k++)
                        System.out.print(data[k]+"\t");
                     
                    System.out.print(pesan);
                }
                 
                else
                {
                    System.out.println();
                    for(int k = 0; k < jlh_data; k++)
                        System.out.print(data[k]+"\t");
                        System.out.print(pesan);
                    break;
                }
            }
            System.out.println("\n");
        }
         
        //menampilkan hasil Sorting
        System.out.print("\nData setelah di Sorting : ");
        for(int s = 0; s < jlh_data; s++)
            System.out.print(data[s]+" ");
         
    }
}
