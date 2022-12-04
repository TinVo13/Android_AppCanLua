package com.example.appcanlua;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GridviewAdapter extends BaseAdapter {
    Context context;
    ArrayList<Item> list;

    public GridviewAdapter(Context context, ArrayList<Item> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridview_item,parent,false);
        TextView tv1 = convertView.findViewById(R.id.tv1);
        TextView tv2 = convertView.findViewById(R.id.tv2);
        TextView tv3 = convertView.findViewById(R.id.tv3);
        TextView tv4 = convertView.findViewById(R.id.tv4);
        TextView tv5 = convertView.findViewById(R.id.tv5);
        TextView kq = convertView.findViewById(R.id.kq);
        tv1.setText(String.valueOf(list.get(position).getA1()));
        tv2.setText(String.valueOf(list.get(position).getA2()));
        tv3.setText(String.valueOf(list.get(position).getA3()));
        tv4.setText(String.valueOf(list.get(position).getA4()));
        tv5.setText(String.valueOf(list.get(position).getA5()));
        Double tong = Double.valueOf(0);
        tong = tong+list.get(position).getA1()+list.get(position).getA2()+list.get(position).getA3()+
                list.get(position).getA4()+list.get(position).getA5();
        kq.setText(tong.toString());
        return convertView;
    }
}
