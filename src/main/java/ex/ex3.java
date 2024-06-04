package ex;

public class ex3 {

  public static void main(String[] args) {
    int n = 101111;
    //하나의 주어진 정수가 소수인지 판단하기 위해서
    //굉장히 중요한 문제..
    // n이 소수인지 알고 싶으면 2에서부터 n - 1 사이의 정수로 n을 나눠봐서 하나라도 나누어 떨어지는 약수가 있으면
    // 그건 소수가 아니다
    // n / 2

    boolean isPrime = true;

    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) { // 나머지를 구하는 연산은 n이 소수가 아니라는 증거
        // 아무것도 나누어 떨어지지 않으면 소수
        // not prime
          isPrime = false;
      }

      if(isPrime) {
        System.out.println(n);
      }
      // n이라는 정수가 소수인지 아닌지 검사..
    }
  }


}
