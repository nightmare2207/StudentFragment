package com.example.studentmanagerfragment.fragments

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmStatic

public data class AddEditStudentFragmentArgs(
  public val studentName: String?,
  public val studentId: String?,
  public val position: Int = -1,
  public val isEdit: Boolean = false,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("studentName", this.studentName)
    result.putString("studentId", this.studentId)
    result.putInt("position", this.position)
    result.putBoolean("isEdit", this.isEdit)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("studentName", this.studentName)
    result.set("studentId", this.studentId)
    result.set("position", this.position)
    result.set("isEdit", this.isEdit)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddEditStudentFragmentArgs {
      bundle.setClassLoader(AddEditStudentFragmentArgs::class.java.classLoader)
      val __studentName : String?
      if (bundle.containsKey("studentName")) {
        __studentName = bundle.getString("studentName")
      } else {
        throw IllegalArgumentException("Required argument \"studentName\" is missing and does not have an android:defaultValue")
      }
      val __studentId : String?
      if (bundle.containsKey("studentId")) {
        __studentId = bundle.getString("studentId")
      } else {
        throw IllegalArgumentException("Required argument \"studentId\" is missing and does not have an android:defaultValue")
      }
      val __position : Int
      if (bundle.containsKey("position")) {
        __position = bundle.getInt("position")
      } else {
        __position = -1
      }
      val __isEdit : Boolean
      if (bundle.containsKey("isEdit")) {
        __isEdit = bundle.getBoolean("isEdit")
      } else {
        __isEdit = false
      }
      return AddEditStudentFragmentArgs(__studentName, __studentId, __position, __isEdit)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        AddEditStudentFragmentArgs {
      val __studentName : String?
      if (savedStateHandle.contains("studentName")) {
        __studentName = savedStateHandle["studentName"]
      } else {
        throw IllegalArgumentException("Required argument \"studentName\" is missing and does not have an android:defaultValue")
      }
      val __studentId : String?
      if (savedStateHandle.contains("studentId")) {
        __studentId = savedStateHandle["studentId"]
      } else {
        throw IllegalArgumentException("Required argument \"studentId\" is missing and does not have an android:defaultValue")
      }
      val __position : Int?
      if (savedStateHandle.contains("position")) {
        __position = savedStateHandle["position"]
        if (__position == null) {
          throw IllegalArgumentException("Argument \"position\" of type integer does not support null values")
        }
      } else {
        __position = -1
      }
      val __isEdit : Boolean?
      if (savedStateHandle.contains("isEdit")) {
        __isEdit = savedStateHandle["isEdit"]
        if (__isEdit == null) {
          throw IllegalArgumentException("Argument \"isEdit\" of type boolean does not support null values")
        }
      } else {
        __isEdit = false
      }
      return AddEditStudentFragmentArgs(__studentName, __studentId, __position, __isEdit)
    }
  }
}
