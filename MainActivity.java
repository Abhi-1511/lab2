package com.example.calculator;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText e1;
    EditText e2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editTextTextPersonName);
        e2=findViewById(R.id.editTextTextPersonName2);
        Button b1=findViewById(R.id.button);
        Button b2=findViewById(R.id.button2);
        Button b3=findViewById(R.id.button3);
        Button b4=findViewById(R.id.button4);
        t1=findViewById(R.id.textView);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }
    public void onClick(View v){
        float n1, n2, res = 0;
        String oper = " ";
        n1 = Float.parseFloat(e1.getText().toString());
        n2 = Float.parseFloat(e2.getText().toString());
        if (v.getId() == R.id.button) {
            res = n1 + n2;
            oper = "+";
        } else if (v.getId() == R.id.button2) {
            res = n1 - n2;
            oper = "+";
        } else if (v.getId() == R.id.button3) {
            res = n1 * n2;
            oper = "*";
        } else if (v.getId() == R.id.button4) {
            res = n1 / n2;
            oper = "/";
        }
        t1.setText(n1 + oper + n2 + "=" + res);
    }
}
