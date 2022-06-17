public class Main {
    public static void main(String[] args) {
    Matriz matriz = new Matriz();

    System.out.println("Soma da linha 4: "+matriz.calcLinha4());
    System.out.println("Soma da coluna 2: "+matriz.calcColuna2());
    System.out.println("Soma da diagonal principal: "+matriz.calcDiagPrinc());
    System.out.println("Soma da diagonal secundaria: "+matriz.calcDiagSec());
    System.out.println("Soma da matriz inteira: "+matriz.somaInteira());
    System.out.println("------------------------------------------------------");
    System.out.println("Matriz gerada: ");
    
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
        System.out.println(matriz.getMatriz(i, j));
            } 
        }
    }
}
