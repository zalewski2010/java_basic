public class CompPrice {

    public static void main(String[] args) {
        
        int cProc = 700; // cena procesora
        int cPLY = 500; // cena płyty
        int cPam = 300; // cena ramu
        int cDysk = 400;
        int cInn = 500;

        final double VAT = 1.22; // narzut podatku

        //liczymy cenę bez monitora , sumujemy, zapisujemy jako wyrażenie inicjujące zmienną cKomp

        double cKomp = (cProc + cPLY + cPam + cDysk + cInn) * VAT;

        System.out.println("Cena komputera bez monitora wynosi : ");
        System.out.println(cKomp);

        int cMon = 1100; // cena monitora netto
        cKomp = cKomp + cMon * VAT; // nowa cena kompa z monitorem

        System.out.println("Cena komputera z monitorem wynosi:");
        System.out.println(cKomp);
    }
}
