public class Main {
    public static void main(String[] args) {
        testPartA();

    }

    private static void testPartA() {
        System.out.println("--------------- Tests for part A ---------------");
        Clock c1 = new Clock(10, 30);
        Object o1 = c1;
        AccurateClock ac1 = new AccurateClock(10, 30, 20);
        Clock c2 = ac1;
        Object o2 = c2;
        System.out.println("c1 with o1: " + c1.equals(o1));
        System.out.println("o1 with c1: " + o1.equals(c1));

        System.out.println("c1 with ac1: " + c1.equals(ac1));
        System.out.println("ac1 with c1: " + ac1.equals(c1));
        System.out.println("c1 with c2: " + c1.equals(c2));
        System.out.println("c2 with c1: " + c2.equals(c1));
        System.out.println("c1 with o2: " + c1.equals(o2));
        System.out.println("o2 with c1: " + o2.equals(c1));

        System.out.println("ac1 with c2: " + ac1.equals(c2));
        System.out.println("c2 with ac1: " + c2.equals(ac1));
        System.out.println("ac1 with o2: " + ac1.equals(o2));
        System.out.println("o2 with ac1: " + o2.equals(ac1));
        System.out.println("c2 with o2: " + c2.equals(o2));
        System.out.println("o2 with c2: " + o2.equals(c2));
        System.out.println("c1 with null: " + c1.equals(null));
        System.out.println("o1 with null: " + o1.equals(null));
        System.out.println("ac1 with null: " + ac1.equals(null));

        System.out.println("c1: " + c1);
        System.out.println("o1: " + o1);
        System.out.println("ac1: " + ac1);
        System.out.println("c2: " + c2);
        System.out.println("o2: " + o2);
        System.out.println("new: " + new AccurateClock(5, 6, 3));
    }

}