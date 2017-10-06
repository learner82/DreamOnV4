package com.example.android.dreamonv4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by trifon on 1/10/2017.
 */

public class PortfolioListFragmant extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.portfolio_list, container, false);
        final ArrayList<Photograph> photos = new ArrayList<>();
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a01));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a02));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a03));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a04));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a05));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a06));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a07));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a08));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a09));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a10));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a11));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a12));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a13));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a14));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a15));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a16));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a17));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a18));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a19));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a20));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a21));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a22));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a23));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a24));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a25));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a26));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a27));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a28));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a29));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a30));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a31));
        photos.add(new Photograph(R.string.names, R.string.date, R.string.place, R.drawable.a32));

        final PhotoAdapter itemsAdapter = new PhotoAdapter(getActivity(), photos);

        final ListView listView = (ListView) rootView.findViewById(R.id.portfolio_list);

        listView.setAdapter(itemsAdapter);



        listView.setOnItemClickListener( new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id){



                Photograph currentPhoto = itemsAdapter.getItem(position);


                Intent myIntent = new Intent(getActivity() ,FullscreenActivity.class);

                ((SelectedPhoto) getActivity().getApplication()).setSelectedPhoto(currentPhoto.getImageResourceId());
                int imageRes = ((SelectedPhoto) getActivity().getApplication()).getSelectedPhoto();


                myIntent.putExtra("currentPhoto" ,imageRes);

                myIntent.putExtra("isFullScreen", true);

                startActivity(myIntent);

            }
        });

        return rootView;

    }
    private void getIntent(Intent intent){
        if (intent!=null){
            //ImageView imageFull = (ImageView)findViewById(R.id.photo_to_be_full);
        }
    }
}
