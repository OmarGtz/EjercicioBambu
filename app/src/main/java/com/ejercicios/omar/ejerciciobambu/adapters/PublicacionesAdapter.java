package com.ejercicios.omar.ejerciciobambu.adapters;

        import android.support.v7.widget.RecyclerView;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;
        import com.ejercicios.omar.ejerciciobambu.R;
        import com.ejercicios.omar.ejerciciobambu.models.Publicaciones;

        import java.util.List;

        import de.hdodenhof.circleimageview.CircleImageView;



public class PublicacionesAdapter extends RecyclerView.Adapter<PublicacionesAdapter.ViewHolder> {

    List<Publicaciones> publicaciones;

    //inicializamos en el constructor la lista de publicacion
    public PublicacionesAdapter(List<Publicaciones>publicaciones){
        this.publicaciones = publicaciones;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //establecemos el diseño para cada elemento del recyclerView
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_publicacion,parent,false);


        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //agregasmos valores a las vistas
        holder.bind(publicaciones.get(position));

    }

    @Override
    public int getItemCount() {
        //retornamos el taamaño de la lista
        return publicaciones.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        //variables
        private CircleImageView imgPerfil;
        private TextView tvNombre;
        private TextView tvFecha;
        private TextView tvContenido;
        private TextView tvFavoritos;
        private TextView tvComentarios;



        public ViewHolder(View itemView) {
            super(itemView);

            initViews(itemView);

        }


        //inicializamos las view
        public void initViews(View itemView){

            tvNombre = (TextView)itemView.findViewById(R.id.publicacion_nombre);
            tvFecha = (TextView)itemView.findViewById(R.id.publicacion_fecha);
            tvContenido = (TextView)itemView.findViewById(R.id.publicacion_contenido);
            tvFavoritos = (TextView) itemView.findViewById(R.id.publicacion_favoritos);
            tvComentarios = (TextView)itemView.findViewById(R.id.publicacion_comentarios);
            imgPerfil = (CircleImageView)itemView.findViewById(R.id.publicacion_img);

        }

        //seteamos las view
        public void bind(final Publicaciones publicacion){
            tvNombre.setText(publicacion.getNombre());
            tvFecha.setText(publicacion.getFecha());
            tvContenido.setText(publicacion.getContenido());
            tvFavoritos.setText(String.valueOf(publicacion.getFavoritos()));
            tvComentarios.setText(publicacion.getComentarios());
            imgPerfil.setImageResource(publicacion.getImgPerfil());
        }
    }
}