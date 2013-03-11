package com.example.mobilematematik;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.number.OperationNumbers;
import com.example.number.RandomNumberGenerator;
import com.example.type.LevelType;
import com.example.type.OperationType;
import com.example.util.Constants;

public class BlackboardActivity extends Activity {
    RandomNumberGenerator randomNumberGenerator;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackboard);
        Random random = new Random();
        int firstNumber = random.nextInt(15);
        
        Intent intent = getIntent();
        OperationType operationType = (OperationType)intent.getExtras().get(Constants.OPERATION_TYPE);
        setOPerationTypePicture(intent,operationType);
        
    }
    private void generateArbitraryNumbers(Intent intent,OperationType operationType){
        LevelType levelType = (LevelType)intent.getExtras().get(Constants.LEVEL_TYPE);
        OperationNumbers numbers = new OperationNumbers(randonGenerator, operationType, levelType)
        
    }
    
    private void setOPerationTypePicture(Intent intent, OperationType operationType) {
        //set the operation icon
        ImageView imageView =  (ImageView)findViewById(R.id.imageViewOperation);
        switch (operationType) {
            case ADD:
                imageView.setImageResource(R.drawable.ic_sum);
                break;
            case SUBTRACT:
                imageView.setImageResource(R.drawable.ic_minus);
                break;
            case MULTIPLY:
                imageView.setImageResource(R.drawable.ic_multiply);
                break;
            case DIVIDE:
                imageView.setImageResource(R.drawable.ic_divide);
                break;
            default:
                break;
        }
    }
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_blackboard, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // This ID represents the Home or Up button. In the case of this
                // activity, the Up button is shown. Use NavUtils to allow users
                // to navigate up one level in the application structure. For
                // more details, see the Navigation pattern on Android Design:
                //
                // http://developer.android.com/design/patterns/navigation.html#up-vs-back
                //
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
}
