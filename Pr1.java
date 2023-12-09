package Ch7;

public class Pr1 {
    public static void main(String[] args) {
        Concrete c = new Concrete(100, 50);
        c.show();
    }
}
abstract class Abstract{
    int i;
    abstract void show();
    public Abstract (int i){
        this.i = i;
    }
}
 class Concrete extends Abstract{
    int j;
    public Concrete (int i, int j){
        super(i);
        this.j = j;
    }
    @Override
    void show(){
        System.out.printf("i = %d, j = %d", i, j);
    }
}
