
String caesarCoding(String kodolandoSzoveg, int shift){
    String kimenet="";
    for (int i = 0; i < kodolandoSzoveg.length(); i++) {
        char c=kodolandoSzoveg.charAt(i);
        int cInt=(int) c;
        cInt+=shift;
        c=(char)cInt;
        kimenet+=c;
    }
    return kimenet;
}
String caesarCodingRovid(String kodolandoSzoveg, int shift){
    String kimenet="";
    for (int i = 0; i < kodolandoSzoveg.length(); i++)
        kimenet+=(char)((int)kodolandoSzoveg.charAt(i)+shift);
    return kimenet;
}
void main() {

    String bemenetiSzoveg="ALMA";
    int shift=3;
    System.out.println(caesarCoding(bemenetiSzoveg, shift));

    String[] szovegTomb= new String[]{ "Volkswagen", "Zira", "Miklás"};

    for (int i = 0; i < szovegTomb.length; i++) {
        System.out.println(caesarCoding(szovegTomb[i], shift));
        System.out.println(caesarCodingRovid(szovegTomb[i], shift));
    }
}
