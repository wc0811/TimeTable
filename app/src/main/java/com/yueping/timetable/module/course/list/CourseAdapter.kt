package com.yueping.timetable.module.course.list

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yueping.timetable.module.course.data.CourseEntity

class CourseAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var list: MutableList<CourseEntity> = mutableListOf()

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(list: MutableList<CourseEntity>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        CourseViewHolder(parent)

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]
        if (holder is CourseViewHolder) {
            with(holder.binding) {
                tvName.text = item.name
                tvGrade.text = item.grade
                tvSex.text = item.sex
                tvSchool.text = item.school
                tvScore.text = item.score
                tvCultivate.text = item.cultivate
                tvCourseTime.text = item.courseTime
                tvClassHour.text = item.classHour
                tvSummaryClassHour.text = item.summaryClassHour
                tvSummaryNumber.text = item.summaryNumber
                tvSummary.text = item.summary
                tvRemarks.text = item.remarks
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}