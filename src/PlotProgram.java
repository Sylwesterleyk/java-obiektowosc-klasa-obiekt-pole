public class PlotProgram {
    public static void main(String[] args) {

        Plot p1 = new Plot();
        char[] district1 = {'h', 'o', 'p', 'y'};
        p1.district = district1;
        p1.number = 215;
        p1.area = 3060;
        p1.tel = 503497635;

        Plot p2 = new Plot();
        char[] district2 = {'l', 'i', 'n', 'i', 'a'};
        p2.district = district2;
        p2.number = 42;
        p2.area = 860.5;
        p2.tel = 865298666;

        Plot p3 = new Plot();
        char[] district3 = {'k', 'o', 'ł', 'o'};
        p3.district = district3;
        p3.number = 11;
        p3.area = 12300;
        p3.tel = 515876651;

        Plot p4 = new Plot();
        char[] district4 = {'l', 'u', 'b', 'i', 'n'};
        p4.district = district4;
        p4.number = 442;
        p4.area = 1049;
        p4.tel = 937353743;

        Plot p5 = new Plot();
        char[] district5 = {'t', 'u', 'r', 'e', 'k'};
        p5.district = district5;
        p5.number = 6;
        p5.area = 55000;
        p5.tel = 751425625;

        Plot[] plots = {p1, p2, p3, p4, p5};

        for (Plot a : plots) {
            System.out.println("Numer działki: " + a.number);
            System.out.print("Obręb ewidencyjny: ");
            for (char b : a.district) {
                System.out.print(b);
            }
            System.out.println();
            System.out.println("Powierzchnia w m2: " + a.area);
            System.out.println("Numer telefonu klienta: " + a.tel);
            System.out.println();
        }
    }
}
