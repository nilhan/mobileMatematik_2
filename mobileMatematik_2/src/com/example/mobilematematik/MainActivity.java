package com.example.mobilematematik;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.number.RandomNumberGenerator;
import com.example.type.LevelType;
import com.example.type.OperationType;
import com.example.type.ProsessType;
import com.example.util.Constants;

public class MainActivity extends Activity {
    
    OperationType operationType;
    LevelType     levelType;
    ProsessType   prosessType;
    RandomNumberGenerator randomNumberGenerator;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomNumberGenerator = new RandomNumberGenerator();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void button_add_clicked(View view) {
        //TODO tus sesi cýkartýp tum on click metodlara koyacagiz.
        operationType = OperationType.ADD;
        
        Button b = (Button) findViewById(R.id.button_add);
        b.setBackgroundColor(Color.RED);
        b = (Button) findViewById(R.id.button_substract);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_multiply);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_divide);
        b.setBackgroundColor(Color.LTGRAY);
    }
    
    public void button_subtract_clicked(View view) {
        operationType = OperationType.SUBTRACT;
        
        Button b = (Button) findViewById(R.id.button_substract);
        b.setBackgroundColor(Color.RED);
        b = (Button) findViewById(R.id.button_add);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_multiply);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_divide);
        b.setBackgroundColor(Color.LTGRAY);
    }
    
    public void button_multiply_clicked(View view) {
        operationType = OperationType.MULTIPLY;
        
        Button b = (Button) findViewById(R.id.button_multiply);
        b.setBackgroundColor(Color.RED);
        b = (Button) findViewById(R.id.button_add);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_substract);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_divide);
        b.setBackgroundColor(Color.LTGRAY);
    }
    
    public void button_divide_clicked(View view) {
        operationType = OperationType.DIVIDE;
        
        Button b = (Button) findViewById(R.id.button_divide);
        b.setBackgroundColor(Color.RED);
        b = (Button) findViewById(R.id.button_add);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_substract);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_multiply);
        b.setBackgroundColor(Color.LTGRAY);
    }
    
    public void button_veryEasy_clicked(View view) {
        levelType = LevelType.VERY_EASY;
        Button b = (Button) findViewById(R.id.button_veryEasy);
        b.setBackgroundColor(Color.RED);
        b = (Button) findViewById(R.id.button_easy);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_medium);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_some_hard);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_very_hard);
        b.setBackgroundColor(Color.LTGRAY);
    }
    
    public void button_easy_clicked(View view) {
        levelType = LevelType.EASY;
        Button b = (Button) findViewById(R.id.button_easy);
        b.setBackgroundColor(Color.RED);
        b = (Button) findViewById(R.id.button_veryEasy);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_medium);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_some_hard);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_very_hard);
        b.setBackgroundColor(Color.LTGRAY);
    }
    
    public void button_medium_clicked(View view) {
        levelType = LevelType.MEDIUM;
        Button b = (Button) findViewById(R.id.button_medium);
        b.setBackgroundColor(Color.RED);
        b = (Button) findViewById(R.id.button_veryEasy);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_easy);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_some_hard);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_very_hard);
        b.setBackgroundColor(Color.LTGRAY);
    }
    
    public void button_someHard_clicked(View view) {
        levelType = LevelType.SOME_HARD;
        Button b = (Button) findViewById(R.id.button_some_hard);
        b.setBackgroundColor(Color.RED);
        b = (Button) findViewById(R.id.button_veryEasy);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_easy);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_medium);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_very_hard);
        b.setBackgroundColor(Color.LTGRAY);
    }
    
    public void button_veryHard_clicked(View view) {
        levelType = LevelType.VERY_HARD;
        Button b = (Button) findViewById(R.id.button_very_hard);
        b.setBackgroundColor(Color.RED);
        b = (Button) findViewById(R.id.button_veryEasy);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_easy);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_medium);
        b.setBackgroundColor(Color.LTGRAY);
        b = (Button) findViewById(R.id.button_some_hard);
        b.setBackgroundColor(Color.LTGRAY);
    }
    
    public void button_sideBySide_clicked(View view) {
        prosessType = ProsessType.SIDE_BY_SIDE;
        Button b = (Button) findViewById(R.id.button_sideBySide);
        b.setBackgroundColor(Color.RED);
        b = (Button) findViewById(R.id.button_topButtom);
        b.setBackgroundColor(Color.LTGRAY);
    }
    
    public void button_topButtom_clicked(View view) {
        prosessType = ProsessType.TOP_BUTTOM;
        Button b = (Button) findViewById(R.id.button_topButtom);
        b.setBackgroundColor(Color.RED);
        b = (Button) findViewById(R.id.button_sideBySide);
        b.setBackgroundColor(Color.LTGRAY);
    }
    
    public void button_startPlaying_clicked(View view) {
        Intent intent = new Intent(this, BlackboardActivity.class);
        intent.putExtra(Constants.OPERATION_TYPE, operationType);
        intent.putExtra(Constants.LEVEL_TYPE, levelType);
        intent.putExtra(Constants.PROSESS_TYPE, prosessType);
        intent.putExtra(Constants.RANDOM_NUMBER_GENERATOR, randomNumberGenerator);
        startActivity(intent);
        
    }
    
}
