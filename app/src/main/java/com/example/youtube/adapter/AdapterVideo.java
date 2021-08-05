package com.example.youtube.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtube.R;
import com.example.youtube.model.Video;

import java.util.ArrayList;
import java.util.List;

public class AdapterVideo extends RecyclerView.Adapter<AdapterVideo.MyViewHolder> {

    private List<Video> videos = new ArrayList<>();
    private Context context;

    public AdapterVideo(List<Video> videos, Context context) {
        this.videos = videos;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_video, parent, false);
        return new AdapterVideo.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Video video = videos.get(position);
        holder.titulo.setText(video.getTitulo());

    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        TextView descicao;
        TextView data;
        ImageView capa;

        public MyViewHolder(View itemView){
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            capa = itemView.findViewById(R.id.imageCapa);
        }


    }

}
