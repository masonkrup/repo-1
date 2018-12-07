package com.mason.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "hello";
    private static final String TAG = "Demo";
    private Button btnDoStuff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDoStuff = findViewById(R.id.btnDoStuff);
        btnDoStuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDisplayMessageActivity();
            }
        });
        /** Called when the user taps the Send button */
        {
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            EditText editText = findViewById(R.id.editText);
            String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        //set up button
        Button Btn = findViewById(R.id.btnDoStuff);
        //make button do stuff
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Message");
                Toast.makeText(getApplicationContext(), "notification", Toast.LENGTH_SHORT)
                        .show();
            }

        });
    }

    /**
     * Called when the user taps the Send button
     */
    public void sendMessage(View view) {
        // Do something in response to button
        /** Called when the user taps the Send button **/
        {
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            EditText editText = findViewById(R.id.editText);
            String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
    }

    public void openDisplayMessageActivity(){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
    }

}
