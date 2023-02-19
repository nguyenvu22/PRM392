package com.example.mymobileapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Date;

public class ItemDetailActivity extends AppCompatActivity {

    private static final int NOTIFICATION_ID = 1;
    private ImageView vehicleImg;
    private TextView vehicleName, vehiclePrice, vehicleDesc;
    private Button backBtn, notiBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        vehicleImg = findViewById(R.id.vehicleImg);
        vehicleName = findViewById(R.id.vehicleName);
        vehiclePrice = findViewById(R.id.vehiclePrice);
        vehicleDesc = findViewById(R.id.vehicleDesc);
        backBtn = findViewById(R.id.backBtn);
        notiBtn = findViewById(R.id.notiBtn);

        vehicleImg.setImageResource(getIntent().getIntExtra("vehicleImg", 1));
        vehicleName.setText(getIntent().getStringExtra("vehicleName"));
        vehiclePrice.setText(getIntent().getStringExtra("vehiclePrice") + "$");
        vehicleDesc.setText(getIntent().getStringExtra("vehicleDesc"));

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backToRecyclerView();
            }
        });

        notiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendNotification();
            }
        });
    }

    private void backToRecyclerView() {
        finish();
    }

    private void sendNotification() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        Notification notification = new NotificationCompat.Builder(this, MyApplication.CHANNEL_ID)
                .setContentTitle("You have bought 1 vehicle.")
//                .setContentText("Thank for using our services <3")
                .setSmallIcon(R.drawable.notification_icon)
                .setLargeIcon(bitmap)
                .setColor(getResources().getColor(R.color.purple_500))
                .setStyle(new NotificationCompat.BigTextStyle()
                        .bigText("Thank for using our services <3"))
                .setAutoCancel(true)
                .build();

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(generateNotificationId(), notification);

//        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        if (notificationManager != null) {
//            notificationManager.notify(NOTIFICATION_ID, notification);
//        }
    }

    private int generateNotificationId(){
        return (int) new Date().getTime();
    }
}