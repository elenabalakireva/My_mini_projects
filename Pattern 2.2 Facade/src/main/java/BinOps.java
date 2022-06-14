public class BinOps {
    public String sum(String a, String b) {
        int i = Integer.parseInt(a);
        int j = Integer.parseInt(b);
        int summa = i + j;
        return Integer.toBinaryString(summa);
    }

    public String mult(String a, String b) {
        int i = Integer.parseInt(a);
        int j = Integer.parseInt(b);
        int summa = i * j;
        return Integer.toBinaryString(summa);
    }
}
