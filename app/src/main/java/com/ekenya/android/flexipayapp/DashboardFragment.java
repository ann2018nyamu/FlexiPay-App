package com.ekenya.android.flexipayapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DashboardFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DashboardFragment extends Fragment {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerViewAdapter recyclerViewAdapter;



    int []arr={R.drawable.flexipay_merchants,R.drawable.flexipay_send_money,R.drawable.flexipay_merchants,
            R.drawable.flexipay_accounts,R.drawable.flexipay_wallet,R.drawable.flexipay_bill,R.drawable.flexipay_sacco,
            R.drawable.flexipay_accounts,R.drawable.flexipay_wallet,R.drawable.flexipay_bill,R.drawable.flexipay_sacco,
            R.drawable.flexipay_accounts,R.drawable.flexipay_wallet,R.drawable.flexipay_bill,R.drawable.flexipay_sacco,
            R.drawable.flexipay_accounts,R.drawable.flexipay_wallet,R.drawable.flexipay_bill,R.drawable.flexipay_sacco,
            R.drawable.flexipay_accounts,R.drawable.flexipay_wallet,R.drawable.flexipay_bill,R.drawable.flexipay_sacco,
            R.drawable.flexi_cards,R.drawable.flexipay_loan};

    String[] names={"Buy Airtime", "Send Money",
            "PayMerchant", "My Accounts", "Fund Wallet", "Pay Bills",
            "Flexi_Sacco", "Flexi_cards", "Flexipay_loan"};



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DashboardFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DashboardFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DashboardFragment newInstance(String param1, String param2) {
        DashboardFragment fragment = new DashboardFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
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
        View rootView = inflater.inflate(R.layout.fragment_dashboard, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerview);
        layoutManager=new GridLayoutManager(getActivity(),3);

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter=new RecyclerViewAdapter(arr,names);

        recyclerView.setAdapter(recyclerViewAdapter);

        recyclerView.setHasFixedSize(true);
    }
}