package com.example.mystoreissafe;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
/*
public class AdaptadorCliente extends RecyclerView.Adapter<AdaptadorCliente.ViewHolderCliente> {
    private final Context context;
    private Cursor cursor = null;

    public void setCursor(Cursor cursor){
        if(cursor != this.cursor){
            this.cursor = cursor;
            notifyDataSetChanged();
        }
    }
    public AdaptadorCliente (Context context)  {
            this.context = context;
    }
    @NonNull

    @Override
    public AdaptadorCliente.ViewHolderCliente onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemCliente = LayoutInflater.from(context).inflate(R.layout.item_cliente, parent, false);
        return new ViewHolderCliente(itemCliente);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorCliente.ViewHolderCliente holder, int position) {
        
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderCliente extends RecyclerView.ViewHolder {
        public ViewHolderCliente(View itemCliente) {
            super(itemCliente);
        }
    }
}*/
