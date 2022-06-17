import java.util.Scanner;

class Main {


public static void main(String[] args) {
int controle = 0;
Scanner teclado = new Scanner(System.in);
Respostas respostas = new Respostas();
Apostador apostadores[] = new Apostador[10];


for (int l = 0;l<10;l++) {

apostadores[l] = new Apostador();

System.out.println("Digite o cartao do apostador "+(l+1)+": ");
int code = teclado.nextInt();
apostadores[l].setCode(code);




///// registro dos numeros do apostador atual

System.out.println("---------------GABARITO---------------");


for (int i = 0; i < 13; i++) {
System.out.println("Digite sua aposta :      "+"("+(i+1)+"/13)");

int num = teclado.nextInt();
if(num < 1 | num > 3){
for (int j = 0; j > -1; j++) {
    System.out.println("Por favor, digite um numero valido");

    System.out.println("Digite sua aposta :      "+"("+(i+1)+"/13)");
    
    num = teclado.nextInt();
    if(num == 1 | num == 2 | num == 3)
    break;  
    }
}
apostadores[l].setNum(i,num);
}


System.out.println("VERIFICACAO.......");
for (int i = 0; i < 13; i++) {
System.out.println(apostadores[l].getNum(i));
            }
controle++;
System.out.println("Deseja cadastrar os resultados de outro apostador? (0->Y/1->N)");
int ver = teclado.nextInt();
if(ver == 1){
break;
}
if(ver == 0){
System.out.println("Continuando....");
}
        }
////// verificação de todas as apostas

for (int i = 0; i < controle; i++) {
System.out.println("Apostador "+(apostadores[i].getCode())+": "+respostas.verificar(apostadores[i])+" acertos.");
if(respostas.verificar(apostadores[i])==13){
System.out.println("GANHADOR, PARABENS!!!");
            }
        }
    }
}
    
