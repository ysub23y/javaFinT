package Ch7;

public class Pr4 {
    static void speak(Talkable t){
        t.talk();
    }

    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }
}
interface Talkable {
    void talk();
}
class Korean implements Talkable{
    public void talk(){
        System.out.println("안녕하세요!");
    }

}
class American implements Talkable{
    public void talk(){
        System.out.println("Hello!");
    }

}