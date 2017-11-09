package ca.ualberta.cs.routinekeen.Views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import ca.ualberta.cs.routinekeen.Models.HabitList;
import ca.ualberta.cs.routinekeen.Models.User;
import ca.ualberta.cs.routinekeen.R;

/**
 * Created by tiakindele on 2017-11-06.
 */

public class UserMenu extends AppCompatActivity{

    private Button logoutBtn;
    private TextView viewHabitList;
    private TextView viewHabitSchedule;
    private TextView viewHabitHistory;
    private TextView userSocialMedia;
    private TextView geoAndMaps;

    @Override
    protected void onStart() {
        super.onStart();
        logoutBtn = (Button) findViewById(R.id.logout);
        viewHabitList = (TextView) findViewById(R.id.view_habit_list);
        viewHabitSchedule = (TextView) findViewById(R.id.view_habit_schedule);
        viewHabitHistory = (TextView) findViewById(R.id.view_habit_history);
        userSocialMedia = (TextView) findViewById(R.id.user_social_media);
        geoAndMaps = (TextView) findViewById(R.id.geo_and_maps);

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserMenu.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        viewHabitList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserMenu.this, HabitListActivity.class);
                startActivity(intent);
            }
        });

        viewHabitSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change from LoginActivity.class to appropriate class
                // LoginActivity.class was used for testing
                Intent intent = new Intent(UserMenu.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        viewHabitHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change from LoginActivity.class to appropriate class
                // LoginActivity.class was used for testing
                Intent intent = new Intent(UserMenu.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        userSocialMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change from LoginActivity.class to appropriate class
                // LoginActivity.class was used for testing
                Intent intent = new Intent(UserMenu.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        geoAndMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change from LoginActivity.class to appropriate class
                // LoginActivity.class was used for testing
                Intent intent = new Intent(UserMenu.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_menu);

        // get user name from User
        User user = new User();
        String strUsername = user.getUsername();
        final TextView username = (TextView) findViewById(R.id.username);
        username.setText(strUsername);

        onStart();
    }
}