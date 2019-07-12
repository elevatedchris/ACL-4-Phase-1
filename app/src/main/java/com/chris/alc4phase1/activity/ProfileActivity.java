package com.chris.alc4phase1.activity;


import android.databinding.DataBindingUtil;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import com.chris.alc4phase1.R;


import com.chris.alc4phase1.data.User;
import com.chris.alc4phase1.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {


   User user;
    ActivityProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_profile);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("My Profile ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

         binding = DataBindingUtil.setContentView(this, R.layout.activity_profile);




        user = new User();



        user.setFullname( "Christian Valentine Tsigbey");
        user.setTrack("Track: " +"Android");
        user.setCountry("Country: " +"Ghana");
        user.setEmail("Email: " +"elevationdeveloper@gmail.com");
        user.setPhoneNumber("Phone Number: " +"233245000245");
        user.setUsername("Slack Username: " +"Chris");


       binding.setUser(user);



    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


}
