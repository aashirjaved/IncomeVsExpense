package com.example.tayyaba.incomeexpenses.IncomeViewPager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tayyaba.incomeexpenses.IncomeViewPager.RecyclerView_Details_Income.Adapter_Details_Income;
import com.example.tayyaba.incomeexpenses.R;

/**
 * Created by Tayyaba on 9/26/2016.
 */
public class Fragment_DetailsInc extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static Fragment_DetailsInc newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        Fragment_DetailsInc fragment = new Fragment_DetailsInc();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    // Inflate the fragment layout we defined above for this fragment
    // Set the associated text for the title
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle args = getArguments();
        View view = inflater.inflate(R.layout.fragment_details_inc, container, false);
        //  TextView tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        //  tvTitle.setText("Fragment #" + mPage);

        RecyclerView recyclerView_details_inc=(RecyclerView)view.findViewById(R.id.recyclerView_details_income);
        recyclerView_details_inc.setLayoutManager(new LinearLayoutManager(getActivity()));
        Adapter_Details_Income adapter_details_income=new Adapter_Details_Income(getActivity());

        recyclerView_details_inc.setAdapter(adapter_details_income);
        return view;
    }
}