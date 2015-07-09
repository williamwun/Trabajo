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
public class ComputersAdapter extends RecyclerView.Adapter<LaboratoriesAdapter.ViewHolder> {
    ArrayList<Laboratory> laboratories;

    public LaboratoriesAdapter(ArrayList<Laboratory> laboratories) {
        this.laboratories = laboratories;
    }

    @Override
    public LaboratoriesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.laboratory_row_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(LaboratoriesAdapter.ViewHolder holder, final int position) {
        holder.laboratoryNameTextView.setText(laboratories.get(position).getLaboratoryName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.printf("Selected position: %d%n", position);
                Intent computerActivityIntent = new Intent(view.getContext(), ComputersActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("laboratoryId", laboratories.get(position).getLaboratoryId());
                bundle.putString("laboratoryName", laboratories.get(position).getLaboratoryName());
                computerActivityIntent.putExtras(bundle);
                view.getContext().startActivity(computerActivityIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return laboratories.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView laboratoryNameTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            laboratoryNameTextView = (TextView) itemView.findViewById(R.id.laboratoryNameTextView);
        }
    }

}
