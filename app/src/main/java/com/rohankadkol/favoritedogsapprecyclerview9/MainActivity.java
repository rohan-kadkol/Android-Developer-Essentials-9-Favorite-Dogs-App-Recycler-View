package com.rohankadkol.favoritedogsapprecyclerview9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rohankadkol.favoritedogsapprecyclerview9.pojos.Dog;

public class MainActivity extends AppCompatActivity{
    private Dog[] mDogs = {new Dog("Ace", "Affenpinscher", 2, "Walks", "Bathing", "https://upload.wikimedia.org/wikipedia/commons/1/17/Affenpinscher.jpg"),
            new Dog("Batman", "Bat", 1, "Saving humans", "Light", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Golden_crowned_fruit_bat.jpg/130px-Golden_crowned_fruit_bat.jpg"),
            new Dog("Camaro", "Greyhound", 5, "Running", "Confinement of any sort", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Racing_Greyhound_%28US%29.jpg/800px-Racing_Greyhound_%28US%29.jpg"),
            new Dog("Dimitri", "Black Russian Terrier", .5, "Small strolls in the morning", "Vodka", "https://upload.wikimedia.org/wikipedia/commons/1/1a/Russianblack.jpg"),
            new Dog("Electro", "Saluki", 7, "Long runs", "Being called Electro", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Kurdish_Saluki.jpg/200px-Kurdish_Saluki.jpg"),
            new Dog("Feather", "Pomeranian", .25, "Charlie the owner", "Charlie the owner when he is mad", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Pomeranian.JPG/220px-Pomeranian.JPG"),
            new Dog("Gallop", "Border Collie", 2, "Jumping in the grass", "Being told to get off the grass", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Herding-6.png/220px-Herding-6.png"),
            new Dog("Halloumi", "Saluki", 1, "Being compared with cheese", "Being specifically compared with Halloumi cheese", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Gold_saluki.jpg/220px-Gold_saluki.jpg"),
            new Dog("Icarus", "Unicorn", 100, "Flying high in the sky with its wax wings", "Falling to the ground when the wax wings melt", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/70/Oftheunicorn.jpg/220px-Oftheunicorn.jpg"),
            new Dog("Joker", "Rottweiler", 7, "Chasing after Batman", "Life without Batman", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/26/Rottweiler_standing_facing_left.jpg/220px-Rottweiler_standing_facing_left.jpg"),
            new Dog("Kilo", "Great Dane", 4, "Watching TV and eating potato chips", "When the owner stock of potato chips gets over.", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Great_dane.jpg/220px-Great_dane.jpg"),
            new Dog("Larry", "Border Collie", 2, "Wearing spectacles", "When people say he looks like an accountant with his spectacles", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/SlabCityS-14.png/220px-SlabCityS-14.png"),
            new Dog("Monotone", "Basset Hound", 5, "Keeping silent and coercing noisy people to keep silent", "Being told to stiff out the owner's sock just becuase he is a hound dog", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Bvdb-bassethound1.jpg/220px-Bvdb-bassethound1.jpg"),
            new Dog("Nike", "Weimaraner ", 10, "Brisk morning runs", "Being told he can't run just because he's 10 years old.", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Weimaraner_wb.jpg/220px-Weimaraner_wb.jpg"),
            new Dog("Ostrich", "German Shorthaired Pointer", 3, "Using its long neck to point at a point of interest", "People making fun of its long neck", "https://upload.wikimedia.org/wikipedia/commons/3/38/Duitse_staande_korthaar_10-10-2.jpg"),
            new Dog("Papa", "Pit Bull", 2, "Caring for his 3 litters of dogs, each with a different female dog", "Practising monogamy", "https://upload.wikimedia.org/wikipedia/commons/4/42/Blue_nose_pit_bull_puppy.jpg"),
            new Dog("Quebec", "Canadian Eskimo Dog", 5, "Playing in a mountain of maple leaves", "Being told that that she can't watch the Hockey game on the family TV.", "https://upload.wikimedia.org/wikipedia/commons/7/79/Spoonsced.jpg"),
            new Dog("Rohan", "Doberman", 20, "Being compared to man unanimously loved by all women - Rohan Kadkol", "Being told that no matter how hard he tries, he can never be like Rohan Kadkol.", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/Dobermann_handling.jpg/800px-Dobermann_handling.jpg"),
            new Dog("Sabine", "Dachshund", 3, "Being compared to Mr. Bean's girlfriend- Sabine", "Not finding the Mr. Bean of her life. Lonely indeed.", "https://upload.wikimedia.org/wikipedia/commons/a/a8/Mao-the-dachshund-wikipedia.png"),
            new Dog("Tara", "Siberian Husky", 1, "рыыв фьб ыффг фсдфсдфсд дфмлксд", "и шент то тче сторе тодаы. Карен диднжт шеар чер маск", "https://upload.wikimedia.org/wikipedia/commons/a/a3/Black-Magic-Big-Boy.jpg"),
            new Dog("Ursula", "Pug", 8, "Her twin sister — Phoebe Buffay", "Phoebe Buffay's fame", "https://upload.wikimedia.org/wikipedia/commons/f/f0/Mops_oct09_cropped2.jpg"),
            new Dog("Victoria", "Chinese Crested Dog", 4, "The fact that she doesn't shed hair", "When she realizes that the reason she doesn't shed hair is because she's bald", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/IndyStands.jpg/1920px-IndyStands.jpg"),
            new Dog("Wolfgang", "German Shepherd", 10, "The music of the rock band — Wolfgang", "The fact that Wolfgang did not pay him any money for naming their band name after him.", "https://upload.wikimedia.org/wikipedia/commons/d/d0/German_Shepherd_-_DSC_0346_%2810096362833%29.jpg"),
            new Dog("X-ray", "Superdog", 199023, "Seeing through people's clothes using his X-Ray vision", "When people tell him he is not as heroic as his master — Superman", "https://images.unsplash.com/photo-1532202802379-df93d543bac3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80"),
            new Dog("Yasmine", "Yorkshire Yerrier", 2, "Yong Yalks Yn Yhe Yark", "Yverything Yhat Ytarts Yith Yhe Yetter \"Y\"", "https://images.unsplash.com/photo-1562457346-73bb427293e8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1952&q=80"),
            new Dog("Zaxby's", "Beagle", 9, "Chicken", "Whatever the hell KFC calls chicken", "https://images.unsplash.com/photo-1490042706304-06c664f6fd9a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1351&q=80"),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupRecyclerView();
    }

    private void setupRecyclerView() {
        // TODO (5): Create a variable for the RecyclerView using the usual findViewById() method. Yes, that old thing!
        RecyclerView rvDogs = findViewById(R.id.rv_dogs);
    }
}
