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

public class DogsAdapter extends RecyclerView.Adapter<DogsAdapter.DogViewHolder> {
    private Context mContext;
    private Dog[] mDogs;

    // TODO (6): Create a private instance of this DogClickInterface.
    private DogClickInterface mClickInterface;
    // TODO (4): Create a interface called DogClickInterface
    public interface DogClickInterface {
        // TODO (5): Within DogClickInterface, write an abstract method called onDogClick that
        //  returns void and takes an int for the position as the parameter.
        void onDogClick(int position);
    }

    // TODO (7): Modify the constructor's parameter to also take a value for the DogClickInterface
    public DogsAdapter(Context context, DogClickInterface clickInterface, Dog[] dogs) {
        // TODO (8): Assign the above private instance of DogClickInterface with the corresponding parameter
        mContext = context;
        mClickInterface = clickInterface;
        mDogs = dogs;
    }

    @NonNull
    @Override
    public DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.dog_item, parent, false);
        return new DogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DogViewHolder holder, int position) {
        Picasso.get().load(mDogs[position].getImageUrl()).into(holder.mIvDog);
        holder.mTvName.setText(mDogs[position].getName());
        holder.mTvBreed.setText(mDogs[position].getBreed());
    }

    @Override
    public int getItemCount() {
        return mDogs.length;
    }

    class DogViewHolder extends RecyclerView.ViewHolder {
        ImageView mIvDog;
        TextView mTvName;
        TextView mTvBreed;

        public DogViewHolder(@NonNull View itemView) {
            super(itemView);

            mIvDog = itemView.findViewById(R.id.iv_dog);
            mTvName = itemView.findViewById(R.id.tv_name);
            mTvBreed = itemView.findViewById(R.id.tv_breed);

            // TODO (9): Add an onClickListener to itemView
            // TODO (10): Inside the onClick method of the onClickListener, call onDogClick() from the global DogClickInterface parameter
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mClickInterface.onDogClick(getAdapterPosition());
                }
            });
        }
    }
}
