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
        // to show  distance and place in two textview instead of one.
        String place = data.getLocation();
        int commaPosition = place.indexOf(",");
        int spacePosition = getSpacePositon(place,commaPosition);
        String distanceFromPlace = getDistanceData(place,spacePosition);
        String placeOfImpact = getPlaceData(place,spacePosition);
        TextView nearMe = listItemView.findViewById(R.id.nearMe);
        nearMe.setText(distanceFromPlace);
        TextView impact = listItemView.findViewById(R.id.placeLocation);
        impact.setText(placeOfImpact);

        TextView date = listItemView.findViewById(R.id.date);
        date.setText(data.getDate());
        TextView time = listItemView.findViewById(R.id.time);
        time.setText(data.getTime());
        return listItemView;
    }

    private int getSpacePositon(String place, int commaPosition) {
        for(int i = commaPosition;i >= 0; i--){
            if(place.charAt(i) == ' ')
                return i;
        }
        return (0);
    }

    private String getPlaceData(String place, int commaPosition) {
        return (place.substring(commaPosition,place.length()));
    }

    private String getDistanceData(String place, int commaPosition) {
        if(place.substring(0,commaPosition).length() == 0)
            return ("Near the"); // if no data is given regarding the distance then it would show near the
        return (place.substring(0,commaPosition));
    }
}
