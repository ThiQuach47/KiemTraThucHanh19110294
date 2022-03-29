package com.example.thuchanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KetQua extends AppCompatActivity {
    TextView tongTienTextView;
    TextView tienLaiTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);

        tongTienTextView = (TextView) findViewById(R.id.tongTienTextView);
        tienLaiTextView = (TextView) findViewById(R.id.tienLaiTextView);

        Intent intent = getIntent();
        String tienLai = intent.getStringExtra("tienLai");
        String tongTien = intent.getStringExtra("tongTien");

        tongTienTextView.setText(tongTien);
        tienLaiTextView.setText(tienLai);
    }

    public void cameraClick(View view) {
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(cameraIntent);
    }

    public void backClick(View view) {
        onDestroy();
    }
}