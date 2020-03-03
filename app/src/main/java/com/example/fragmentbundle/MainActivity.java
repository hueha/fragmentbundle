package com.example.fragmentbundle;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final HomeFragment fragment = new HomeFragment();
        findViewById(R.id.btn_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "Lập trình android";
                Bundle bundle = new Bundle();
                bundle.putString("text", str);
                fragment.setArguments(bundle);

                getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fragment).commit();
            }
        });
    }
}
