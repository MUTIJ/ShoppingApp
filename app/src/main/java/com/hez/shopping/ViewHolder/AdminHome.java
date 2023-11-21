package com.hez.shopping.ViewHolder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.hez.shopping.AdminAddNewProductActivity;
import com.hez.shopping.AdminCategoryActivity;
import com.hez.shopping.AdminNewOrdersActivity;
import com.hez.shopping.HomeActivity;
import com.hez.shopping.MainActivity;
import com.hez.shopping.R;

public class AdminHome extends AppCompatActivity {


    private RelativeLayout newproduct, viewproduct, viewfeedback,vieworder, loanrequest, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        newproduct = findViewById(R.id.new_product_layout1);
        viewproduct = findViewById(R.id.view_all_products);
        viewfeedback = findViewById(R.id.view_all_feedback);
        vieworder = findViewById(R.id.view_customer_order);
        loanrequest = findViewById(R.id.view_loan_layout);
        logout = findViewById(R.id.logout_btn);

        newproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHome.this, AdminCategoryActivity.class);
                startActivity(intent);
            }
        });

        vieworder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHome.this, AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });

        viewproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminHome.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminHome.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();

            }
        });

    }
}