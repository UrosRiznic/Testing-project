import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import videoigra.Igrac;
import videoigra.Magija;
import videoigra.Odeca;
import videoigra.Oruzje;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VideoIgraTest {

    @Test
    void getNazivTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        String expected = "Uros";
        String actual = igrac.getNaziv();
        assertEquals(expected, actual);
    }

    @Test
    void setNazivTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        igrac.setNaziv("Novi naziv igraca");
        String expected = "Novi naziv igraca";
        String actual = igrac.getNaziv();
        assertEquals(expected, actual);
    }

    @Test
    void getZdravljeTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        double expected = 15.0;
        double actual = igrac.getZdravlje();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void setZdravljeTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        igrac.setZdravlje(20.0);
        double expected = 20.0;
        double actual = igrac.getZdravlje();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void getEnergijaTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        double expected = 100.0;
        double actual = igrac.getEnergija();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void setEnergijaTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        igrac.setEnergija(15.6);
        double expected = 15.6;
        double actual = igrac.getEnergija();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void getSnagaTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        int expected = 50;
        int actual = igrac.getSnaga();
        assertEquals(expected, actual);
    }

    @Test
    void setSnagaTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        igrac.setSnaga(22);
        int expected = 22;
        int actual = igrac.getSnaga();
        assertEquals(expected, actual);
    }

    @Test
    void getInteligencijaTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        int expected = 25;
        int actual = igrac.getInteligencija();
        assertEquals(expected, actual);
    }

    @Test
    void setInteligencijaTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        igrac.setInteligencija(9000);
        int expected = 9000;
        int actual = igrac.getInteligencija();
        assertEquals(expected, actual);
    }

    @Test
    void getStanjeTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        Igrac.Stanje expected = Igrac.Stanje.AGRESIVNO;
        Igrac.Stanje actual = igrac.getStanje();
        assertEquals(expected, actual);
    }

    @Test
    void setStanjeTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        igrac.setStanje(Igrac.Stanje.DEFANZIVNO);
        Igrac.Stanje expected = Igrac.Stanje.DEFANZIVNO;
        Igrac.Stanje actual = igrac.getStanje();
        assertEquals(expected, actual);
    }
/// testiranje getera i setera za array:
    @Test
    void getOruzjaTest() {
        ArrayList<Oruzje> oruzja = new ArrayList<>(); // instanciram array
        oruzja.add(new Oruzje()); // u array dodam orizije
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, oruzja, new ArrayList<>(), new ArrayList<>());
        ArrayList<Oruzje> expected = oruzja;
        ArrayList<Oruzje> actual = igrac.getOruzja();
        assertEquals(expected, actual);
    }

    @Test
    void setOruzjaTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        ArrayList<Oruzje> oruzja = new ArrayList<>();
        oruzja.add(new Oruzje());
        ArrayList<Oruzje> expected = oruzja;
        igrac.setOruzja(oruzja); // pozivom metode setOruzija
        ArrayList<Oruzje> actual = igrac.getOruzja();
        assertEquals(expected, actual);
    }

    @Test
    void getOdecaTest() {
        ArrayList<Odeca> odeca = new ArrayList<>();
        odeca.add(new Odeca());
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        ArrayList<Odeca> expected = odeca;
        ArrayList<Odeca> actual = igrac.getOdeca();
        assertEquals(expected, actual);
    }

    @Test
    void setOdecaTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        ArrayList<Odeca> odeca = new ArrayList<>();
        odeca.add(new Odeca());
        ArrayList<Odeca> expected = odeca;
        igrac.setOdeca(odeca);
        ArrayList<Odeca> actual = igrac.getOdeca();
        assertEquals(expected, actual);
    }

    @Test
    void getMagijeTest() {
        ArrayList<Magija> magija = new ArrayList<>();
        magija.add(new Magija());
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        ArrayList<Magija> expected = magija;
        ArrayList<Magija> actual = igrac.getMagije();
        assertEquals(expected, actual);
    }

    @Test
    void setMagijeTest() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>())
                ;ArrayList<Magija> magija = new ArrayList<>();
        magija.add(new Magija());
        ArrayList<Magija> expected = magija;
        igrac.setMagije(magija);
        ArrayList<Magija> actual = igrac.getMagije();
        assertEquals(expected, actual);
    }
// toString test koji vraca ovo :  return "(" + naziv + ", " + zdravlje + "/" + energija + ", STR:" + snaga + ", INT:" + inteligencija + ")";
    @Test
    void toString_ShouldReturnExactInformationsAsAStringInSpecificFormat() {
        Igrac igrac = new Igrac("Uros", 15.0, 100.0, 50, 25, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        String expected = "(Uros, 15.0/100.0, STR:50, INT:25)";
        String actual =  igrac.toString();
        assertEquals(expected, actual);
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private Oruzje oruzjeMock = Mockito.mock(Oruzje.class);
    private Odeca odecaMock = Mockito.mock(Odeca.class);
    private Magija magijaMock = Mockito.mock(Magija.class);

    private Oruzje oruzjeMock2 = Mockito.mock(Oruzje.class);
    private Odeca odecaMock2 = Mockito.mock(Odeca.class);
    private Magija magijaMock2 = Mockito.mock(Magija.class);

    ArrayList<Oruzje> oruzja2 = new ArrayList<>();
    ArrayList<Odeca> odeca2 = new ArrayList<>();
    ArrayList<Magija> magije2 = new ArrayList<>();
    Igrac igrac1;
    Igrac igrac2;

    void initializer(){ //Iniciramo poziv mokova
        oruzja2.add(oruzjeMock); // u listu oruzja2, dodajemo mock oruzja
        odeca2.add(odecaMock);  // isto...
        magije2.add(magijaMock);

        oruzja2.add(oruzjeMock2);
        odeca2.add(odecaMock2);
        magije2.add(magijaMock2);
                            //Pravimo 2 igraca, sa nasumicnim statusima
        igrac1 = new Igrac("Uros", 45.5, 19.0, 60, 100, Igrac.Stanje.DEFANZIVNO, oruzja2, odeca2, magije2);
        igrac2 = new Igrac("Riznic", 57.0, 19.0, 50, 50, Igrac.Stanje.AGRESIVNO, oruzja2, odeca2, magije2);
    }

    // napadni igraca testovi:

    //1) kada igrac nema energiju  i nema snage za oruzije
    //2) kada igrac ima energiju i ima snage za oruzije
    //3) kada igrac ima energiju i nema snage
    //4) kada igrac nema energiju i ima snage
    //5) kada igrac gubi poene
    //6) kada igrac treba da primi stetu pa ide u - stanje
    // PRVA 4 TESTA TREBA POKUSATI KROZ SVA 3 STANJA

    @Test
    void napadniIgraca_ShouldReturn96_IfEnergy19_WhenInStanjeDef(){
        initializer();

        //energija = 19 (manja) -
        //snaga 60  (manja)     -
        //0+120*0.8
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(75.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setStanje(Igrac.Stanje.DEFANZIVNO);
        double expected = 96.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }



    ////


    @Test
    void napadniIgraca_ShouldReturn108_IfEnergy21AndSnaga60_WhenInStanjeDef(){
        initializer();
        //energija 21 veca  +
        //snaga 60 veca		+
        //15+120*0.8
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(60.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setEnergija(21);
        igrac1.setStanje(Igrac.Stanje.DEFANZIVNO);
        double expected = 108.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }


    ///


    @Test
    void napadniIgraca_ShouldReturn96_IfEnergy19AndSnaga60_WhenInStanjeDef(){
        initializer();
        //energija = 19 manja -
        //snaga = 60 veca 	  +
        // 0+ 120*0.8
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(60.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(16.0);
        igrac1.setStanje(Igrac.Stanje.DEFANZIVNO);
        double expected = 96.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }


    ///


    @Test
    void napadniIgraca_ShouldReturn102_IfEnergy19AndSnaga60_WhenInStanjeDef(){
        initializer();
        //energija = 21 veca +
        //snaga = 60 manja -
        // 8 + 120 * 0.8

        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(75.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(16.0);
        igrac1.setEnergija(21);
        igrac1.setStanje(Igrac.Stanje.DEFANZIVNO);
        double expected = 102.4;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }


    ///


    @Test
    void napadniIgraca_ShouldDecreaseEnergyTo0_WhenEnergyEqualTo21(){
        initializer();
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(75.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setEnergija(21);
        igrac1.napadniIgraca(0, igrac2);
        double expected = 0.0;
        double actual = igrac1.getEnergija();
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    void napadniIgraca_ShouldReturn120_IfEnergy19_WhenInStanjePASIVNO(){
        initializer();

        //energija = 19 (manja) -
        //snaga 60  (manja)     -
        //0+120*1
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(75.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setStanje(Igrac.Stanje.PASIVNO);
        double expected = 120.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }



    ////


    @Test
    void napadniIgraca_ShouldReturn135_IfEnergy21AndSnaga60_WhenInStanjePASIVNO(){
        initializer();
        //energija 21 veca  +
        //snaga 60 veca		+
        //15+120*1
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(60.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setEnergija(21);
        igrac1.setStanje(Igrac.Stanje.PASIVNO);
        double expected = 135.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }


    ///


    @Test
    void napadniIgraca_ShouldReturn120_IfEnergy19AndSnaga60_WhenInStanjePASIVNO(){
        initializer();
        //energija = 19 manja -
        //snaga = 60 veca 	  +
        // 0+ 120*1
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(60.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(16.0);
        igrac1.setStanje(Igrac.Stanje.PASIVNO);
        double expected = 120.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }


    ///


    @Test
    void napadniIgraca_ShouldReturn128_IfEnergy19AndSnaga60_WhenInStanjePASIVNO(){
        initializer();
        //energija = 21 veca +
        //snaga = 60 manja -
        // 8 + 120 * 1

        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(75.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(16.0);
        igrac1.setEnergija(21);
        igrac1.setStanje(Igrac.Stanje.PASIVNO);
        double expected = 128.4;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }



    //////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    void napadniIgraca_ShouldReturn144_IfEnergy19_WhenInStanjeAGRESIVNO(){
        initializer();

        //energija = 19 (manja) -
        //snaga 60  (manja)     -
        //0+120*1,2
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(75.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setStanje(Igrac.Stanje.AGRESIVNO);
        double expected = 144.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }



    ////


    @Test
    void napadniIgraca_ShouldReturn162_IfEnergy21AndSnaga60_WhenInStanjeAGRESIVNO(){
        initializer();
        //energija 21 veca  +
        //snaga 60 veca		+
        //15+120*1,2
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(60.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setEnergija(21);
        igrac1.setStanje(Igrac.Stanje.AGRESIVNO);
        double expected = 162.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }


    ///


    @Test
    void napadniIgraca_ShouldReturn144_IfEnergy19AndSnaga60_WhenInStanjeAGRESIVNO(){
        initializer();
        //energija = 19 manja -
        //snaga = 60 veca 	  +
        // 0+ 120*1,2
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(60.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(16.0);
        igrac1.setStanje(Igrac.Stanje.AGRESIVNO);
        double expected = 144.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }


    ///


    @Test
    void napadniIgraca_ShouldReturn153_IfEnergy19AndSnaga60_WhenInStanjeAGRESIVNO(){
        initializer();
        //energija = 21 veca +
        //snaga = 60 manja -
        // 8 + 120 * 1,2

        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(75.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(16.0);
        igrac1.setEnergija(21);
        igrac1.setStanje(Igrac.Stanje.AGRESIVNO);
        double expected = 153.6;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////

    // testovi za odbraniSe metodu.

    @Test
    void odbraniSe_ShouldThrowAnIllegalArgumentException_IfGivenArgumentLessThanZero(){
        initializer();
        assertThrows(IllegalArgumentException.class, () -> {
            igrac1.odbraniSe(-1.0);
        });
    }

    @Test
    void odbraniSe_ShouldThrowAnIllegalArgumentException_IfGivenArgumentEqualToZero(){
        initializer();

        assertThrows(IllegalArgumentException.class, () -> {
            igrac1.odbraniSe(0.0);
        });
    }


    @Test // treba da padne jer su zamenjeni k za AGRESIVNO i DEFANZIVNO
    void odbraniSe_ShouldReturn6Point41_IfTezinaLessThanMaxTezinaAndStateIsAGRESIVNO(){
        initializer();
        Mockito.when(odecaMock.getTezina()).thenReturn(14.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);

        igrac1.setStanje(Igrac.Stanje.AGRESIVNO);
        double expected = 6.41;
        double actual = igrac1.odbraniSe(25.0);
        assertEquals(expected, actual, 0.1);

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }

    @Test
    void odbraniSe_ShouldReturn3Point2_IfTezinaLessThanMaxTezinaAndStateIsPASIVNO(){
        initializer();
        Mockito.when(odecaMock.getTezina()).thenReturn(14.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);

        igrac1.setStanje(Igrac.Stanje.PASIVNO);
        double expected = 3.2;
        double actual = igrac1.odbraniSe(25.0);
        assertEquals(expected, actual, 0.1);

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }

    @Test // treba da padne jer su zamenjeni k za AGRESIVNO i DEFANZIVNO
    void odbraniSe_ShouldReturn2Point13_IfTezinaLessThanMaxTezinaAndStateIsDEFANZIVNO(){
        initializer();
        Mockito.when(odecaMock.getTezina()).thenReturn(14.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);

        double expected = 2.13;
        double actual = igrac1.odbraniSe(25.0);
        assertEquals(expected, actual, 0.1);

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }

    @Test
    void odbraniSe_ShouldThrowIllegalStateException_IfTezinaLessThanMaxTezinaAndStateIsIllegal(){
        initializer();
        Mockito.when(odecaMock.getTezina()).thenReturn(14.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);

        igrac1.setStanje(Igrac.Stanje.NEPOSTOJECE);
        assertThrows(IllegalStateException.class, () -> {
            igrac1.odbraniSe(25.0);
        });

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }


    @Test
    void odbraniSe_ShouldReturn4Point27_IfTezinaGreaterThanMaxTezinaAndStateIsDEFANZIVNO(){
        initializer();
        igrac1.setSnaga(20);
        Mockito.when(odecaMock.getTezina()).thenReturn(15.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);

        double expected = 4.27;
        double actual = igrac1.odbraniSe(25.0);
        assertEquals(expected, actual, 0.1);

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }

    @Test
    void odbraniSe_ShouldReturn7Point12_IfTezinaGreaterThanMaxTezinaAndStateIsPASIVNO(){
        initializer();
        igrac1.setSnaga(20);
        Mockito.when(odecaMock.getTezina()).thenReturn(15.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);
        igrac1.setStanje(Igrac.Stanje.PASIVNO);
        double expected = 7.12;
        double actual = igrac1.odbraniSe(25.0);
        assertEquals(expected, actual, 0.1);

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }

    @Test
    void odbraniSe_ShouldReturn13Point35_IfTezinaGreaterThanMaxTezinaAndStateIsAGRESIVNO(){
        initializer();
        igrac1.setSnaga(20);
        Mockito.when(odecaMock.getTezina()).thenReturn(15.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);
        igrac1.setStanje(Igrac.Stanje.AGRESIVNO);
        double expected = 13.35;
        double actual = igrac1.odbraniSe(25.0);
        assertEquals(expected, actual, 0.1);

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }


    @Test
    void odbraniSe_ShouldThrowIllegalStateException_IfTezinaGreaterThanMaxTezinaAndStateIsIllegal(){
        initializer();
        igrac1.setSnaga(20);
        Mockito.when(odecaMock.getTezina()).thenReturn(15.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);

        igrac1.setStanje(Igrac.Stanje.NEPOSTOJECE);
        assertThrows(IllegalStateException.class, () -> {
            igrac1.odbraniSe(25.0);
        });

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // testovi za metodu upotrebiMagiju()

    @Test
    void upotrebiMagiju_ShouldDecreaseZdravljeFor10Percent_IfInteligencijaLessThanNeed(){
        initializer();
        Mockito.when(magijaMock.getSteta()).thenReturn(15.0);
        Mockito.when(magijaMock.getPotrebnaInteligencija()).thenReturn(65.0);
        Mockito.when(magijaMock.getPotrebnaEnergija()).thenReturn(55.0);

        igrac1.setInteligencija(55);
        igrac1.upotrebiMagiju(0, igrac2);
        double expected = 40.95;
        double actual = igrac1.getZdravlje();
        assertEquals(expected, actual, 0.01);

        Mockito.verify(magijaMock).getSteta();
        Mockito.verify(magijaMock).getPotrebnaInteligencija();
        Mockito.verify(magijaMock).getPotrebnaEnergija();

    }

    @Test
    void upotrebiMagiju_ShouldSetEnergijaToZero_IfInteligencijaLessThanNeed(){
        initializer();
        Mockito.when(magijaMock.getSteta()).thenReturn(15.0);
        Mockito.when(magijaMock.getPotrebnaInteligencija()).thenReturn(65.0);
        Mockito.when(magijaMock.getPotrebnaEnergija()).thenReturn(55.0);

        igrac1.setInteligencija(55);
        igrac1.upotrebiMagiju(0, igrac2);
        double expected = 0.0;
        double actual = igrac1.getEnergija();
        assertEquals(expected, actual, 0.01);

        Mockito.verify(magijaMock).getSteta();
        Mockito.verify(magijaMock).getPotrebnaInteligencija();
        Mockito.verify(magijaMock).getPotrebnaEnergija();
    }

    // ------> TESTOVI ZA 10. METOD -> odmoriSe() <------

    @Test
    void odmoriSe_ShouldReturnZero_IfEnergyGreaterThan75(){
        initializer();
        igrac1.setEnergija(80.0);
        double expected = 0.0;
        double actual = igrac1.odmoriSe();
        assertEquals(expected, actual, 0.01);

    }

    @Test
    void odmoriSe_ShouldReturn49_IfEnergyGreaterThan50(){
        initializer();
        igrac1.setEnergija(51.0);
        double expected = 49.0;
        double actual = igrac1.odmoriSe();
        assertEquals(expected, actual, 0.01);

    }

    @Test
    void odmoriSe_ShouldReturn40_IfEnergyGreaterThan50(){
        initializer();
        igrac1.setEnergija(60.0);
        double expected = 40.0;
        double actual = igrac1.odmoriSe();
        assertEquals(expected, actual, 0.01);

    }

    @Test
    void odmoriSe_ShouldReturn50_IfEnergyEqualTo50(){
        initializer();
        igrac1.setEnergija(50.0);
        double expected = 50.0;
        double actual = igrac1.odmoriSe();
        assertEquals(expected, actual, 0.01);

    }

    @Test // ima bug u uslovu za proveru da li je energija + 50 > 100, jer umesto 50 stoji 500
    void odmoriSe_ShouldReturn50_IfEnergyLessThan50(){
        initializer();
        igrac1.setEnergija(40.0);
        double expected = 50.0;
        double actual = igrac1.odmoriSe();
        assertEquals(expected, actual, 0.01);

    }


}