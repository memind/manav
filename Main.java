import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        double armut, elma, muz, ptlcn, dmts, toplam;
        double armutkg = 2.14, elmakg = 3.67, muzkg = 0.95, dmtskg = 1.11, ptlcnkg = 5;

        System.out.print("Armut kaç kilo? : ");
        Scanner inp1 = new Scanner(System.in);
        armut = inp1.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        Scanner inp2 = new Scanner(System.in);
        elma = inp2.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        Scanner inp3 = new Scanner(System.in);
        dmts = inp3.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        Scanner inp4 = new Scanner(System.in);
        muz = inp4.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        Scanner inp5 = new Scanner(System.in);
        ptlcn = inp5.nextDouble();

        toplam = (armut*armutkg)+(elma*elmakg)+(muz*muzkg)+(dmts*dmtskg)+(ptlcn*ptlcnkg);
        System.out.println("Toplam Odemeniz Gereken Ucret: "+toplam+"TL");
    }
}