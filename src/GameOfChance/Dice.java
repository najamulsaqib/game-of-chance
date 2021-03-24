package GameOfChance;
import java.util.Random;
public class Dice {
    Random ran = new Random();
    int a1, b1;
    int random1(){
    int a=1+ran.nextInt(6);
    return a;
    }
    int random2(){
        int b=1+ran.nextInt(6);
        return b;
    }
    int sum(int a1, int b1){
        this.a1 = a1;
        this.b1 = b1;
        return a1+b1;
    }
}
