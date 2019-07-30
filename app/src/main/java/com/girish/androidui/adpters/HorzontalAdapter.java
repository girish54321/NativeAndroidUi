package com.girish.androidui.adpters;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.girish.androidui.R;
import com.girish.androidui.modale.HorizontalItems;
import com.squareup.picasso.Picasso;

import java.util.Collections;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

import static java.lang.String.valueOf;

public class HorzontalAdapter extends RecyclerView.Adapter<HorzontalAdapter.IconViewHolder>{

    private Context context;
    private List<HorizontalItems> iconItems;

    public HorzontalAdapter(Context context, List<HorizontalItems> iconItems) {
        this.context = context;
        this.iconItems = iconItems;
    }

    @NonNull
    @Override
    public IconViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.horizontal_item,viewGroup,false);
        return new IconViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull final IconViewHolder iconViewHolder, final int i) {


        Picasso.get()
                .load(iconItems.get(i).getImageUrl())
                .placeholder(R.drawable.rounded)
                .error(R.drawable.rounded)
                .into(iconViewHolder.imageView);

        iconViewHolder.title.setText(iconItems.get(i).getTitle());
        iconViewHolder.textView.setText(iconItems.get(i).getLoction());



    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return iconItems.size();
    }


    public class IconViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView,title;
        public IconViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.textView);
            title = itemView.findViewById(R.id.title1);
        }

    }


}
