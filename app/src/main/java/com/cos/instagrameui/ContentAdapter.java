package com.cos.instagrameui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ContentViewHolder>{
    private final List<Content> contents;

    public ContentAdapter(List<Content> contents) {
        this.contents = contents;
    }

    @NonNull
    @Override
    public ContentAdapter.ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.content_item, parent, false);
        return new ContentAdapter.ContentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContentAdapter.ContentViewHolder holder, int position) {
        holder.setItem(contents.get(position));
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    public static class ContentViewHolder extends RecyclerView.ViewHolder {

        private TextView tvUsername, tvUsernameContent;
        private CircleImageView civProfile;
        private ImageView ivContent;

        public ContentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUsername = itemView.findViewById(R.id.tv_username);
            civProfile = itemView.findViewById(R.id.civ_profile);
            ivContent = itemView.findViewById(R.id.iv_content);
            tvUsernameContent = itemView.findViewById(R.id.tv_username_content);
        }

        public void setItem(Content content) {
            tvUsername.setText(content.getUsername());
            tvUsernameContent.setText(content.getUsername());
            civProfile.setImageResource(content.getProfileImgSrc());
            ivContent.setImageResource(content.getContentImgSrc());
        }
    }
}
