package com.android.sms;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.dialer.R;
import com.moez.QKSMS.common.Navigator;
import com.moez.QKSMS.common.widget.GroupAvatarView;
import com.moez.QKSMS.common.widget.QkTextView;
import com.moez.QKSMS.model.Conversation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<Conversation> conversationList = new ArrayList<>();
    private Navigator navigator;

    public SmsAdapter(Context context, List<Conversation> conversationList, Navigator navigator) {
        this.context = context;
        this.navigator = navigator;
        this.conversationList = conversationList;
    }

    private class SmsAdapterItem extends RecyclerView.ViewHolder {
        QkTextView title;
        QkTextView snipper, date;
        GroupAvatarView avt;

        public SmsAdapterItem(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            snipper = itemView.findViewById(R.id.snippet);
            date = itemView.findViewById(R.id.date);
            avt = itemView.findViewById(R.id.avatars);
        }

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SmsAdapterItem(LayoutInflater.from(context).inflate(R.layout.conversation_list_item, parent, false));
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SmsAdapterItem smsAdapterItem = (SmsAdapterItem) holder;
        smsAdapterItem.title.setText(conversationList.get(position).getTitle());
        smsAdapterItem.snipper.setText(conversationList.get(position).getSnippet());
        String dateString = new SimpleDateFormat("MM/dd/yyyy").format(new Date(conversationList.get(position).getDate()));
        smsAdapterItem.date.setText(dateString);
        smsAdapterItem.avt.setRecipients(conversationList.get(position).getRecipients());
        if (conversationList.get(position).getUnread()){
            smsAdapterItem.date.setTextColor(Color.BLACK);
            smsAdapterItem.title.setTextColor(Color.BLACK);
            smsAdapterItem.snipper.setTextColor(Color.BLACK);
            smsAdapterItem.date.setTypeface(Typeface.DEFAULT_BOLD);
            smsAdapterItem.title.setTypeface(Typeface.DEFAULT_BOLD);
            smsAdapterItem.snipper.setTypeface(Typeface.DEFAULT_BOLD);
        }else {
            smsAdapterItem.itemView.setBackgroundColor(Color.TRANSPARENT);
        }
        smsAdapterItem.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigator.showConversation(conversationList.get(position).getId(),"");
            }
        });
        smsAdapterItem.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public boolean onLongClick(View v) {
                smsAdapterItem.itemView.setBackgroundColor(R.color.black);
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return conversationList.size();
    }
}
