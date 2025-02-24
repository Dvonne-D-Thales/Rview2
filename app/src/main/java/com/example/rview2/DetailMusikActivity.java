package com.example.rview2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailMusikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_musik);

        ImageView albumCover = findViewById(R.id.detailAlbumCover);
        TextView judul = findViewById(R.id.detailJudul);
        TextView artis = findViewById(R.id.detailArtis);
        TextView pembuat = findViewById(R.id.detailPembuat);
        TextView lirik = findViewById(R.id.detailLirik);
        Button btnKembali = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        judul.setText(intent.getStringExtra("judul"));
        artis.setText(intent.getStringExtra("artis"));
        pembuat.setText(intent.getStringExtra("pembuat"));
        lirik.setText(intent.getStringExtra("lirik"));
        albumCover.setImageResource(intent.getIntExtra("cover", 0));

        btnKembali.setOnClickListener(v -> finish());
    }
}
