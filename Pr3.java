package Ch7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pr3 {
    public static void main(String[] args) {
        Book[] b = {
                new Book(15000),
                new Book(50000),
                new Book(20000)
        };
        System.out.println("정렬 전");
        for(int i = 0; i<b.length; i++){
            System.out.printf("Book [price = %d]\n", b[i].price);
        }

        for (int k = 1; k < b.length; k++){
            if(b[k-1].compareTo(b[k]) > 0) {
               Book tmp = b[k];
               b[k] = b[k-1];
               b[k-1] = tmp;
            }
        }
        if (b[0].compareTo(b[2]) > 0){
            Book temp = b[2];
            b[2] = b[0];
            b[0] = temp;
        }

        System.out.println("정렬 후");
        for(int i = 0; i<b.length; i++){
            System.out.printf("Book [price = %d]\n",b[i].price);
        }


    }
}
class Book implements Comparable<Book>{
    int price;

    public Book (int pr){
        this.price = pr;
    }

    @Override
    public int compareTo(Book b) {
        return Integer.compare(this.price, b.price);
    }

}
