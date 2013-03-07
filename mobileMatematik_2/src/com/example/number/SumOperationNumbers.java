package com.example.number;

public class SumOperationNumbers extends Numbers {
    
    public SumOperationNumbers(IRandomNumberGenerator randonGenerator) {
        firtstNumber = randonGenerator.generateRandomNumber();
        secondNumber = randonGenerator.generateRandomNumber();
        result = firtstNumber+secondNumber;
    }
}
