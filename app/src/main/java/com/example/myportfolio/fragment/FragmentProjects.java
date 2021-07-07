package com.example.myportfolio.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.myportfolio.AdapterClient;
import com.example.myportfolio.ClientModel;
import com.example.myportfolio.R;

import java.util.ArrayList;
import java.util.List;


public class FragmentProjects extends Fragment {

    List<ClientModel> clientModels;
    GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_projects, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gridView = view.findViewById(R.id.gridView);
        clientModels = new ArrayList<>();

        clientModels.add(new ClientModel("Amazon", R.drawable.amazon));
        clientModels.add(new ClientModel("Apple", R.drawable.apple));
        clientModels.add(new ClientModel("Bitcoin", R.drawable.bitcoin));
        clientModels.add(new ClientModel("Cpanel", R.drawable.cpanel));
        clientModels.add(new ClientModel("FireFox", R.drawable.firefox));
        clientModels.add(new ClientModel("Google", R.drawable.google));
        clientModels.add(new ClientModel("Paypal", R.drawable.paypal));
        clientModels.add(new ClientModel("PInterest", R.drawable.pinterest));
        clientModels.add(new ClientModel("Twitter", R.drawable.twitter));
        clientModels.add(new ClientModel("Whatsapp", R.drawable.whatsapp));
        clientModels.add(new ClientModel("Microsoft", R.drawable.microsoft));
        clientModels.add(new ClientModel("Wordpress", R.drawable.wordpress));

        AdapterClient adapterClient = new AdapterClient(getContext(), clientModels);
        gridView.setAdapter(adapterClient);



    }
}