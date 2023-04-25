public class Main {
    public static void main(String[] args) {
        SmallestInfiniteSet set = new SmallestInfiniteSet();
        System.out.println(set.popSmallest()); // 1
        System.out.println(set.popSmallest()); // 2
        System.out.println(set.popSmallest()); // 3
        set.addBack(1);
        System.out.println(set.popSmallest()); // 1
        System.out.println(set.popSmallest()); // 4
        System.out.println(set.popSmallest()); // 5
    }
}
