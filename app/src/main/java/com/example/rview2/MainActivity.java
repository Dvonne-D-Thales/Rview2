package com.example.rview2;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MusikAdapter.OnItemClickListener {

    private RecyclerView recyclerView;
    private MusikAdapter musikAdapter;
    private ArrayList<Musik> musikList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        musikList = new ArrayList<>();

        // Menambahkan lagu-lagu baru beserta liriknya
        musikList.add(new Musik("Shape of You", "Ed Sheeran", "Ed Sheeran", R.drawable.shape_of_you,
                "The club isn't the best place to find a lover\n" +
                        "So the bar is where I go...\n"));

        musikList.add(new Musik("Blinding Lights", "The Weeknd", "The Weeknd", R.drawable.blinding_lights,
                "I've been tryna call\n" +
                        "I've been on my own for long enough...\n"));

        musikList.add(new Musik("Someone Like You", "Adele", "Adele", R.drawable.someone_like_u,
                "I heard that you're settled down\n" +
                        "That you found a girl and you're married now...\n"));

        musikList.add(new Musik("Fix You", "Coldplay", "Coldplay", R.drawable.fix_you,
                "When you try your best, but you don't succeed...\n"));

        musikList.add(new Musik("Yesterday", "The Beatles", "The Beatles", R.drawable.billie_jeans,
                "Yesterday, all my troubles seemed so far away...\n"));

        musikList.add(new Musik("Bohemian Rhapsody", "Queen", "Freddie Mercury", R.drawable.boheiman_rapshopdy,
                "Is this the real life?\n" +
                        "Is this just fantasy?\n"));

        musikAdapter = new MusikAdapter(musikList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(musikAdapter);
    }

    @Override
    public void onItemClick(int position) {
        Musik musik = musikList.get(position);
        Intent intent = new Intent(this, DetailMusikActivity.class);
        intent.putExtra("judul", musik.getJudul());
        intent.putExtra("artis", musik.getArtis());
        intent.putExtra("pembuat", musik.getPembuat());
        intent.putExtra("cover", musik.getAlbumCover());
        intent.putExtra("lirik", musik.getLirik());
        startActivity(intent);
    }
}
