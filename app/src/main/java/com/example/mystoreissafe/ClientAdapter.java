package com.example.mystoreissafe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClientAdapter extends RecyclerView.Adapter<ClientAdapter.MyViewHolder> {
    Context context;
    ArrayList<clienteHelpClass> cliente;

    public ClientAdapter(Context c, ArrayList<clienteHelpClass> Cust){
        context = c;
        cliente = Cust;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.card_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameCustomer.setText(cliente.get(position).getNameCust());
        holder.SSN.setText(cliente.get(position).getContribuinte());
        holder.telemovel.setText(cliente.get(position).getContact());
        holder.custMorada.setText(cliente.get(position).getCustAddress());
        holder.custIdade.setText(cliente.get(position).getCustAddress());
        holder.custTemp.setText(cliente.get(position).getTemp());

    }

    @Override
    public int getItemCount() {
        return cliente.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nameCustomer, SSN, telemovel, custMorada,custIdade,custTemp;
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
