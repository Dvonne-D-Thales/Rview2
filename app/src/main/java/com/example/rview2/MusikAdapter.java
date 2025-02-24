package com.example.rview2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MusikAdapter extends RecyclerView.Adapter<MusikAdapter.MusikViewHolder> {

    private ArrayList<Musik> musikList;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public MusikAdapter(ArrayList<Musik> musikList, OnItemClickListener listener) {
        this.musikList = musikList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MusikViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_musik, parent, false);
        return new MusikViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusikViewHolder holder, int position) {
        Musik musik = musikList.get(position);
        holder.judulTextView.setText(musik.getJudul());
        holder.artisTextView.setText(musik.getArtis());
        holder.albumCoverImageView.setImageResource(musik.getAlbumCover());
    }

    @Override
    public int getItemCount() {
        return musikList.size();
    }

    public class MusikViewHolder extends RecyclerView.ViewHolder {
        TextView judulTextView, artisTextView;
        ImageView albumCoverImageView;

        public MusikViewHolder(@NonNull View itemView) {
            super(itemView);
            judulTextView = itemView.findViewById(R.id.judulMusik);
            artisTextView = itemView.findViewById(R.id.artisMusik);
            albumCoverImageView = itemView.findViewById(R.id.albumCover);

            itemView.setOnClickListener(v -> {
                if (listener != null) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(position);
                    }
                }
            });
        }
    }
}
