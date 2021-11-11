package com.ennovations.fitcru.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.Transformation;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ennovations.fitcru.R;
import com.ennovations.fitcru.pojo.NutritionTrack;
import com.ennovations.fitcru.util.CustomProgressBar;

public class NutritionTrackAdapter  extends RecyclerView.Adapter<NutritionTrackAdapter.ViewHolder>{

    private NutritionTrack[] listdata;
    CustomProgressBar pb;

    public NutritionTrackAdapter(NutritionTrack[] listdata) {
        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.layout_foods_nutrition, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    private void startAnimation() {
        ProgressBarAnimation localProgressBarAnimation = new ProgressBarAnimation(0.0F, 75.0F);
        localProgressBarAnimation.setInterpolator(new OvershootInterpolator(0.5F));
        localProgressBarAnimation.setDuration(4000L);
        pb.startAnimation(localProgressBarAnimation);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final NutritionTrack myListData = listdata[position];

        holder.textView_time.setText(listdata[position].getTime());
        holder.textView_cal.setText(listdata[position].getKcal());
        holder.textView_meal.setText(listdata[position].getMeal_type());

    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView_time, textView_cal, textView_meal;
        CustomProgressBar pb;
        public ViewHolder(View itemView) {
            super(itemView);
            this.textView_time = (TextView) itemView.findViewById(R.id.text_time);
            this.textView_cal = (TextView) itemView.findViewById(R.id.text_cal);
            this.textView_meal = (TextView) itemView.findViewById(R.id.text_nutrition);
            this.pb = (CustomProgressBar) itemView.findViewById(R.id.pb);

        }
    }


    private class ProgressBarAnimation extends Animation {
        private float from;
        private float to;

        public ProgressBarAnimation(float from, float to) {
            this.from = from;
            this.to = to;
        }

        protected void applyTransformation(float paramFloat, Transformation paramTransformation) {
            super.applyTransformation(paramFloat, paramTransformation);
            float f = this.from + paramFloat * (this.to - this.from);
            pb.setProgress(44);
        }
    }

}
