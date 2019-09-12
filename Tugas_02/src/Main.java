import com.enigma.model.Car;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        System.out.print("Input koordinat (x,y) : ");
        String koordinat = dataIn.readLine();
        String[] xy = koordinat.split(",");
        Car rush = new Car(Integer.parseInt(xy[0]),Integer.parseInt(xy[1]));
        System.out.print("Isi bensin  :");
        String jumData = dataIn.readLine();
        int fuel = Integer.parseInt(jumData);
        rush.fillFuel(fuel);
        System.out.print("Input Perintah :");
        String comands = dataIn.readLine();
        rush.comand(comands);
        rush.run();
      //  System.out.println(rush.comand("RRRR"););
        System.out.println(rush.print());
    }
}
