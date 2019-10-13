# SWExpertAcademy_D3_Java_8016

## SW Expert Academy D3 8016. 홀수 피라미드

### 1. 문제설명

출처: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWvzGUKKPVwDFASy&categoryId=AWvzGUKKPVwDFASy&categoryType=CODE

input으로 `N`이 들어온다. 이때 `N`은 삼각형모양의 숫자의 `N`번째 줄을 의미하며 `N`번째 줄의 가장 왼쪽과 오른쪽의 숫자를 출력하는문제이다. 삼각형 모양은 아래와 같다.

            1

          3 5 7

      9 11 13 15 17

    19 21 23 25 27 29 31
    

[입력]
> 첫 번째 줄에 테스트 케이스의 수 `T`가 주어진다.
> 각 테스트 케이스의 첫 번째 줄에는 층의 번호 `N(1≤N≤10^9)`이 주어진다.

[출력]
> 각 테스트 케이스마다 `#x`(`x`는 테스트케이스 번호를 의미하며 `1`부터 시작한다)를 출력하고,
> 각 테스트 케이스마다 `N`층의 제일 왼쪽, 오른쪽에 쓰게 될 숫자를 공백으로 구별하여 출력한다.

### 풀이

`N`에 따른 가장 왼쪽과 오른쪽의 값을 따라 점화식을 만들고 `N`에 따라 계산하여 값을 출력하도록 했다. 한가지 문제점으로는 `N`이 `1000000000`까지 들어온다면 제곱을 통해 출력값이 계산될 떄 `int`범위를 넘어서게 된다는 것이다. 그렇기 때문에 `BigInteger`클래스를 이용하여 연산을 하고 결과를 출력해주었다.


```java

int N = Integer.parseInt(sc.nextLine());
BigInteger left = new BigInteger(String.valueOf(N-1));
left = left.multiply(left).multiply(BigInteger.valueOf(2)).add(BigInteger.ONE);

BigInteger right = new BigInteger(String.valueOf(N));
right = right.multiply(right).multiply(BigInteger.valueOf(2)).subtract(BigInteger.ONE);

System.out.println("#"+test_case+" "+left+" "+right);

```
