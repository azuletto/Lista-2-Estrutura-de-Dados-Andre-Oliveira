public class Respostas {
private int resp[] = {1,2,1,2,2,3,1,2,3,1,2,1,2};

public int verificar(Apostador apostador){
int acertos = 0;


for (int i = 0; i < resp.length; i++) {
int num = apostador.getNum(i);
if(num == resp[i]) {
acertos++;
    }
}

return acertos;
    }
}
