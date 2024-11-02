package com.example.fusmobilni.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.fusmobilni.R;
import com.example.fusmobilni.databinding.EventFragmentSearchBinding;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EventSearchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EventSearchFragment extends Fragment {

    private EventFragmentSearchBinding _binding;
    private SearchView _searchView;
    private SearchBar _searchBar;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EventSearchFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SearchFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EventSearchFragment newInstance(String param1, String param2) {
        EventSearchFragment fragment = new EventSearchFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this._binding = EventFragmentSearchBinding.inflate(inflater,container,false);
        View view = this._binding.getRoot();

        this._searchView = this._binding.eventsSearchView;
        this._searchBar = this._binding.eventsSearchBar;

        this._searchBar.setOnClickListener(v->{
            this._searchView.setVisibility(View.VISIBLE);
            this._searchView.requestFocus();

        });

        return view;
    }
}