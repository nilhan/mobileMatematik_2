package com.example.number;

import java.io.Serializable;
import java.util.Random;

import com.example.type.LevelType;

public class RandomNumberGenerator implements IRandomNumberGenerator, Serializable{

    Random random = new Random();

    @Override
    public int generateRandomNumberLessThanInputParam(int numbeber) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int generateRandomNumber(LevelType leveltype) {
        // TODO Auto-generated method stub
        return random.nextInt(200);
    }
    
}
