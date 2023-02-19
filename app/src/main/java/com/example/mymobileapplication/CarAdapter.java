package com.example.mymobileapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {

    private final RecyclerViewInterface recyclerViewInterface;

    private List<Car> carList;

    public CarAdapter(RecyclerViewInterface recyclerViewInterface, List<Car> carList) {
        this.recyclerViewInterface = recyclerViewInterface;
        this.carList = carList;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Declare item_layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car, parent, false);
        return new CarViewHolder(view, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        //Set data to item
        Car car = carList.get(position);
        if (car == null) {
            return;
        }
        holder.imgCar.setImageResource(car.getImg());
        holder.tvNameCar.setText(car.getName());
    }

    @Override
    public int getItemCount() {
        if (carList != null) {
            return carList.size();
        }
        return 0;
    }

    //Pass this class to the Adapter
    public static class CarViewHolder extends RecyclerView.ViewHolder {
        //Declare all component in item_layout
        private ImageView imgCar;
        private TextView tvNameCar;

        public CarViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);
            imgCar = itemView.findViewById(R.id.img_car);
            tvNameCar = itemView.findViewById(R.id.tv_name_car);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(recyclerViewInterface != null){
                        int pos = getAdapterPosition();
                        if(pos != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
}
