import java.util.Optional;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
     shape rect1 = new rectangle();
     Startwork rec = new Startwork(rect1);
     shape cir1 = new circle();

    }
}
interface shape{
    void input();
    static void output(float result){
        System.out.println("Area is equal to"+" "+result);
    };
    void calc();
}

class rectangle implements shape{
    float lenght;
    float breadth;
    float result;
    public void input(){

        Scanner inp = new Scanner(System.in);
        lenght = inp.nextFloat();
        breadth = inp.nextFloat();
    }

    @Override
    public void calc() {
        result =lenght*breadth;
        shape.output(result);
    }

}

class circle implements shape{
    float radius;
    float result;

    public void input(){
        Scanner inp = new Scanner(System.in);
        radius = inp.nextFloat();

    }

    @Override
    public void calc() {
        result =(22/7)*(radius*radius);
        shape.output(result);

    }

}
class Startwork{
   Startwork(shape s1){
   s1.input();
   s1.calc();
   }


}

