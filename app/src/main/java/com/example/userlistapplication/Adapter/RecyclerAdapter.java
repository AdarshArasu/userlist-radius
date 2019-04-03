package com.example.userlistapplication.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.userlistapplication.R;
import com.example.userlistapplication.Model.Model;
import com.squareup.picasso.Picasso;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private Model model;
    private Context mContext;


    public RecyclerAdapter(Context mContext, Model model) {
        this.mContext = mContext;
        this.model = model;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if(model.getResults().get(position).getName().getFirst()!=null && model.getResults().get(position).getName().getLast()!=null) {
            holder.tv_name.setText("Name: "+model.getResults().get(position).getName().getLast()+" "+model.getResults().get(position).getName().getFirst());
        }
        if(model.getResults().get(position).getDob().getAge()!=null){
            holder.tv_age.setText("Age: "+model.getResults().get(position).getDob().getAge());
        }
        if(model.getResults().get(position).getCell()!=null){
            holder.tv_mobile.setText("Mobile: "+model.getResults().get(position).getCell());
        }
        if(model.getResults().get(position).getPicture().getLarge()!=null){
            Picasso.with(mContext).load(model.getResults().get(position).getPicture().getLarge()).resize(100, 100).into(holder.imageView);
        }
    }

    @Override
    public int getItemCount() {
        return model.getResults().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_name, tv_age, tv_mobile;
        ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.imageView);
            tv_name = view.findViewById(R.id.tv_name);
            tv_age = view.findViewById(R.id.tv_age);
            tv_mobile = view.findViewById(R.id.tv_mobile);
        }
    }
}