package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        int x=1;
        for (int i = 1; i <= lastPrinted ; i++) {
            if (x==3){
                x=1;
                continue;
            }
            x++;
            System.out.println(i);


        }

    }

    public static void main(String[] args) {
        SkippingThird st = new SkippingThird();
        st.printUntilButThird(10);
    }
}
