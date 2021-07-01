import java.io.*;
import java.util.*;

class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }

    public static ArrayList<Integer> factorial(int n){
        
        ArrayList<Integer> res = new ArrayList<>();

        res.add(1);
        
        for(int i = 2; i <= n; i++){
            multiply(i, res);
        }

        Collections.reverse(res);
        return res;
    }

    public static void multiply(int x, ArrayList<Integer> res){
        int carry = 0;
        int product = 0;
        
        for(int i = 0; i != res.size(); i++){
            int temp = res.get(i);
            product = res.get(i) * x + carry;
            temp = product % 10;
            res.remove(i);
            res.add(i, temp);
            carry = product / 10;
        }
        while(carry != 0){
            res.add(carry % 10);
            carry /= 10;
        }
    }
}