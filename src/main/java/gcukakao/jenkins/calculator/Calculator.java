package gcukakao.jenkins.calculator; // [cite: 8]

import org.springframework.stereotype.Service; // [cite: 9]

@Service // [cite: 10]
public class Calculator {
    public int sum(int a, int b) { // [cite: 12]
        return a + b; // [cite: 14]
    }

    public int sub(int a, int b) { // [cite: 15]
        return a - b; // [cite: 17-18]
    }

    public int mul(int a, int b) { // [cite: 19]
        return a * b; // [cite: 21-23]
    }

    public int div(int a, int b) { // [cite: 24]
        return a / b; // [cite: 27]
    }

    // --- ⬇️ 과제에서 추가할 코드 ⬇️ ---
    /**
     * 이름을 입력받아 인사말을 반환합니다.
     */
    public String helloName(String name) {
        return "Hello, " + name;
    }
    // --- ⬆️ 과제에서 추가할 코드 ⬆️ ---
}