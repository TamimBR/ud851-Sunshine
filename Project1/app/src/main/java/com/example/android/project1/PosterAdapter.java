package com.example.android.project1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by the Legendary TB on 21/01/2018.
 */

public class PosterAdapter extends RecyclerView.Adapter<PosterAdapter.PosterAdapterViewHolder> {
    private String [] PosterURLs;
    private ImageView mPoster;

    public PosterAdapter () {

    }


    public class PosterAdapterViewHolder extends RecyclerView.ViewHolder {
       // public final ImageView mPoster;

        public PosterAdapterViewHolder(View itemView) {
            super(itemView);
            mPoster = itemView.findViewById(R.id.image_data);

        }
    }

    @Override
    public PosterAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.poster_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);

        View view= inflater.inflate(layoutIdForListItem,parent,false);

        return new PosterAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PosterAdapterViewHolder holder, int position) {
        String thisPosterURL = PosterURLs[position];
        Context context = mPoster.getContext();
        Picasso.with(context).load(thisPosterURL).into(mPoster);
    }

    @Override
    public int getItemCount() {
        if (PosterURLs==null) return 0;
        return PosterURLs.length;
    }

    public void setPosterURLs () {
        String LocalPosterURLs[] = new String [6];
        LocalPosterURLs[0] = "http://image.tmdb.org/t/p/w185//nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg";
        LocalPosterURLs[1] = "http://i.imgur.com/DvpvklR.png";
        LocalPosterURLs[2] ="http://malcolmx.com/wp-content/uploads/2015/02/portrait.jpg";
        LocalPosterURLs[3] ="http://www.sahistory.org.za/sites/default/files/bio_pics/nelson_rolihlahla_mandela.jpg";
        LocalPosterURLs[4] = "https://cdn.face2faceafrica.com/www/wp-content/uploads/2014/06/Marcus-Garvey-e1370904416622.jpg";
        LocalPosterURLs[5] = "http://www.afrocentricite.com/wp-content/uploads/2009/07/patrice-lumumba-en-portrait.jpg";
        PosterURLs = LocalPosterURLs;

    }
}
