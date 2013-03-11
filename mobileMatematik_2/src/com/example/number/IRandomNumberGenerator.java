package com.example.number;

import com.example.type.LevelType;

public interface IRandomNumberGenerator {
    int generateRandomNumber(LevelType leveltype);
    int generateRandomNumberLessThanInputParam(int numbeber);
    
}
