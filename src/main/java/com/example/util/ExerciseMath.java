package com.example.util;

public class ExerciseMath {
    public static int factorial(int n){
        if (n <= 0){
            throw new IllegalArgumentException("渡された値が正しくありません");
        }
        int answer = 1;

        for (int i = 1; i <= n ; i++) {
            answer = answer * i;
        }
        return answer;
    }
}
