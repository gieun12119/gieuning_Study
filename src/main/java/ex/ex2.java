package ex;

import java.util.Scanner;

public class ex2 {

  public static void main(String[] args) {

//    n개의 정수를 입력받아 순서대로 배열에 저장한다. 그런 다음 다음 모든 정수들을 한 칸씩 오른쪽으로 shift하라.
//
//        **마지막 정수는 배열의 첫 칸으로 이동.**

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int [] data = new int[n];

    for (int i = 0; i < n; i++) {
      data[i] = sc.nextInt();
    }

    int tmp = data[n - 1]; // 마지막값 tmp에 저장. 그 다음 역순으로 데이터 저장

    for (int i = n - 2; i >= 0; i--) {
      data[i + 1] = data[i];
    }
    data[0] = tmp;

    for (int i = 0; i < n; i++) {
      System.out.println(data[i]);
    }
  }
  }
