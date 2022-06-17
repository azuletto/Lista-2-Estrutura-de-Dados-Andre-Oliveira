public class Numeros {
int N[] = new int[20];
int numAux[] = new int[20];


public Numeros() {
    for(int i = 0; i<20;i++){
    N[i] = i;    
        }
    }

public void shuffle() {
int j = 0;

for(int i = 19;i >= 0;i--){
numAux[i]=N[j];
j++;
}

for(int i = 0;i < 20;i++){
N[i] = numAux[i];
        }
    }
}
