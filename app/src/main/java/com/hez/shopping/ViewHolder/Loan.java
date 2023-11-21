package com.hez.shopping.ViewHolder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.hez.shopping.R;

public class Loan extends AppCompatActivity {

    private EditText fullNameEditText,dobEditText, contactEditText,jobEditText,amountEditText,
            expensesEditText,incomeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);


    }
}