package com.mahmoud.dahdouh.sidebarmotionlayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewholder> {

    private List<TextItem> TextItemList = new ArrayList<>();

    public void setTextItemList(List<TextItem> TextItemList) {
        this.TextItemList = TextItemList;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewholder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return TextItemList.size();
    }

    class MyViewholder extends RecyclerView.ViewHolder {

        // Declere your views
        private TextView textView;
        private ImageView img;

        public MyViewholder(@NonNull View itemView) {
            super(itemView);

            // inflate the view
            textView = itemView.findViewById(R.id.listitem_text);
            img = itemView.findViewById(R.id.listitem_img);
        }

        private void bind(int position) {
            // Bind data
            textView.setText(TextItemList.get(position).getText());
            img.setImageResource(TextItemList.get(position).getImg());
        }
    }
}
