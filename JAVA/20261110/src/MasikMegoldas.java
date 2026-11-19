


void main() {

    /*
    A fájl egy sora a következő adatokat tartalmazza:
        • 1. oszlop: a nap sorszáma (1: hétfő).
        • 2. oszlop: a pingvin neve.
        • 3. oszlop: milyen halat kapott az adott pingvin.
        • 4. oszlop: hány darabot kapott az adott halból a pingvin

    Írj programot, amely megoldja a következő feladatokat! A feladatok megoldásához használd fel a
    halak.txt fájlt! A program írja ki a feladat sorszámát is!
        a) Írj függvényt adatokBeolvasasa néven, amelyik beolvassa a fájl tartalmát egy megfelelő adatszer
        kezetbe! Ügyelj arra, hogy a fájlban található számok numerikus értékekként legyenek eltárolva
        az általad választott adatszerkezetben. Az adatszerkezeted neve etetes legyen!
    b) Írj függvényt fajtak néven, amelyik a példában látható módon kiírja a képernyőre, hogy össze
    sen hány különböző halfajtát kaptak enni a pingvinek! A függvény kapja meg paraméterül az
    adatokat tartalmazó adatszerkezetet, és küldje vissza a hívás helyére a halfajtákat tartalmazó
    listát
     */

    String filename= "JAVA\\20261110\\adat.txt";
    PingvinList pingvinek= adatokBeolvasasa(filename);
    //pingvinek.kiir();
    ArrayList<String> halfajtak= fajtak(pingvinek);

    for(String s :  halfajtak){
        IO.println(s);
    }
}
static class PingvinList{
    List<Pingvin> list;

    public PingvinList() {
        list = new LinkedList<>();
    }

    public ArrayList<String> getHalfajtak(){
        Set<String> halfajtak= new HashSet<>();
        for(Pingvin p :  list){
            halfajtak.add(p.halFajta);
        }
        return new ArrayList<>(halfajtak);
    }
    public void hozzaAd(Pingvin p){
        list.add(p);
    }
    public void kiir(){
        for(Pingvin p:list){
            IO.println(p);
        }
    }
}
static class Pingvin{
    int napSorszama;
    String pingvinNev;
    String halFajta;
    int mennyiseg;

    //alt+insert -> constructor
    public Pingvin(
            int napSorszama,
            String pingvinNev,
            String halFajta,
            int mennyiseg) {
        this.napSorszama = napSorszama;
        this.pingvinNev = pingvinNev;
        this.halFajta = halFajta;
        this.mennyiseg = mennyiseg;
    }

    @Override
    public String toString() {
        return "Pingvin{" +
                "napSorszama=" + napSorszama +
                ", pingvinNev='" + pingvinNev + '\'' +
                ", halFajta='" + halFajta + '\'' +
                ", mennyiseg=" + mennyiseg +
                '}';
    }
}

PingvinList adatokBeolvasasa(String filename){
    PingvinList pingvinLista=new PingvinList();
    try {
        List<String> sorok = Files.readAllLines(Path.of(filename));

        for(String sor: sorok){
            String[] adatok = sor.split(" ");

            pingvinLista.hozzaAd(new Pingvin(
                    Integer.parseInt(adatok[0]),
                    adatok[1],
                    adatok[2],
                    Integer.parseInt(adatok[3])
            ));
        }
    } catch (IOException e) {
        IO.println("Fájlkezelési hiba: " + e.getMessage());

    } catch (NumberFormatException e) {
        IO.println("Hibás számformátum: " + e.getMessage());

    } catch (ArrayIndexOutOfBoundsException e) {
        IO.println("Hibás adatsor! Nincs elegendő adat.");
    }
    return pingvinLista;
}

ArrayList<String> fajtak(PingvinList pingvinek){
    return pingvinek.getHalfajtak();
}