package com.example.mymobileapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener, RecyclerViewInterface {

    private TextView email;
    private RecyclerView rcvVehicle;
    private Button btnCar, btnBus, btnTaxi;
    private GridLayoutManager gridLayoutManager;
    private MaterialToolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle("Welcome " + getIntent().getStringExtra("loginEmail"));
//        email = findViewById(R.id.email);
//        email.setText("Welcome " + getIntent().getStringExtra("loginEmail"));

        btnCar = findViewById(R.id.btn_car);
        btnBus = findViewById(R.id.btn_bus);
        btnTaxi = findViewById(R.id.btn_taxi);
        rcvVehicle = findViewById(R.id.rcv_vehicle);

        gridLayoutManager = new GridLayoutManager(this, 3);
        rcvVehicle.setLayoutManager(gridLayoutManager);

        CarAdapter carAdapter = new CarAdapter(this, getListCar());
        rcvVehicle.setAdapter(carAdapter);

        btnCar.setOnClickListener(this);
        btnBus.setOnClickListener(this);
        btnTaxi.setOnClickListener(this);
    }

    private List<Car> getListCar() {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car(R.drawable.car1, " Acura Integra", Car.TYPE_CAR, 12000000, "Automate your vehicle comments to create more inventory based leads and opportunities.  Comments on vehicle listings compel shoppers to click on your vehicle which creates more opportunities for you to sell a car.  When you automate the process you can be sure that 100% of your vehicles have a compelling description automatically written for you."));
        listCar.add(new Car(R.drawable.car1, " Acura Integra", Car.TYPE_CAR, 12000000, "Automate your vehicle comments to create more inventory based leads and opportunities.  Comments on vehicle listings compel shoppers to click on your vehicle which creates more opportunities for you to sell a car.  When you automate the process you can be sure that 100% of your vehicles have a compelling description automatically written for you."));
        listCar.add(new Car(R.drawable.car1, " Acura Integra", Car.TYPE_CAR, 22000000, "Automate your vehicle comments to create more inventory based leads and opportunities.  Comments on vehicle listings compel shoppers to click on your vehicle which creates more opportunities for you to sell a car.  When you automate the process you can be sure that 100% of your vehicles have a compelling description automatically written for you."));
        listCar.add(new Car(R.drawable.car2, " Lamborghini", Car.TYPE_CAR, 13000000, "Automate your vehicle comments to create more inventory based leads and opportunities.  Comments on vehicle listings compel shoppers to click on your vehicle which creates more opportunities for you to sell a car.  When you automate the process you can be sure that 100% of your vehicles have a compelling description automatically written for you."));
        listCar.add(new Car(R.drawable.car2, " Lamborghini", Car.TYPE_CAR, 42000000, "Automate your vehicle comments to create more inventory based leads and opportunities.  Comments on vehicle listings compel shoppers to click on your vehicle which creates more opportunities for you to sell a car.  When you automate the process you can be sure that 100% of your vehicles have a compelling description automatically written for you."));
        listCar.add(new Car(R.drawable.car2, " Lamborghini", Car.TYPE_CAR, 12000000, "Automate your vehicle comments to create more inventory based leads and opportunities.  Comments on vehicle listings compel shoppers to click on your vehicle which creates more opportunities for you to sell a car.  When you automate the process you can be sure that 100% of your vehicles have a compelling description automatically written for you."));

        listCar.add(new Car(R.drawable.bus1, " Bus1", Car.TYPE_BUS, 43000000, "-New Arrival- Navigation System, Entertainment System, Sunroof / Moonroof, Satellite Radio, and Parking Sensors -Carfax One Owner- This Crystal Black Pearl 2014 Acura MDX Advance/Entertainment Pkg is priced to sell fast! ABC Motors prides itself on value pricing its vehicles and exceeding all customer expectations! The next step? Give us a call to confirm availability and schedule a hassle free test drive!"));
        listCar.add(new Car(R.drawable.bus1, " Bus3", Car.TYPE_BUS, 23000000, "-New Arrival- Navigation System, Entertainment System, Sunroof / Moonroof, Satellite Radio, and Parking Sensors -Carfax One Owner- This Crystal Black Pearl 2014 Acura MDX Advance/Entertainment Pkg is priced to sell fast! ABC Motors prides itself on value pricing its vehicles and exceeding all customer expectations! The next step? Give us a call to confirm availability and schedule a hassle free test drive!"));
        listCar.add(new Car(R.drawable.bus1, " Bus2", Car.TYPE_BUS, 22000000, "-New Arrival- Navigation System, Entertainment System, Sunroof / Moonroof, Satellite Radio, and Parking Sensors -Carfax One Owner- This Crystal Black Pearl 2014 Acura MDX Advance/Entertainment Pkg is priced to sell fast! ABC Motors prides itself on value pricing its vehicles and exceeding all customer expectations! The next step? Give us a call to confirm availability and schedule a hassle free test drive!"));
        listCar.add(new Car(R.drawable.bus2, " Bus6", Car.TYPE_BUS, 26000000, "-New Arrival- Navigation System, Entertainment System, Sunroof / Moonroof, Satellite Radio, and Parking Sensors -Carfax One Owner- This Crystal Black Pearl 2014 Acura MDX Advance/Entertainment Pkg is priced to sell fast! ABC Motors prides itself on value pricing its vehicles and exceeding all customer expectations! The next step? Give us a call to confirm availability and schedule a hassle free test drive!"));
        listCar.add(new Car(R.drawable.bus2, " Bus9", Car.TYPE_BUS, 13000000, "-New Arrival- Navigation System, Entertainment System, Sunroof / Moonroof, Satellite Radio, and Parking Sensors -Carfax One Owner- This Crystal Black Pearl 2014 Acura MDX Advance/Entertainment Pkg is priced to sell fast! ABC Motors prides itself on value pricing its vehicles and exceeding all customer expectations! The next step? Give us a call to confirm availability and schedule a hassle free test drive!"));
        listCar.add(new Car(R.drawable.bus2, " Bus4", Car.TYPE_BUS, 3000000, "-New Arrival- Navigation System, Entertainment System, Sunroof / Moonroof, Satellite Radio, and Parking Sensors -Carfax One Owner- This Crystal Black Pearl 2014 Acura MDX Advance/Entertainment Pkg is priced to sell fast! ABC Motors prides itself on value pricing its vehicles and exceeding all customer expectations! The next step? Give us a call to confirm availability and schedule a hassle free test drive!"));


        listCar.add(new Car(R.drawable.taxi1, " Public Hire Taxis", Car.TYPE_TAXI, 10000000, "PRICED BELOW MARKET! INTERNET SPECIAL! -CARFAX ONE OWNER- MULTI-POINT INSPECTED! HEATED FRONT SEATS, LEATHER SEATS, SUNROOF / MOONROOF, PARKING SENSORS, AND DVD PLAYER. This 2011 Honda Odyssey EX-L is value priced to sell quickly! It has a great looking Dark Cherry Pearl exterior and a Beige interior! Please call us to confirm availability and to schedule a hassle free test drive. We are located at: 1515 Main Street, Hometown, GA."));
        listCar.add(new Car(R.drawable.taxi1, " Private Hire Vehicles", Car.TYPE_TAXI, 10000000, "PRICED BELOW MARKET! INTERNET SPECIAL! -CARFAX ONE OWNER- MULTI-POINT INSPECTED! HEATED FRONT SEATS, LEATHER SEATS, SUNROOF / MOONROOF, PARKING SENSORS, AND DVD PLAYER. This 2011 Honda Odyssey EX-L is value priced to sell quickly! It has a great looking Dark Cherry Pearl exterior and a Beige interior! Please call us to confirm availability and to schedule a hassle free test drive. We are located at: 1515 Main Street, Hometown, GA."));
        listCar.add(new Car(R.drawable.taxi1, " Uber Drivers", Car.TYPE_TAXI, 10000000, "PRICED BELOW MARKET! INTERNET SPECIAL! -CARFAX ONE OWNER- MULTI-POINT INSPECTED! HEATED FRONT SEATS, LEATHER SEATS, SUNROOF / MOONROOF, PARKING SENSORS, AND DVD PLAYER. This 2011 Honda Odyssey EX-L is value priced to sell quickly! It has a great looking Dark Cherry Pearl exterior and a Beige interior! Please call us to confirm availability and to schedule a hassle free test drive. We are located at: 1515 Main Street, Hometown, GA."));
        listCar.add(new Car(R.drawable.taxi2, " Private Hire Vehicles", Car.TYPE_TAXI, 10000000, "PRICED BELOW MARKET! INTERNET SPECIAL! -CARFAX ONE OWNER- MULTI-POINT INSPECTED! HEATED FRONT SEATS, LEATHER SEATS, SUNROOF / MOONROOF, PARKING SENSORS, AND DVD PLAYER. This 2011 Honda Odyssey EX-L is value priced to sell quickly! It has a great looking Dark Cherry Pearl exterior and a Beige interior! Please call us to confirm availability and to schedule a hassle free test drive. We are located at: 1515 Main Street, Hometown, GA."));
        listCar.add(new Car(R.drawable.taxi2, " Public Hire Taxis", Car.TYPE_TAXI, 10000000, "PRICED BELOW MARKET! INTERNET SPECIAL! -CARFAX ONE OWNER- MULTI-POINT INSPECTED! HEATED FRONT SEATS, LEATHER SEATS, SUNROOF / MOONROOF, PARKING SENSORS, AND DVD PLAYER. This 2011 Honda Odyssey EX-L is value priced to sell quickly! It has a great looking Dark Cherry Pearl exterior and a Beige interior! Please call us to confirm availability and to schedule a hassle free test drive. We are located at: 1515 Main Street, Hometown, GA."));
        listCar.add(new Car(R.drawable.taxi2, " Uber Drivers", Car.TYPE_TAXI, 10000000, "PRICED BELOW MARKET! INTERNET SPECIAL! -CARFAX ONE OWNER- MULTI-POINT INSPECTED! HEATED FRONT SEATS, LEATHER SEATS, SUNROOF / MOONROOF, PARKING SENSORS, AND DVD PLAYER. This 2011 Honda Odyssey EX-L is value priced to sell quickly! It has a great looking Dark Cherry Pearl exterior and a Beige interior! Please call us to confirm availability and to schedule a hassle free test drive. We are located at: 1515 Main Street, Hometown, GA."));

        return listCar;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_car:
                scrollToItem(0);
                break;

            case R.id.btn_bus:
                scrollToItem(6);
                break;

            case R.id.btn_taxi:
                scrollToItem(12);
                break;

        }
    }

    private void scrollToItem(int i) {
        if (gridLayoutManager == null) {
            return;
        }
        gridLayoutManager.scrollToPositionWithOffset(i, 0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Item1 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Item2 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "Item3 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subItem1:
                Toast.makeText(this, "SubItem1 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subItem2:
                Toast.makeText(this, "SubItem2 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.search:
                Toast.makeText(this, "Search selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.shopping:
                Toast.makeText(this, "Shopping selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(HomeActivity.this, ItemDetailActivity.class);

        intent.putExtra("vehicleImg", getListCar().get(position).getImg());
        intent.putExtra("vehicleName", getListCar().get(position).getName());
        intent.putExtra("vehiclePrice", String.valueOf(getListCar().get(position).getPrice()));
        intent.putExtra("vehicleDesc", getListCar().get(position).getDesc());

        startActivity(intent);
    }
}