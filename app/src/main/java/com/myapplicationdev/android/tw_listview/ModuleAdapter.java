package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Modules> {

    private ArrayList<Modules> module;
    private Context context;
    private TextView tvModuleCOde;
    private ImageView moduleImg;

    public ModuleAdapter(Context context, int resource, ArrayList<Modules> objects){
        super(context, resource, objects);
        module = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.secondrow, parent, false);

        tvModuleCOde = rowView.findViewById(R.id.tvModuleCode);

        moduleImg = rowView.findViewById(R.id.ivModulePic);

        Modules currentYear = module.get(position);

        tvModuleCOde.setText(currentYear.getCode());

        if(currentYear.getImg().equals("nonprog")) {
            moduleImg.setImageResource(R.drawable.nonprog);
        }
        else {
            moduleImg.setImageResource(R.drawable.prog);
        }

        return rowView;
    }

}
