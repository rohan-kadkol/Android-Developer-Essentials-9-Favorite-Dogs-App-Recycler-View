package com.rohankadkol.favoritedogsapprecyclerview9.pojos;

import android.os.Parcel;
import android.os.Parcelable;

// TODO (1): Implement Parcelable
// TODO (2): Alt+Enter or Ctrl+O to implement the methods from the Parcelable interface: describeContents(), writeToParcel()
// TODO (3): We need to do the following:
//  1. Add a protected constructor that takes in a Parcel as a parameter and sets its values by reading from this parcel parameter.
//  2. Create an object of type Creator called CREATOR
//  3. Implement writeToParcel that writes the current values into the parcel parameter.
//  We can do this manually or by Alt+Enter -> Add Parcelable Implementation
public class Dog implements Parcelable {
    private String name;
    private String breed;
    private double age;
    private String likes;
    private String dislikes;
    private String imageUrl;

    public Dog(String name, String breed, double age, String likes, String dislikes, String imageUrl) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.likes = likes;
        this.dislikes = dislikes;
        this.imageUrl = imageUrl;
    }

    protected Dog(Parcel in) {
        name = in.readString();
        breed = in.readString();
        age = in.readDouble();
        likes = in.readString();
        dislikes = in.readString();
        imageUrl = in.readString();
    }

    public static final Creator<Dog> CREATOR = new Creator<Dog>() {
        @Override
        public Dog createFromParcel(Parcel in) {
            return new Dog(in);
        }

        @Override
        public Dog[] newArray(int size) {
            return new Dog[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getDislikes() {
        return dislikes;
    }

    public void setDislikes(String dislikes) {
        this.dislikes = dislikes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(breed);
        dest.writeDouble(age);
        dest.writeString(likes);
        dest.writeString(dislikes);
        dest.writeString(imageUrl);
    }
}

