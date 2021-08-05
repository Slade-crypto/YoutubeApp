package com.example.youtube.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import com.example.youtube.R;
import com.example.youtube.adapter.AdapterVideo;
import com.example.youtube.model.Video;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Widgets
    private RecyclerView recyclerVideos;

    private List<Video> videos = new ArrayList<>();
    private AdapterVideo adapterVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar Componentes
        recyclerVideos = findViewById(R.id.recyclerVideos);

        //Configura Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Youtube");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        //Configura RecyclerView
        recuperarVideos();
        recyclerVideos.setHasFixedSize(true);
        recyclerVideos.setLayoutManager(new LinearLayoutManager(this));
        recyclerVideos.setAdapter(adapterVideo);

    }

    private void recuperarVideos(){
        Video video1 = new Video();
        adapterVideo = new AdapterVideo(videos, this);
        video1.setTitulo("Video 1 muito interessante");
        videos.add(video1);

        Video video2 = new Video();
        video2.setTitulo("Video 2 muito interessante");
        videos.add(video2);
    }

}
