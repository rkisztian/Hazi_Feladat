
public class Feladat17 {
    public static void main(String[] args) {
        int hossz = 5;
        double[] tomb = new double[hossz];
        double[] tomb2 = new double[hossz];
        double[] vegeredmeny = new double[hossz];

        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = Math.random() * 100;
            tomb2[i] = Math.random() * 100;

        }
        for (int i = 0; i < hossz; i++) {
            vegeredmeny[i] = tomb[i] + tomb2[i];
            System.out.printf("%f + °%f = %f\n",tomb[i],tomb2[i],vegeredmeny[i]);
        }


    }
}
