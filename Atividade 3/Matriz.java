import java.util.Random;

public class Matriz {
private int matriz[][] = new int [5][5];

public Matriz() {
Random gerador = new Random();
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
    matriz[i][j] = gerador.nextInt(50);
        }
    }
}

public int somaInteira() {
int soma = 0;
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
    soma = soma+matriz[i][j]; 
        }
    }
return soma;
}
public int calcDiagSec() {
int soma = 0;
for (int i = 0; i < 5; i++) {
    for (int j = 4; j >= 0;) {
    soma = soma+matriz[i][j];
    j--;
    break;
    }
}
return soma;
}

public int calcDiagPrinc() {
int soma = 0;
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5;) {
    soma = soma+matriz[i][j];
    j++;
    break;
    }
}
return soma;
}

public int calcColuna2() {
int soma = 0;
for (int i = 0; i < 5; i++) {
    for (int j = 2; j < 5;) {
    soma = soma+matriz[i][j];
    break;
    }
}
return soma;
}

public int calcLinha4() {
int soma = 0;
for (int i = 4; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
    soma = soma+matriz[i][j]; 
    }
}
return soma;
}

public int getMatriz(int i,int j) {
return matriz[i][j];
    }
}
