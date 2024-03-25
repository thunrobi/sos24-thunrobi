package fi.arcada.codechallenge;

import static fi.arcada.codechallenge.Statistics.calcMean;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
 TextView outputText;
 EditText inputText;

 double[] values = {1.3,4.6,3.8,9,14.5,8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = findViewById(R.id.outText);
        inputText = findViewById(R.id.inputText);

        outputText.setText("Min App Funkar");
    }





    public void buttonHandler(View view) {

        String userInput = inputText.getText().toString();


        outputText.setText(userInput);


    }
    public void buttonHandler2 (View view) {
        double average = calcMean(values);
        outputText.append("\nMedeltal: " + average);
    }
}