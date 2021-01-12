package com.muneeb_dev.mvvmapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.muneeb_dev.mvvmapplication.Models.User_DataList;

import java.util.List;

public class RV_Adapter extends RecyclerView.Adapter<RV_Adapter.RV_ViewHolder> {

    /////////// Declare User List /////////////////////
    private List<User_DataList> userArrayList;
    Activity activity;

    public RV_Adapter(List<User_DataList> userArrayList, Activity activity) {
        this.userArrayList = userArrayList;
        this.activity = activity;
    }


    @NonNull
    @Override
    public RV_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RV_ViewHolder(LayoutInflater.from(activity).inflate(R.layout.user_list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RV_ViewHolder holder, int position) {

        String Title_d = userArrayList.get(position).getTitle();
        String Body_d = userArrayList.get(position).getBody();

        if (Title_d != null && !Title_d.isEmpty()) {
            holder.Title.setText(Title_d);
        } else {
            holder.Title.setText("N/A");
        }

        if (Body_d != null && !Body_d.isEmpty()) {
            holder.Body.setText(Body_d);
        } else {
            holder.Body.setText("N/A");
        }

    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public class RV_ViewHolder extends RecyclerView.ViewHolder {

        TextView Title , Body;

        public RV_ViewHolder(@NonNull View itemView) {

            super(itemView);

            Title = itemView.findViewById(R.id.tv_Title);
            Body = itemView.findViewById(R.id.tv_Body);


        }
    }
}
