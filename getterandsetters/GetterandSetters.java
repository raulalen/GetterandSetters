package getterandsetters;

import java.util.Random;
import java.util.Scanner;

public class GetterandSetters {

    public static void main(String[] args) {
     Random seed = new Random ();
     Scanner in = new Scanner(System.in);
     double raio;
     
     Circle [] c = new Circle [3];
     System.out.println("Entre raio: ");
     raio = in.nextDouble();
     c[0] = new Circle(raio);
     
     raio = 15*seed.nextDouble();
     c[1] = new Circle(raio);
     
     raio = 20*seed.nextDouble();
     c[2] = new Circle(raio);
     printAreas(c);
     
     Circle c2 = new Circle (7);
     printAreas(c2,9);
    }
    
    private static void printAreas(Circle[] c){
     for(int i=0;i<3;i++){
        System.out.println("Area(c["    + i +   "])" 
                + String.format("%.3f",c[i].getArea(c[i].getRaio())));
    }   
    }
    
    private static void printAreas(Circle c, int n){
        int j = 0;
        System.out.println("Raios        Areas");
        while (j<=n)
        {
            System.out.println(String.format("%.3f",c.getRaio()) + "        " 
                    +String.format("%.3f",c.getArea(c.getRaio())));
            c.setRaio(c.getRaio() + 1.25);
            j++;
        }
    }
    
}
