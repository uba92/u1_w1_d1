public class Main3 {
    public static void main (String[] args) {


        double p = perimetro(4.2,2.5);
        System.out.println("Il perimetro del rettangolo è: " + p);

        int result = pariDispari(4);
        System.out.println(result);

        double area = areaTriangolo(5, 6, 7);
        System.out.println("L'area del triangolo è: " + area);
    }

    public static double perimetro (double b, double h) {return b*2 + h*2;}

    public static int pariDispari (int n) {
        if(n%2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double areaTriangolo (double a, double b, double c) {
        double semiperimeter = (a+b+c)/2;
        return Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
    }
}
