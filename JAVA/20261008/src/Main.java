
void main() {

    IO.println("1. feladat:");

    int[] elemek = new int[10];
    Random rnd= new Random();
    // int kilences=0;
    // int nagyobbMint9=0;
    for (int i = 0; i < elemek.length; i++) {
        elemek[i]=rnd.nextInt(10);
        /*
        if( elemek[i]==0)
            kilences++;
        else if (elemek[i]>9)
            nagyobbMint9++;

         */
    }
    //IO.println(kilences+" "+nagyobbMint9);

    IO.print("A lista tartalma: [");
    int i=1;
    IO.print(elemek[0]);
    do{
        IO.print(", ");
        IO.print(elemek[i]);
        i++;
    }while(i<elemek.length);

    IO.println("]");

    int kisebb5=0;
    int nagyobb5=0;
    for (int j = 0; j < elemek.length; j++) {
        if (elemek[j]<5) kisebb5+=elemek[j];
        else if (elemek[j]>5) nagyobb5+=elemek[j];
    }

    IO.println("5-nél kisebb elemek összege: "+kisebb5);
    IO.println("5-nél nagyobb elemek összege: "+nagyobb5);
}
