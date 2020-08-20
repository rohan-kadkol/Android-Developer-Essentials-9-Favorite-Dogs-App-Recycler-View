package com.rohankadkol.favoritedogsapprecyclerview9.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rohankadkol.favoritedogsapprecyclerview9.DetailsActivity;
import com.rohankadkol.favoritedogsapprecyclerview9.R;
import com.rohankadkol.favoritedogsapprecyclerview9.pojos.Dog;
import com.squareup.picasso.Picasso;

import java.util.List;

// Within the DogsAdapter class (in DogsAdapter.java)
// TODO (3): Make DogsAdapter extend RecyclerView.Adapter<DogsAdapter.DogViewHolder>
// TODO (4): Create a sub class in DogsAdapter called DogViewHolder that extends RecyclerView.ViewHolder
// TODO (5): Add two private global variables of the types Context and Dog[]
// TODO (6): Initialize these global variables in the constructor using the values passed as parameters.
// TODO (7): Override the methods onCreateViewHolder(), onBindViewHolder(), and getItemCount()
public class DogsAdapter extends RecyclerView.Adapter<DogsAdapter.DogViewHolder> {
    private Context mContext;
    private Dog[] mDogs;

    public DogsAdapter(Context context, Dog[] dogs) {
        mContext = context;
        mDogs = dogs;
    }

    // Within onCreateViewHolder()
    // TODO (11): Create a layout inflater variable
    //  LayoutInflater inflater = LayoutInflater.from(mContext);
    // TODO (12): Inflate dog_item.xml using the above inflater. Save this in a View variable.
    //  View view = inflater.inflate(R.layout.dog_item, parent, false);
    // TODO (13): return a DogViewHolder object by passing the above saved view as a constructor parameter
    //  return new DogViewHolder(view);
    @NonNull
    @Override
    public DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.dog_item, parent, false);
        return new DogViewHolder(view);
    }

    // Within onBindViewHolder()
    // TODO (14): Using the holder and position parameters, set the correct data in the holder.
    //  holder.mTvName.setText(mDogs[position].getName())
    @Override
    public void onBindViewHolder(@NonNull DogViewHolder holder, int position) {
        Picasso.get().load(mDogs[position].getImageUrl()).into(holder.mIvDog);
        holder.mTvName.setText(mDogs[position].getName());
        holder.mTvBreed.setText(mDogs[position].getBreed());
    }

    // Within getItemCount()
    // TODO (15): return the length of the dogs array in the adapter.
    @Override
    public int getItemCount() {
        return mDogs.length;
    }

    // Within the DogViewHolder class
    // TODO (8): Create a constructor matching super
    // TODO (9): Add global variables for the main views in dog_item.xml: mIvDogs, mTvName, mTvBreed.
    // TODO (10): In the constructor, initialize the global variables using itemView.findViewById()
    class DogViewHolder extends RecyclerView.ViewHolder {
        ImageView mIvDog;
        TextView mTvName;
        TextView mTvBreed;

        public DogViewHolder(@NonNull View itemView) {
            super(itemView);

            mIvDog = itemView.findViewById(R.id.iv_dog);
            mTvName = itemView.findViewById(R.id.tv_name);
            mTvBreed = itemView.findViewById(R.id.tv_breed);
        }
    }
}
