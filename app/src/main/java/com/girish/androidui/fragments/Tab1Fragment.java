package com.girish.androidui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.girish.androidui.R;
import com.girish.androidui.adpters.HorzontalAdapter;
import com.girish.androidui.adpters.VirtcalAdapter;
import com.girish.androidui.modale.HorizontalItems;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1Fragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView recyclerView1;
    HorzontalAdapter horzontalAdapter;
    VirtcalAdapter virtcalAdapter;


    public Tab1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_tab1, container, false);

        recyclerView = view.findViewById(R.id.recylerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, true));

        recyclerView1 = view.findViewById(R.id.recylerView2);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, true));

        final List<HorizontalItems> mList = new ArrayList<>();
        mList.add(new HorizontalItems("Mumbai","India","https://smedia2.intoday.in/btmt/images/stories/mumbai-marine-drive_660_021218103435.jpg"));
        mList.add(new HorizontalItems("Mumbai","India","https://smedia2.intoday.in/btmt/images/stories/mumbai-marine-drive_660_021218103435.jpg"));
        mList.add(new HorizontalItems("Mumbai","India","https://smedia2.intoday.in/btmt/images/stories/mumbai-marine-drive_660_021218103435.jpg"));
        mList.add(new HorizontalItems("Mumbai","India","https://smedia2.intoday.in/btmt/images/stories/mumbai-marine-drive_660_021218103435.jpg"));
        mList.add(new HorizontalItems("Mumbai","India","https://smedia2.intoday.in/btmt/images/stories/mumbai-marine-drive_660_021218103435.jpg"));
        mList.add(new HorizontalItems("Mumbai","India","https://smedia2.intoday.in/btmt/images/stories/mumbai-marine-drive_660_021218103435.jpg"));
        mList.add(new HorizontalItems("Mumbai","India","https://smedia2.intoday.in/btmt/images/stories/mumbai-marine-drive_660_021218103435.jpg"));
        mList.add(new HorizontalItems("Mumbai","India","https://smedia2.intoday.in/btmt/images/stories/mumbai-marine-drive_660_021218103435.jpg"));
        mList.add(new HorizontalItems("Mumbai","India","https://smedia2.intoday.in/btmt/images/stories/mumbai-marine-drive_660_021218103435.jpg"));

        horzontalAdapter = new HorzontalAdapter(getActivity(),mList);
        recyclerView.setAdapter(horzontalAdapter);

        virtcalAdapter = new VirtcalAdapter(getActivity(),mList);
        recyclerView1.setAdapter(virtcalAdapter);

        return view;
    }

}
