package com.example.murali.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onDollars(View view)
    {
        EditText rupeesAmountEditText=(EditText)findViewById(R.id.rupeesAmountEditText);
        Double rupeesAmountDouble=Double.parseDouble(rupeesAmountEditText.getText().toString());
       Double dollarAmount=rupeesAmountDouble*0.014;
        Toast.makeText(MainActivity.this ,"$"+String.format("%.3f",dollarAmount), Toast.LENGTH_LONG).show();
        Log.i("Amount",rupeesAmountEditText.getText().toString());

    }
    public void onEuro(View view)
    {
        EditText rupeesAmountEditText=(EditText)findViewById(R.id.rupeesAmountEditText);
        Double rupeesAmountDouble=Double.parseDouble(rupeesAmountEditText.getText().toString());
        Double dollarAmount=rupeesAmountDouble*0.012;
        Toast.makeText(MainActivity.this ,"ē"+String.format("%.3f",dollarAmount), Toast.LENGTH_LONG).show();
        Log.i("Amount",rupeesAmountEditText.getText().toString());

    }
    public void onPounds(View view)
    {
        EditText rupeesAmountEditText=(EditText)findViewById(R.id.rupeesAmountEditText);
        Double rupeesAmountDouble=Double.parseDouble(rupeesAmountEditText.getText().toString());
        Double dollarAmount=rupeesAmountDouble*0.011;
        Toast.makeText(MainActivity.this ,"ā"+String.format("%.3f",dollarAmount), Toast.LENGTH_LONG).show();
        Log.i("Amount",rupeesAmountEditText.getText().toString());

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
