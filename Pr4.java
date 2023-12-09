package Ch6;

public class Pr4 {

}
class Employee{
    String name;
    String address;
    protected int salary;
    private int rrn;

    public Employee(int rrn){
        this.rrn = rrn;
    }
    int getRrn(){
        return rrn;
    }

    public String toString(){
        return "salary = "+Integer.toString(salary);
    }
}
class Manager extends Employee{
    int Bonus;

    public Manager(){
        super(1000000);
        name = "Tom";
        address = "Wonju";
        salary = 1000000;
        //rn = 123456; << private라 접근이 불가능함.
        //따라서 위와 같이 super로 직접 값을 넣어주는 방법을 사용한다.
    }
    void test(){
        System.out.printf("name = %s", name);
        System.out.printf("address = %s", address);
        System.out.printf("salary = %d", salary);
        System.out.printf("rrn = %d", getRrn());
        //마찬가지로 private라 접근이 불가하니 get메소드를 만들어줌.
    }
}
