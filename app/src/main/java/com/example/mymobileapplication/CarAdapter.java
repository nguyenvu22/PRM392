package com.example.mymobileapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder>{

    private List<Car> carList;

    public CarAdapter(List<Car> carList) {
        this.carList = carList;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car, parent, false);
        return new CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        Car car = carList.get(position);
        if(car == null){
            return;
        }

        holder.imgCar.setImageResource(car.getImg());
        holder.tvNameCar.setText(car.getName());
    }

    @Override
    public int getItemCount() {
        if(carList != null){
            return carList.size();
        }
        return 0;
    }

    public class CarViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgCar;
        private TextView tvNameCar;

        public CarViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCar = itemView.findViewById(R.id.img_car);
            tvNameCar = itemView.findViewById(R.id.tv_name_car);
        }
    }
}
