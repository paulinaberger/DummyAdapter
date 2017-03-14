import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.android.mdsd2016.android.dummyadapter.R;
import org.android.mdsd2016.android.dummyadapter.item;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulinaberger on 2017-03-13.
 */

public class MyListAdapterExample extends RecyclerView.Adapter<MyListAdapterExample.ViewHolder>{

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView icon_ImgView;
        public TextView title_TxtView;
        public TextView body_TxtView;
        //three priate fields

        public ViewHolder(View itemView) {
            super(itemView);
            //three ID that are defined in the code. Go to project tab, go to resources, layout 0 and in
            //row layout.xlm we've defined how the row is going to be

            this.icon_ImgView = (ImageView) itemView.findViewById(R.id.image_view_icon); //tells system to find an ID with a referenc
            this.title_TxtView = (TextView) title_TxtView.findViewById(R.id.tv_title_row_layout);
            this.body_TxtView = (TextView) body_TxtView.findViewById(R.id.tv_body_row_layout);
        }
    }

    private Context mContext;
    private List<item> mItemList;       //item class represents the three string elements that are going to represent the info we want to show on the list

    public MyListAdapterExample(Context mContext, List<item> mItemList) {
        this.mContext = mContext;
        this.mItemList = mItemList;
    }

    @Override
    public MyListAdapterExample.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //rowView = making sure you're accessing the proper layout
        View viewRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,
                parent, false); //this inflation will return a viewHolder

        ViewHolder rowViewHolder = new ViewHolder(viewRow);
        return rowViewHolder;

    }


    @Override
    public void onBindViewHolder(MyListAdapterExample.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {

        if (mItemList !=null) {
            return this.mItemList.size();
        }
        return 0;
        //this will return the number of elements (need to make sure that we return a value and not null
    }


}