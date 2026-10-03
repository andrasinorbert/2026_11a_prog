int osszead(int a, int b){
    return a+b;
}

void main() {

    IO.println("Hello and welcome!");
    System.out.println();
    int i = 1;
    for (;; ) {
        if( i <= 5){
            IO.println("i = " + i);
        }
        else{
            break;
        }
        i++;
    }


    IO.println(String.format("Hello and welcome!"));

    int x=5;
    System.out.println(x);      // 5
    System.out.println(x++);    // 5
    System.out.println(x);      // 6
    System.out.println(++x);    // 7
    System.out.println(x);      // 7
}
