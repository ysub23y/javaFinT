package Ch7;

public class Pr2 {

}

interface Edible{
    void eat();
}
interface Sweetable{
    void sweet();
}
interface Delicious extends Edible, Sweetable{

}
