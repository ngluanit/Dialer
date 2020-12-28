package com.android.sms;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.dialer.DialtactsActivity;
import com.android.dialer.R;
import com.android.dialer.util.Constant;

public class SmsFragment extends Fragment {
    RecyclerView recyclerView;
    SmsAdapter smsAdapter;
    DialtactsActivity dialtactsActivity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.sms_fragment,container,false);
        recyclerView=view.findViewById(R.id.recyclerView);
        dialtactsActivity=(DialtactsActivity) getActivity();
        System.out.println("mmmmmmm"+Constant.conversationList.size());;
        smsAdapter=new SmsAdapter(getContext(),Constant.conversationList,dialtactsActivity.navigator);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(smsAdapter);
        return view;
    }


}