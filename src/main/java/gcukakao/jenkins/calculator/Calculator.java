package gcukakao.jenkins.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public String helloName(String name) {
        return "Hello, " + name;
    }
}
// 젠킨스 테스트
// 젠킨스 테스트2
// 젠킨스 테스트3
// 젠킨스 테스트4