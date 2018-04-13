//package com.example.ha_hai.democoordinatorandbottomsheet;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import java.util.List;
//
///**
// * Created by ha_hai on 4/12/2018.
// */
//
//public class ListAdapter extends RecyclerView.Adapter<ListViewHolder> {
//
//    Context context;
//    List<String> listData;
//
//    public ListAdapter(Context context, List<String> listData) {
//        this.context = context;
//        this.listData = listData;
//    }
//
//    @Override
//    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
////        View itemView  = inflater.inflate(R.layout.item_row, parent, false);
//        return new ListViewHolder(itemView);
//    }
//
//    @Override
//    public void onBindViewHolder(ListViewHolder holder, int position) {
//        holder.txtData.setText(listData.get(position));
//    }
//
//    @Override
//    public int getItemCount() {
//        return listData.size();
//    }
//}
//
//class ListViewHolder extends RecyclerView.ViewHolder {
//    TextView txtData;
//
//    public ListViewHolder(View itemView) {
//        super(itemView);
//        txtData = itemView.findViewById(R.id.txtData);
//    }
//}
