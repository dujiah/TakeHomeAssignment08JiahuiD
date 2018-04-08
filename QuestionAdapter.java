package com.example.du.takehomeassignment08_jiahuid;

/**
 * Created by du on 3/24/18.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionViewHolder> {
    private List<Question> questions;
    private Context context;

    public QuestionAdapter(List<Question> questions, Context context) {
        this.questions = questions;
        this.context = context;
    }


    @Override
    public QuestionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_skull, parent, false);
        return new QuestionViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(QuestionViewHolder holder, int position) {
        Question question = questions.get(position);
        holder.questionSkull.setText(question.location);
        holder.skullQuestion.setText(question.question);
        holder.skullImage.setImageResource(question.photoId);
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

}
