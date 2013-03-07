package com.example.number;

public class MinusOperationNumbers extends Numbers {
    
    public MinusOperationNumbers(IRandomNumberGenerator randonGenerator) {
        firtstNumber = randonGenerator.generateRandomNumber();
        secondNumber = randonGenerator.generateRandomNumberLessThanInputParam(firtstNumber);
        result = firtstNumber-secondNumber;
    }
}
