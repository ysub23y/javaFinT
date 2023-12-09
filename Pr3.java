package Ch6;

public class Pr3 { //메소드 오버라이딩 예제
    public static void main(String[] args) {
        BadBank b = new BadBank();
        b.getInterestRate();
        NomalBank n = new NomalBank();
        n.getInterestRate();
        GoodBank g = new GoodBank();
        g.getInterestRate();

    }
}

class Bank{
    double interestRate;
    double getInterestRate(){
        return interestRate;
    }
}
class BadBank extends Bank{
    double ir = 10.0;

    @Override
    double getInterestRate() {
        System.out.printf("BadBank의 이자율: %.1f\n", ir);
        return ir;
    }
}
class NomalBank extends Bank{
    double ir = 5.0;

    @Override
    double getInterestRate() {
        System.out.printf("NormalBank의 이자율: %.1f\n", ir);
        return ir;
    }
}
class GoodBank extends Bank{
    double ir = 3.0;

    @Override
    double getInterestRate() {
        System.out.printf("GooddBank의 이자율: %.1f\n", ir);
        return ir;
    }
}