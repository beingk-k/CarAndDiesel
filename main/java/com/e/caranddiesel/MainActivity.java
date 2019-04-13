package com.e.caranddiesel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etMake, etYear, etColor, etCarPrice, etEngineSize;
    private Button btnCreateCar, btnCreateDiesel;
    private TextView tvOutput;
    private int a=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMake = findViewById(R.id.etMake);
        etYear = findViewById(R.id.etYear);
        etColor = findViewById(R.id.etColor);
        etCarPrice = findViewById(R.id.etCarPrice);
        etEngineSize = findViewById(R.id.etEngineSize);
        btnCreateCar = findViewById(R.id.btnCreateCar);
        btnCreateDiesel = findViewById(R.id.btnCreateDiesel);
        tvOutput = findViewById(R.id.tvOutput);

        btnCreateCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId()==R.id.btnCreateCar){
                    tvOutput.setText(tvOutput.getText().toString() + "\n This is Vehicle No: " + (a++) + "\n" + new CarAndDiesel(etMake.getText().toString(),
                            etYear.getText().toString(), etColor.getText().toString(), etCarPrice.getText().toString(), etEngineSize.getText().toString()).result()+ "\n");
                }
            }
        });
    }
}
