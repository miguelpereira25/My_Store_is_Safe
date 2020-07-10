package com.example.mystoreissafe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ClientAdapter extends RecyclerView.Adapter<ClientAdapter.MyViewHolder> {
    private List<clienteHelpClass> clienteHelpClassList;

    public ClientAdapter (List<clienteHelpClass>clienteHelpClassList){
        this.clienteHelpClassList = clienteHelpClassList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


          View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);

        // return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.card_view, parent, false));

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        clienteHelpClass ch = clienteHelpClassList.get(position);
        holder.nameCustomer.setText(ch.getNameCust());
        holder.SSN.setText(ch.getContribuinte());
        holder.telemovel.setText(ch.getContact());
        holder.custMorada.setText(ch.getCustAddress());
        holder.custIdade.setText(ch.getCustAddress());
        holder.custTemp.setText(ch.getTemp());


    }

    @Override
    public int getItemCount() {
        return clienteHelpClassList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        private  TextView nameCustomer, SSN, telemovel, custMorada,custIdade,custTemp;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nameCustomer = (TextView) itemView.findViewById(R.id.nameCustomer);
            SSN = (TextView) itemView.findViewById(R.id.SSN);
            telemovel = (TextView) itemView.findViewById(R.id.telemovel);
            custMorada = (TextView) itemView.findViewById(R.id.custMorada);
            custIdade =(TextView) itemView.findViewById(R.id.custIdade);
            custTemp =(TextView) itemView.findViewById(R.id.custTemp);
        }
    }
}
