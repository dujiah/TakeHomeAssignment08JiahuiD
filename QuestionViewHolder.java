package com.example.du.takehomeassignment08_jiahuid;

/**
 * Created by du on 3/24/18.
 */

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class QuestionViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView questionSkull;
    public TextView skullQuestion;
    public ImageView skullImage;


    public QuestionViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = itemView.findViewById(R.id.card_view);
        questionSkull = itemView.findViewById(R.id.question_skull);
        skullQuestion = itemView.findViewById(R.id.skull_question);
        skullImage = itemView.findViewById(R.id.skull_image);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, questionSkull.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
