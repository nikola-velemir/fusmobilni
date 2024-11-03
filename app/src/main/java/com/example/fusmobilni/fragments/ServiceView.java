package com.example.fusmobilni.fragments;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fusmobilni.R;
import com.example.fusmobilni.databinding.FragmentServiceCreationBinding;
import com.example.fusmobilni.databinding.FragmentServiceViewBinding;

import java.lang.reflect.Field;


public class ServiceView extends Fragment {

    FragmentServiceViewBinding binding;

    public ServiceView() {
        // Required empty public constructor
    }

    public static ServiceView newInstance(String param1, String param2) {
        ServiceView fragment = new ServiceView();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentServiceViewBinding.inflate(inflater, container, false);
        View view = binding.getRoot();


        return view;
    }
}