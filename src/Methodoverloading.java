public class Methodoverloading {
    public static void main(String[] arg){
        Methodoverloadingoprqation op = new Methodoverloadingoprqation();


        System.out.println(op.multiplication(10));
        System.out.println(op.multiplication(10,5));
    }
}
class  Methodoverloadingoprqation{
    public int multiplication(int i){
        return i*i;
    }
    public int multiplication(int i,int j){
        return i*j;
    }
    public int multiplication(int i,int j,int k){
        return i*j*k;
    }
}