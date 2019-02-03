import nz.sodium.Cell;
import nz.sodium.Stream;
import nz.sodium.StreamSink;

import java.util.HashMap;
import java.util.Map;

public class CellTest {
        public static void main(String[] args) {
                StreamSink<Integer> s = new StreamSink<>();
                s.send(1);
                s.listen(x -> System.out.println(x));
                s.send(2);
                Cell<Stream<Integer>> c = new Cell<>(s);
                c.map(x -> {
                        System.out.println("x");
                        return x;
                });
                s.send(3);
        }
}
