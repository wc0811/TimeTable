package com.yueping.timetable.module.course.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yueping.timetable.R
import com.yueping.timetable.databinding.ItemCourseBinding

class CourseViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.item_course, parent, false)
) {
    val binding = ItemCourseBinding.bind(itemView)
}