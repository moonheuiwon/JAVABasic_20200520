package com.example.javabasic_20200520;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.javabasic_20200520.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.d("메인화면","확인버튼 클릭");
//                Log.e("메인화면","에러발생!");
                String inputMessage = binding.contentEdt.getText().toString();
                Log.d("적은내용", inputMessage);
                binding.contentTxt.setText(inputMessage);
            }
        });
    }
}
