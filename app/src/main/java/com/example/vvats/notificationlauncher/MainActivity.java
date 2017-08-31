package com.example.vvats.notificationlauncher;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view) {
        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
        NotificationCompat.Builder notification = new NotificationCompat.Builder(this);
        notification.setContentTitle("1 new message");
        notification.setContentText("Hi, How are you ?");
        notification.setSmallIcon(android.R.drawable.ic_btn_speak_now);

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 1, intent, 0);
        notification.setContentIntent(pendingIntent);
        notification.setAutoCancel(true);

        managerCompat.notify(1, notification.build());
        finish();
    }
}
