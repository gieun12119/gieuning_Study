package ex;

import java.util.Scanner;

public class ex1 {

  public static void main(String[] args) {
    //사용자로부터 n개의 정수를 입력받은 후 합과
    //최대값을 구하여 출력하는 코드

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int [] data = new int [n]; // 입력 받을 배열변수
    for (int i = 0; i < n; i++)
      data[i] = scanner.nextInt();
      scanner.close();

      int sum = 0;
      int max = data[0];
      for (int i = 0; i < n; i++) {
        sum += data[i];
        //내가 정수가 n개가 있는데 그 합을 어떻게 구하냐
        //그 합을 우선 0개라 해놓고 각각의 정수들을 더해준다
        if(data[i] > max){

          max = data[i];
        }
    }
    System.out.println("the sum is " + sum);
    System.out.println("the max is " + max);

  }
}
