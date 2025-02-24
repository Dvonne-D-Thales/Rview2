package com.example.rview2;


public class Musik {
    private String judul;
    private String artis;
    private String pembuat;
    private int albumCover;
    private String lirik;

    public Musik(String judul, String artis, String pembuat, int albumCover, String lirik) {
        this.judul = judul;
        this.artis = artis;
        this.pembuat = pembuat;
        this.albumCover = albumCover;
        this.lirik = lirik;
    }

    public String getJudul() { return judul; }
    public String getArtis() { return artis; }
    public String getPembuat() { return pembuat; }
    public int getAlbumCover() { return albumCover; }
    public String getLirik() { return lirik; }
}
