package src;

public class MultiplicationTable {
    void print() {
        print(6);
    }

    void print(int x) {
        print(x, 1, 10);
    }

    void print(int table, int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.printf("%d * %d = %d", table, i, table * i).println();
        }
    }
}
