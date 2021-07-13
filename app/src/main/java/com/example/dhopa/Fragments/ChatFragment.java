package com.example.dhopa.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dhopa.Adapter.AdapterChat;
import com.example.dhopa.BottomNavActivity;
import com.example.dhopa.Model.ModelChat;
import com.example.dhopa.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {
    Toolbar toolbar;
    RecyclerView msgrecyclerView;
    private AdapterChat adapterChat;
    FloatingActionButton msgSendButton;
    private List<ModelChat> msgList = new ArrayList<ModelChat>();
    public ChatFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_chat, container, false);
        msgrecyclerView = view.findViewById(R.id.rvChat);
        toolbar = view.findViewById(R.id.toolbarChat);

        //toolbarclick
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_baseline_arrow_back_ios_24));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //What to do on back clicked
                Toast.makeText(getContext(), "back", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), BottomNavActivity.class);
                startActivity(intent);
            }
        });

        // Create the initial data list.

        ModelChat msgChat = new ModelChat(ModelChat.MSG_TYPE_SENT, "Lorem ipsum dolor sit amet, consecteur elit, sed do eiusmod tempor incididunt");
        msgList.add(msgChat);
        msgChat = new ModelChat(ModelChat.MSG_TYPE_RECEIVED, "Lorem ipsum dolor sit amet, consecteur elit, sed do eiusmod tempor incididunt");
        msgList.add(msgChat);
        msgChat = new ModelChat(ModelChat.MSG_TYPE_SENT, "Lorem ipsum dolor sit amet, consecteur elit, sed do eiusmod tempor incididunt");
        msgList.add(msgChat);
        msgChat = new ModelChat(ModelChat.MSG_TYPE_RECEIVED, "Lorem ipsum dolor sit amet, consecteur elit, sed do eiusmod tempor incididunt");
        msgList.add(msgChat);

        adapterChat = new AdapterChat(msgList);
        msgrecyclerView.setAdapter(adapterChat);


        final EditText msgInputText = view.findViewById(R.id.chat_input_msg);
        msgSendButton = view.findViewById(R.id.chat_send_msg);
        msgSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msgContent = msgInputText.getText().toString();
                if (!TextUtils.isEmpty(msgContent)) {
                    // Add a new sent message to the list.
                    ModelChat msgDto = new ModelChat(ModelChat.MSG_TYPE_SENT, msgContent);
                    msgList.add(msgDto);
                    int newMsgPosition = msgList.size() - 1;
                    // Notify recycler view insert one new data.
                    adapterChat.notifyItemInserted(newMsgPosition);
                    // Scroll RecyclerView to the last message.
                    msgrecyclerView.scrollToPosition(newMsgPosition);
                    // Empty the input edit text box.
                    msgInputText.setText("");
                }
            }
        });

        return view;
    }
}