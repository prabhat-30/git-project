public class ShiftOperatorDemo {
    // Helper method to print integer in 32-bit binary format
    public static String toBinary(int number) {
        return String.format(Integer.toBinaryString(number)).replace(' ', '0');
    }

    public static void main(String[] args) {
        int a = -5;
        int b = -8;

        System.out.println("====== Left Shift (<<) ======");
        System.out.println("a = " + a + " => " + toBinary(a));
        int leftShift = a << 1;
        System.out.println("a << 1 = " + leftShift + " => " + toBinary(leftShift));

        System.out.println("\n====== Right Shift (>>) with negative ======");
        System.out.println("b = " + b + " => " + toBinary(b));
        int rightShift = b >> 2;
        System.out.println("b >> 2 = " + rightShift + " => " + toBinary(rightShift));

        System.out.println("\n====== Unsigned Right Shift (>>>) ======");
        int unsignedRightShift = b >>> 2;
        System.out.println("b >>> 2 = " + unsignedRightShift + " => " + toBinary(unsignedRightShift));
    }
}
