package com.example.android.sunshine;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by nestorkokoafantchao on 2/8/17.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private ArrayList<String> mWeatherData = new ArrayList<>();

    public ForecastAdapter(ArrayList<String> listData) {
        this.mWeatherData = mWeatherData;
    }

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rootView = inflater.inflate(R.layout.forecast_list_item, parent, false);


        return  new ForecastAdapterViewHolder(rootView) ;
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {

        holder.mWeatherTextView.setText( mWeatherData.get(position));

    }

    @Override
    public int getItemCount() {
         if(mWeatherData!= null)
        return mWeatherData.size();
        return  0;
    }

    public  void setWeatherData( String data ){

        mWeatherData.add(data);
        notifyDataSetChanged();
    }

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

        public TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View itemView) {
            super(itemView);
            mWeatherTextView=(TextView)  itemView.findViewById(R.id.tv_weather_data);
        }
    }
}
