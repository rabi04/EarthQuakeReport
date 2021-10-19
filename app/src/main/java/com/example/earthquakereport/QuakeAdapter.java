package com.example.earthquakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class QuakeAdapter extends ArrayAdapter<QuakeData> {
private int mResource;
    public QuakeAdapter(@NonNull Context context, int resource, @NonNull List<QuakeData> objects) {
        super(context, 0, objects);
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    mResource, parent, false);
        }
        QuakeData data = getItem(position);
        TextView magnitude = listItemView.findViewById(R.id.magnitude);
        magnitude.setText(data.getMagnitude());
        TextView location = listItemView.findViewById(R.id.location);
        location.setText(data.getLocation());
        TextView date = listItemView.findViewById(R.id.date);
        date.setText(data.getDate());
        return listItemView;
    }
}
