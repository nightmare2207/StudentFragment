package com.example.studentmanagerfragment.fragments

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.studentmanagerfragment.R
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public class StudentListFragmentDirections private constructor() {
  private data class ActionStudentListToAddEditStudent(
    public val studentName: String?,
    public val studentId: String?,
    public val position: Int = -1,
    public val isEdit: Boolean = false,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_studentList_to_addEditStudent

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("studentName", this.studentName)
        result.putString("studentId", this.studentId)
        result.putInt("position", this.position)
        result.putBoolean("isEdit", this.isEdit)
        return result
      }
  }

  public companion object {
    public fun actionStudentListToAddEditStudent(
      studentName: String?,
      studentId: String?,
      position: Int = -1,
      isEdit: Boolean = false,
    ): NavDirections = ActionStudentListToAddEditStudent(studentName, studentId, position, isEdit)
  }
}
