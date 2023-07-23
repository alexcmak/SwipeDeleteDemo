package com.alexcmak.swipedeletedemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


class ItemDataAdapter extends RecyclerView.Adapter<ItemDataAdapter.ItemViewHolder> {

    public List<Item> items;

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView item;

        public ItemViewHolder(View view) {
            super(view);

            item = (TextView) view.findViewById(R.id.item);
        }
    }

    public ItemDataAdapter(List<Item> items) {
        this.items = items;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);

        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item g = items.get(position);
        holder.item.setText(g.getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}

