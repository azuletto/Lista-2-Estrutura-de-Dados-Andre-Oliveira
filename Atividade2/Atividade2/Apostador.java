class Apostador {
private int num[] = new int[13];
private int code;

public Apostador() {
for (int i = 0; i < num.length; i++) {
num[i] = 0;
        }
    }

public void setCode(int code) {
this.code = code;
    }

public int getCode(){
return this.code;
    }

public void setNum(int i,int num) {
this.num[i] = num;
    }

public int getNum(int i){
return this.num[i];
    }
}