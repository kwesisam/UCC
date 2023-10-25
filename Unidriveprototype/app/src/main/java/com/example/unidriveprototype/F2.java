package com.example.unidriveprototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link //Fragment} subclass.
 * Use the {@link //F2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class F2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public F2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param// param1 Parameter 1.
     * @param //param2 Parameter 2.
     * @return A new instance of fragment F2.
     */
    // TODO: Rename and change types and number of parameters
   /* public static F2 newInstance(String param1, String param2) {
        F2 fragment = new F2();
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
    }*/

    private LinearLayout bookRide;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View run = inflater.inflate(R.layout.fragment_f2, container, false);
        bookRide = run.findViewById(R.id.bookRide);
        bookRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), BookRide.class);
                startActivity(intent);

            }
        });
        return run;
    }
}