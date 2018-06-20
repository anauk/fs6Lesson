package codegym;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.PriorityQueue;
import java.util.Scanner;

public class CuboidVolume {
    static Logger log = LoggerFactory.getLogger(CuboidVolume.class);

    private static void printPQ(PriorityQueue<Integer> pq) {
        while (pq.size()>0) {
            Integer poll = pq.poll();
            System.out.print(poll+", ");
        }
    }

    public static void main(String[] args) {
        String s = "24 3 5 5 7 7 3 4 4 9 5 7 1 1 9 9 1 3 5 3 4 4 7 1 9";
        Scanner in = new Scanner(
                s
                //System.in
                );
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2-o1);
        int len=in.nextInt();
        log.info("string length:"+String.valueOf(len));
        for (int i = 0; i < len; i++) {
            int el = in.nextInt();
            log.info("item:"+String.valueOf(el));
            pq.add(el);
        }
        int count = 1;
        int currentEl = pq.poll();
        PriorityQueue<Integer> sides = new PriorityQueue<>(3);
        while (pq.size()>0) {
            log.info("queue size:"+pq.size());
            int nextEl = pq.poll();
            if (currentEl == nextEl) {
                count++;
                if (count == 4) {
                    sides.add(currentEl);
                    if (sides.size() == 3) {
                        break;
                    }
                    count = 0;
                }
            } else {
                count = 1;
                currentEl = nextEl;
            }

        }
        int volume = -1;
        if (sides.size() == 3) {
            volume = sides.poll()*sides.poll()*sides.poll();
        }
        System.out.println(volume);
        //printPQ(pq);
    }
}
