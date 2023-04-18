import java.util.Arrays;

public class BitMatrix {
    private final int[] data;

    public BitMatrix(int size) {
        int numInts = (size + 31) / 32;
        data = new int[numInts];
    }

    public void set(int index) {
        int i = index / 32;
        int offset = index % 32;
        data[i] |= (1 << offset);
    }

    public boolean get(int index) {
        int i = index / 32;
        int offset = index % 32;
        return (data[i] & (1 << offset)) != 0;
    }

    public void clear() {
        Arrays.fill(data, 0);
    }
}
