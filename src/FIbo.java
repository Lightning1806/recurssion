public class FIbo {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    static int fibo(int n){
        if (n<2){
            return n;
        }
        return fibo(n-1)+(n-2);

    }
}
