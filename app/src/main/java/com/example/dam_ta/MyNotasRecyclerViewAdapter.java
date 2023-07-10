package com.example.dam_ta;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.dam_ta.databinding.FragmentItemBinding;

import java.util.List;


public class MyNotasRecyclerViewAdapter extends RecyclerView.Adapter<MyNotasRecyclerViewAdapter.ViewHolder> {

    private final List<Nota> mValues;
    private  final NotasInteractionListener mListener;

    public MyNotasRecyclerViewAdapter(List<Nota> notaList, NotasInteractionListener mListener) {
        this.mValues = notaList;
        this.mListener = mListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.tvTitulo.setText(holder.mItem.getTitulo());
        holder.tvContenido.setText(holder.mItem.getContenido());
        if(holder.mItem.isFavorito()) {
            holder.ivFavorita.setImageResource(R.drawable.baseline_star_24);
        }
        holder.ivFavorita.setOnClickListener(v->{
            if(null != mListener){
                mListener.favoritoNotaClick(holder.mItem);
            }
        });




    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

       public final View mview;
        public final TextView tvTitulo;
        public final TextView tvContenido;
        public Nota mItem;
        public final ImageView ivFavorita;

        public ViewHolder(View view) {
            super(view);
            mview=view;
            tvTitulo = view.findViewById(R.id.textViewTitulo);
            tvContenido = view.findViewById(R.id.textViewContenido);
            ivFavorita = view.findViewById(R.id.imageViewFavorito);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + tvTitulo.getText() + "'";
        }
    }
}