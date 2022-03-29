package com.example.thuchanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tienGuiEditText;
    EditText laiSuatEditText;
    EditText kiHanEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tienGuiEditText = (EditText) findViewById(R.id.tienGuiEditView);
        laiSuatEditText = (EditText) findViewById(R.id.laiGuiEditView);
        kiHanEditText = (EditText) findViewById(R.id.kyHanGuiEditText);
    }

    public void xemKetQuaClick(View view) {

        double soTienGui = Double.parseDouble(tienGuiEditText.getText().toString());
        double laiSuatGui = Double.parseDouble(laiSuatEditText.getText().toString());
        double kiHanGui = Double.parseDouble(kiHanEditText.getText().toString());

        double soTienLai = soTienGui * laiSuatGui * kiHanGui /12;
        soTienLai /=100;

        Intent intent = new Intent(this, KetQua.class);


        intent.putExtra("tienLai", Double.toString(soTienLai) );
        intent.putExtra("tongTien", Double.toString(soTienGui + soTienLai ));

        startActivity(intent);


    }

}


