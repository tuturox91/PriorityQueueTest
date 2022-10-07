import java.time.LocalDate;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        var pq = new PriorityQueue<LocalDate>();
        pq.add(LocalDate.of(1999, 10, 19));
        pq.add(LocalDate.of(2022,10,7));
        pq.add(LocalDate.of(1998,10,21));
        pq.add(LocalDate.of(1932,8,31));
        pq.add(LocalDate.of(1932,9,1));

        for(LocalDate date: pq)
            System.out.println(date);

        System.out.println("Remove items: ");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }

    }
}