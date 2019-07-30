package com.girish.androidui.adpters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.girish.androidui.R;
import com.girish.androidui.modale.HorizontalItems;
import com.squareup.picasso.Picasso;

import java.util.List;

public class VirtcalAdapter extends RecyclerView.Adapter<VirtcalAdapter.IconViewHolder>{

    private Context context;
    private List<HorizontalItems> iconItems;

    public VirtcalAdapter(Context context, List<HorizontalItems> iconItems) {
        this.context = context;
        this.iconItems = iconItems;
    }

    @NonNull
    @Override
    public IconViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.vertical_item,viewGroup,false);
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
