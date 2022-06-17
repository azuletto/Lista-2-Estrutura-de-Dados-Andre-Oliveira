class Main {
    public static void main(String[] args) {
    Numeros numeros = new Numeros();
    for(int i = 0;i<20;i++){
    System.out.println(numeros.N[i]);
}
    System.out.println("Embaralhando......");

    numeros.shuffle();

    System.out.println("Embaralhando......");

    numeros.shuffle();
    
    for(int i = 0;i<20;i++){
    System.out.println(numeros.N[i]);
        }
    }
}