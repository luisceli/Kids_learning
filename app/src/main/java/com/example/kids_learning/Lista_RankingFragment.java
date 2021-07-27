package com.example.kids_learning;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Lista_RankingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Lista_RankingFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Lista_RankingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Lista_RankingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Lista_RankingFragment newInstance(String param1, String param2) {
        Lista_RankingFragment fragment = new Lista_RankingFragment();
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
        View root=inflater.inflate(R.layout.fragment_lista__ranking, container, false);
        String  d[]={"Wilmer Carrion     5200","Juan Gomez     5100","Andres Ruiz     5000","Mateo Dante     4900","Dandiel Tacuri     4800","Carlos Juca      4700", "Daniel Mazias      4600","Danilo Jaramillo       4500","Manue Gonsalez      4400","Jaime Celi       4300","Umberto Acaro       4200","Paulo Londra       4100"};

        ListView ls= (ListView) root.findViewById(R.id.list_ranking);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1,
                d
        );
        ls.setAdapter(adapter);








        return root;
    }
}