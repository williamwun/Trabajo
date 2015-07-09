package upc.com.pe.trabajo.models;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import upc.com.pe.trabajo.R;
import upc.com.pe.trabajo.activities.ComponentsActivity;
/**
 * Created by William on 09/07/2015.
 */
public class ComputersAdapter extends RecyclerView.Adapter<ComputersAdapter.ViewHolder> {
    ArrayList<Computer> computers;

    public ComputersAdapter(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    @Override
    public ComputersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.computer_row_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ComputersAdapter.ViewHolder holder, final int position) {
        holder.computerNameTextView.setText(computers.get(position).getcomputerName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.printf("Selected position: %d%n", position);
                Intent componentActivityIntent = new Intent(view.getContext(), ComponentsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("computerId", computers.get(position).getComputerId());
                bundle.putString("computerName", computers.get(position).getcomputerName());
                componentActivityIntent.putExtras(bundle);
                view.getContext().startActivity(componentActivityIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return computers.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView computerNameTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            computerNameTextView = (TextView) itemView.findViewById(R.id.computerNameTextView);
        }
    }

}
