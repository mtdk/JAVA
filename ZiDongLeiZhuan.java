public class ZiDongLeiZhuan {
    public static void main(String[] args) {
        char c1 = 'a';
        int i1 = c1;
        System.out.println("char自动类型转换为int后的值等于" + i1);
        char c2 = 'A';
        int i2 = c2 + 1;
        System.out.println("char类型和int计算后的值等于" + i2);

        int i3 = 123;
        byte b = (byte) i3;
        System.out.println("int强制类型转换为byte后的值等于" + b);
    }
}
