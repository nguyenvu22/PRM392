package com.example.mymobileapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView email;
    private RecyclerView rcvVehicle;
    private Button btnCar, btnBus, btnTaxi;
    private GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        email = findViewById(R.id.email);
        email.setText("Welcome " + getIntent().getStringExtra("loginEmail"));

        btnCar = findViewById(R.id.btn_car);
        btnBus = findViewById(R.id.btn_bus);
        btnTaxi = findViewById(R.id.btn_taxi);
        rcvVehicle = findViewById(R.id.rcv_vehicle);

        gridLayoutManager = new GridLayoutManager(this, 3);
        rcvVehicle.setLayoutManager(gridLayoutManager);

        CarAdapter carAdapter = new CarAdapter(getListCar());
        rcvVehicle.setAdapter(carAdapter);

        btnCar.setOnClickListener(this);
        btnBus.setOnClickListener(this);
        btnTaxi.setOnClickListener(this);
    }

    private List<Car> getListCar() {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car(R.drawable.car, " Car", Car.TYPE_CAR));
        listCar.add(new Car(R.drawable.car, " Car", Car.TYPE_CAR));
        listCar.add(new Car(R.drawable.car, " Car", Car.TYPE_CAR));
        listCar.add(new Car(R.drawable.car, " Car", Car.TYPE_CAR));
        listCar.add(new Car(R.drawable.car, " Car", Car.TYPE_CAR));
        listCar.add(new Car(R.drawable.car, " Car", Car.TYPE_CAR));
        listCar.add(new Car(R.drawable.car, " Car", Car.TYPE_CAR));
        listCar.add(new Car(R.drawable.car, " Car", Car.TYPE_CAR));
        listCar.add(new Car(R.drawable.car, " Car", Car.TYPE_CAR));

        listCar.add(new Car(R.drawable.bus, " Bus", Car.TYPE_BUS));
        listCar.add(new Car(R.drawable.bus, " Bus", Car.TYPE_BUS));
        listCar.add(new Car(R.drawable.bus, " Bus", Car.TYPE_BUS));
        listCar.add(new Car(R.drawable.bus, " Bus", Car.TYPE_BUS));
        listCar.add(new Car(R.drawable.bus, " Bus", Car.TYPE_BUS));
        listCar.add(new Car(R.drawable.bus, " Bus", Car.TYPE_BUS));
        listCar.add(new Car(R.drawable.bus, " Bus", Car.TYPE_BUS));
        listCar.add(new Car(R.drawable.bus, " Bus", Car.TYPE_BUS));
        listCar.add(new Car(R.drawable.bus, " Bus", Car.TYPE_BUS));

        listCar.add(new Car(R.drawable.taxi, " Taxi", Car.TYPE_TAXI));
        listCar.add(new Car(R.drawable.taxi, " Taxi", Car.TYPE_TAXI));
        listCar.add(new Car(R.drawable.taxi, " Taxi", Car.TYPE_TAXI));
        listCar.add(new Car(R.drawable.taxi, " Taxi", Car.TYPE_TAXI));
        listCar.add(new Car(R.drawable.taxi, " Taxi", Car.TYPE_TAXI));
        listCar.add(new Car(R.drawable.taxi, " Taxi", Car.TYPE_TAXI));
        listCar.add(new Car(R.drawable.taxi, " Taxi", Car.TYPE_TAXI));
        listCar.add(new Car(R.drawable.taxi, " Taxi", Car.TYPE_TAXI));
        listCar.add(new Car(R.drawable.taxi, " Taxi", Car.TYPE_TAXI));
        return listCar;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_car:
                scrollToItem(0);
                break;

            case R.id.btn_bus:
                scrollToItem(9);
                break;

            case R.id.btn_taxi:
                scrollToItem(18);
                break;

        }
    }

    private void scrollToItem(int i) {
        if(gridLayoutManager == null){
            return;
        }

        gridLayoutManager.scrollToPositionWithOffset(i, 0);
    }
}