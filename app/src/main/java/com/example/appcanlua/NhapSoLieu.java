package com.example.appcanlua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.appcanlua.databinding.ActivityNhapSoLieuBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class NhapSoLieu extends AppCompatActivity {

    ActivityNhapSoLieuBinding binding;
    private ArrayList<Item> list = new ArrayList<>();
    private List<Double> listnumber = new ArrayList<>();
    private Double tongtien = 0d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNhapSoLieuBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.btnNhap.setOnClickListener(v->{
            if(binding.etNhap.getText().toString().isEmpty()){
                Snackbar.make(view,"Vui long nhap vao o trong",Snackbar.LENGTH_SHORT).show();
                return;
            }else{
            Item item = new Item();

            Double number = Double.parseDouble(binding.etNhap.getText().toString());
            tongtien = tongtien+number;
            Toast.makeText(this, ""+tongtien, Toast.LENGTH_SHORT).show();
            listnumber.add(number);
           // Toast.makeText(this, ""+listnumber, Toast.LENGTH_SHORT).show();
            if(listnumber.size()%5==0){
                item.setA1(listnumber.get(0));
                item.setA2(listnumber.get(1));
                item.setA3(listnumber.get(2));
                item.setA4(listnumber.get(3));
                item.setA5(listnumber.get(4));
                list.add(item);
                GridviewAdapter adapter = new GridviewAdapter(this,list);
                binding.gridview.setAdapter(adapter);
                listnumber = new ArrayList<>();}
//            Toast.makeText(this, ""+list.toString(), Toast.LENGTH_SHORT).show();
            binding.etNhap.setText("");
            }
        });
    }
}