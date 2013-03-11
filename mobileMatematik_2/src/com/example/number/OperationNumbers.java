package com.example.number;

import com.example.type.LevelType;
import com.example.type.OperationType;

public class OperationNumbers extends Numbers {
    
    public OperationNumbers(IRandomNumberGenerator randonGenerator,OperationType operationType,LevelType levelType) {
        firtstNumber = randonGenerator.generateRandomNumber(levelType);
        secondNumber = randonGenerator.generateRandomNumber(levelType);
        result = firtstNumber+secondNumber;
    }
}
