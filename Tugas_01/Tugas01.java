import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 

public class Tugas01 
{ 
    public static void main( String[] args )throws IOException{ 

      BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
      System.out.print("Input Jumlah data:");   
      String jumData = dataIn.readLine();  
      int n = Integer.parseInt(jumData);
      String[] name = new String[n];
      Integer[] umur = new Integer[n];
int numb = 1 ;
 for(int i = 0; i < n; i++){
      System.out.println("silahkan masukan data:"+numb ++);      
      System.out.print(" Name:"); 
       name[i]  = dataIn.readLine();
       System.out.print(" umur:");   
       umur[i] = Integer.parseInt(dataIn.readLine());     
 }
 System.out.println("===================" ); 
 // menampilkan semua isi array
      System.out.println("nama | umur");

         for(int i = 0; i < n; i++){
        System.out.print(name[i]);
        System.out.print("|");
        System.out.println(umur[i]);
         }
         for(String x:name){
               System.out.print(x);

         }
  
   } 
}