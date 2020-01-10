package com.mahmoud.dahdouh.sidebarmotionlayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TopAdapter extends RecyclerView.Adapter<TopAdapter.TopViewholder> {

    private List<TopItem> TopItemList = new ArrayList<>();

    public void setTopItemList(List<TopItem> TopItemList) {
        this.TopItemList = TopItemList;
    }

    @NonNull
    @Override
    public TopViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TopViewholder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.top_listitem, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TopViewholder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return TopItemList.size();
    }

    class TopViewholder extends RecyclerView.ViewHolder {

        // Declere your views
        private ImageView image;

        public TopViewholder(@NonNull View itemView) {
            super(itemView);

            // inflate the view
            image = itemView.findViewById(R.id.top_item_img);
        }

        private void bind(int position) {
            // Bind data
            image.setImageResource(TopItemList.get(position).getImg());
        }
    }
}
