package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplication.Classes.LoginHandler;
import com.example.myapplication.fileParsers.*;

public class AdminProfileFragment extends Fragment {

    Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_admin_profile, container, false);

        btn = view.findViewById(R.id.AdminLogOut);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                logout(container);
            }
        });

        return view;
    }
    private void logout(ViewGroup container) {
        adminWrite.addAdminLogout(LoginHandler.ADMIN.email,container.getContext());
        LoginHandler.ADMIN = null;

        startActivity(new Intent(getActivity(),UserActivity.class));
    }
}