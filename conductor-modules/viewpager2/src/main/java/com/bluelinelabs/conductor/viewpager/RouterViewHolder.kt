package com.bluelinelabs.conductor.viewpager

import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bluelinelabs.conductor.ChangeHandlerFrameLayout
import com.bluelinelabs.conductor.Router

class RouterViewHolder private constructor(container: FrameLayout) : ViewHolder(container) {
  val container: ChangeHandlerFrameLayout
    get() = itemView as ChangeHandlerFrameLayout

  var currentRouter: Router? = null
  var currentItemPosition = 0
  var currentItemId = 0L

  companion object {
    fun create(parent: ViewGroup): RouterViewHolder {
      val container = ChangeHandlerFrameLayout(parent.context)
      container.id = ViewCompat.generateViewId()
      container.layoutParams = ViewGroup.LayoutParams(
        ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.MATCH_PARENT
      )
      container.isSaveEnabled = false
      return RouterViewHolder(container)
    }
  }
}