

void main() {
    // Ágazati 2023 május 31

    /*
    1. feladat 8 pont
        Írj programot, ami megoldja a következő feladatokat! A program írja ki
        a feladat sorszámát is!
        a) Hozz létre egy üres listát elemek néven! (1 pont)
        b) Töltsd fel ezt a listát 10 darab 0 és 9 közötti véletlenszámmal!
        (2 pont)
        c) Írd ki a lista tartalmát a példában látható módon! (1 pont)
        d) Írd ki a példában látható módon, hogy mennyi az elemek listában
        található 5-nél kevesebb és az 5-nél nagyobb számok összege!
        (4 pont)

        1. feladat:
        A lista tartalma: [1, 0, 5, 2, 3, 7, 4, 1, 6, 5]
        5-nél kisebb elemek összege: 11
        5-nél nagyobb elemek összege: 13
     */

    IO.println("1. feladat:");
    int[] elemek=new int[10];
    Random rnd = new Random();
    for (int i = 0; i < elemek.length; i++) {
        elemek[i]=rnd.nextInt(10);
    }
    IO.print("A lista tartalma: [");
    for (int i = 0; i < elemek.length-1; i++) {
        IO.print(elemek[i]+", ");
    }
    IO.print(elemek[elemek.length-1]);
    IO.println("]");
    int szamlaloKisebb5=0;
    int szamlaloNagyobb5=0;
    for (int i = 0; i < elemek.length; i++) {
        if(elemek[i]>5) szamlaloNagyobb5+=elemek[i];
        else if(elemek[i]<5) szamlaloKisebb5+=elemek[i];
    }
    IO.println("5-nél kisebb elemek összege: "+szamlaloKisebb5);
    IO.println("5-nél nagyobb elemek összege: "+szamlaloNagyobb5);


    /*
    2. feladat 14 pont
        Írj programot, amelyik megoldja a következő feladatokat! A feladatok
        megoldásához használd fel az 1. feladatban létrehozott elemek listát!

        Amennyiben nem sikerült megoldanod az 1. feladat a) és b) pontját, ak-
        kor hozd létre most az elemek listát és kézzel írj bele 10 darab 0 és 9

        közötti egész számot! A program írja ki a feladat sorszámát is!
        a) Igaz, hogy a listában 4-nél kevesebb páratlan szám szerepel?
        (4 pont)
        b) Igaz, hogy a listában lévő legnagyobb elem többször fordul elő a
        lista első felében (az első 5 elem között), mint a második felében?
        (10 pont)

        2. feladat:
        A listában lévő páratlan elemek száma: 6 db
        Nem igaz az állítás!
        A listában lévő legnagyobb elem: 7
        A legnagyobb elem előfordulása a lista első felében: 0 db
        A legnagyobb elem előfordulása a lista második felében: 1 db
        Nem igaz az állítás!
     */
    IO.println("");
    IO.println("2. feladat:");
    IO.print("A listában lévő páratlan elemek száma: ");
    int szamlaloPtlan=0;
    for (int i = 0; i < elemek.length; i++) {
        if(elemek[i]%2==1){
            szamlaloPtlan++;
        }
    }
    IO.print(szamlaloPtlan);
    IO.println(" db");
    if(szamlaloPtlan>=4) IO.println("Nem igaz az állítás!");
    else IO.println("Igaz az állítás!");

    IO.println((szamlaloPtlan>=4?"Nem igaz":"Igaz")+" az állítás!");

    IO.print("listában lévő legnagyobb elem: ");

    int maxElem=elemek[0];
    for(int i=1;i<elemek.length;i++)
        if(elemek[i]>maxElem)
            maxElem=elemek[i];
    IO.println(maxElem);

    IO.print("A legnagyobb elem előfordulása a lista első felében: ");
    int szamlaloTombElsoFele=0;
    for (int i = 0; i < elemek.length/2; i++)
        if(elemek[i]==maxElem) szamlaloTombElsoFele++;
    IO.println(szamlaloTombElsoFele+" db");

    IO.print("A legnagyobb elem előfordulása a lista második felében: ");
    int szamlaloTombMasodikFele=0;
    for (int i = elemek.length/2; i < elemek.length; i++)
        if(elemek[i]==maxElem) szamlaloTombMasodikFele++;
    IO.println(szamlaloTombMasodikFele+" db");

    szamlaloTombElsoFele=0;
    szamlaloTombMasodikFele=0;
    int i=0;
    while(i<elemek.length/2){
        if(elemek[i]==maxElem) szamlaloTombElsoFele++;
        i++;
    }
    while(i<elemek.length){
        if(elemek[i]==maxElem) szamlaloTombMasodikFele++;
        i++;
    }
    IO.println(String.format("A legnagyobb elem előfordulása a lista első felében: %d db",szamlaloTombElsoFele));
    IO.println(String.format("A legnagyobb elem előfordulása a lista második felében: %d db",szamlaloTombMasodikFele));

    IO.println((szamlaloTombElsoFele>szamlaloTombMasodikFele?"Nem igaz":"Igaz")+" az állítás!");
    /*
    0 db
    A legnagyobb elem előfordulása a lista második felében: 1 db
    Nem igaz az állítás!*/

    String filename="eladasok.txt";
    adatokBeolvasasa(filename);
}

void adatokBeolvasasa(String filename){

    try {
        List<String> input = Files.readAllLines(Path.of(filename));

        for(int i=1;i<input.size();i++){
            IO.println(input.get(i));
        }


    }catch (IOException e){
        IO.println(e.getMessage());
    }

}