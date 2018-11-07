package hattertarolooop;

public class HatterTaroloOOP {

    public static void main(String[] args) {

        Fajl f1 = new Fajl("recept.docx", 689);
        Fajl f2 = new Fajl("Tronok_Harca_HD_S01.mkv", 25327323);
        Fajl f3 = new Fajl("kisfilm.avi", 30000);
        Fajl f4 = new Fajl("BosszuallokHD.mkv", 4494580);
        Fajl f5 = new Fajl("Csillagok_Haboruja.mkv", 1677895);
        Fajl f6 = new Fajl("Gyuruk_Ura.mkv", 2932105);
        
        System.out.println("Fájlok");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
                
        HatterTarolo piciHDD = new HatterTarolo(15000000);
        piciHDD.hozzaAd(f1);
        piciHDD.hozzaAd(f2);
        piciHDD.hozzaAd(f3);
        
        System.out.println("\npiciHDD tartalma:");
        System.out.println(piciHDD.listaz());

        Floppy kisFloppy = new Floppy();
        System.out.println("Floppy szabadkapacitása: " + kisFloppy.szabadKapacitas());
        kisFloppy.hozzaAd(f1);        
        System.out.println("Floppy tartalma:");
        System.out.println(kisFloppy.listaz());
        System.out.println("Floppy szabadkapacitása: " + kisFloppy.szabadKapacitas());
        
        DVD bosszuallok = new DVD();
        System.out.println("\nDVD szabadkapacitása: " + bosszuallok.szabadKapacitas());
        bosszuallok.hozzaAd(f4);
        System.out.println("DVD tartalma: ");
        System.out.println(bosszuallok.listaz());
        System.out.println("DVD szabadkapacitása: " + bosszuallok.szabadKapacitas());
        bosszuallok.Zarolas();
        System.out.println("DVD szabadkapacitása zárolás után: " + bosszuallok.szabadKapacitas());
        
        DVDRW filmek = new DVDRW();
        System.out.println("\nDVD-RW szabadkapacitása: " + filmek.szabadKapacitas());
        filmek.hozzaAd(f5);
        System.out.println("DVD-RW tartalma: ");
        System.out.println(filmek.listaz());
        System.out.println("DVD-RW szabadkapacitása: " + filmek.szabadKapacitas());
        filmek.Zarolas();
        System.out.println("DVD-RW szabadkapacitása zárolás után: " + filmek.szabadKapacitas());
        filmek.Megnyitas();
        filmek.hozzaAd(f6);
        System.out.println("DVD-RW szabadkapacitása megnyitás egy egy film hozzáadása után: " + filmek.szabadKapacitas());
        
        HDD Toshiba = new HDD("C", 10013206);
        HDD Kingstone = new HDD("D", 5320012);
        HDD Samsung = new HDD("E", 20231690);
        HDD WD = new HDD("F", 30002369);
        
        Toshiba.hozzaAd(f6);
        
        Szamitogep PC1 = new Szamitogep();
        PC1.Felcsatol(Toshiba);
        PC1.Felcsatol(Kingstone);
        PC1.Lemezek();
        PC1.Archival(f3, Kingstone);
        PC1.Lemezek();
        
    }
    
}
