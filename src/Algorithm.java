/**
 * @author dk
 * @date 2016/1/13
 */
public class Algorithm {
    public static void main(String[] args) {

        System.out.println(sum1(99));
        System.out.println(sum2(99));
    }

    public static int sum1(int n){
        return n*(n+1)/2;
    }

    public static int sum2(int n){
        int sum = 0;
        for (int i = 1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
