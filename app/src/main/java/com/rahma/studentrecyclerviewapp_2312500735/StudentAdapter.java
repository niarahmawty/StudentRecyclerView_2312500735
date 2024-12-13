package com.rahma.studentrecyclerviewapp_2312500735;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    private final List<Student> studentList;

    public StudentAdapter(List<Student> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_student, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = studentList.get(position);
        holder.tvNim.setText(student.getNim());
        holder.tvName.setText(student.getName());
        holder.tvEmail.setText(student.getEmail());
        holder.tvBirthDate.setText(student.getBirthDate());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    static class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView tvNim, tvName, tvEmail, tvBirthDate;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNim = itemView.findViewById(R.id.tvNim);
            tvName = itemView.findViewById(R.id.tvName);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            tvBirthDate = itemView.findViewById(R.id.tvBirthDate);
        }
    }
}
