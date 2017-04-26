package com.example.yueding.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by yueding on 2017/4/24.
 * Class AnimalAdapter
 */

public class AnimalAdapter extends BaseAdapter {

    private LinkedList<Animal> mData;
    private Context mContext;

    public AnimalAdapter(LinkedList<Animal> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.list_item,parent,false);
            holder = new ViewHolder();
            holder.img_icon = (ImageView) convertView.findViewById(R.id.headimage);
            holder.txt_aName = (TextView) convertView.findViewById(R.id.name);
            holder.txt_aSpeak = (TextView) convertView.findViewById(R.id.speak);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.img_icon.setImageResource(mData.get(position).getaIcon());
        holder.txt_aName.setText(mData.get(position).getaName());
        holder.txt_aSpeak.setText(mData.get(position).getaSpeak());
        return convertView;
    }

    static class ViewHolder {
        private ImageView img_icon;
        private TextView txt_aName;
        private TextView txt_aSpeak;
    }
}
