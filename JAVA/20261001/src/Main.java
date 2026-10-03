int osszegzes(int[] inputSzamok){
    int s=0;
    for (int i = 0; i < inputSzamok.length; i++) {
        s += inputSzamok[i];
    }
    return s;
}
int megszamlalas(int[] inputSzamok){
    int c=0;
    for (int i = 0; i < inputSzamok.length; i++) {
        if (inputSzamok[i] % 2==0){
            c++;
        }
    }
    return c;
}
int[] maxKivalasztas(int[] inputSzamok){
    int index=0;
    int maxelem=inputSzamok[0];
    for (int i = 1; i < inputSzamok.length; i++) {
        if(inputSzamok[i]> maxelem){
            index=i;
            maxelem=inputSzamok[i];
        }
    }
    return new int[]{index, maxelem};
}
int kivalasztas(int[] inputSzamok){
    int index=0;
    while(inputSzamok[index]%3==0){
        index++;
    }
    return index;
}
boolean eldontes(int[] inputSzamok){
    int index=0;
    while(index<inputSzamok.length && inputSzamok[index]%3==0){
        index++;
    }
    if(index<inputSzamok.length) {
        return true;
    }
    else {
        return false;
    }
}
int kereses(){
    return 0;
}

void main() {
    int[] szamok={2,4,8,5,3};
    System.out.println(osszegzes(szamok));
    System.out.println(megszamlalas(szamok));
    System.out.println(maxKivalasztas(szamok)[1]);
}
