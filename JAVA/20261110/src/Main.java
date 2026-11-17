


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

    String filename= "JAVA\\20261110\\adatok.txt";
    adatokBeolvasasa(filename);
}

void adatokBeolvasasa(String filename){
    int[] napSorszama=new int[46];
    String[] pingvinNev=new String[46];
    String[] halFajta=new String[46];
    int[] mennyiseg=new int[46];

    try {
        Path path=Path.of(filename);
        List<String> sorok = Files.readAllLines(path);

        // IO.println("Beolvasott fájl:");
        // IO.println(path.toAbsolutePath());

        int index=0;
        for(String sor: sorok){
            //IO.println(sor);
            String[] adatok = sor.split(" ");

            napSorszama[index]=Integer.parseInt(adatok[0]);
            pingvinNev[index]=adatok[1];
            halFajta[index]=adatok[2];
            mennyiseg[index]=Integer.parseInt(adatok[3]);

            index++;
        }
    }catch (IOException e){
        IO.println(e.getMessage());
    }
}