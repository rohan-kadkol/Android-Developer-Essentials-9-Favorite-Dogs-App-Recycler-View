package com.rohankadkol.favoritedogsapprecyclerview9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.rohankadkol.favoritedogsapprecyclerview9.pojos.Dog;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
    Dog mDog;

    ImageView mIvDog;
    TextView mTvName;
    TextView mTvBreed;
    TextView mTvLikes;
    TextView mTvDislikes;

    Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mIvDog = findViewById(R.id.iv_dog);
        mTvName = findViewById(R.id.tv_name);
        mTvBreed = findViewById(R.id.tv_breed);
        mTvLikes = findViewById(R.id.tv_likes);
        mTvDislikes = findViewById(R.id.tv_dislikes);

        mIntent = getIntent();
        if (mIntent != null) {
            mDog = mIntent.getParcelableExtra("dog");
            setupActionBar();
            populateUi();
        }
    }

    private void setupActionBar() {
        setTitle(mDog.getName());
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void populateUi() {
        Dog dog = getIntent().getParcelableExtra("dog");

        mTvName.setText(dog.getName());
        mTvBreed.setText(dog.getBreed());
        mTvLikes.setText(dog.getLikes());
        mTvDislikes.setText(dog.getDislikes());
        Picasso.get().load(dog.getImageUrl()).into(mIvDog);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
