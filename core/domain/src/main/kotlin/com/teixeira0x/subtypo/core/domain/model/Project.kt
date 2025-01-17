package com.teixeira0x.subtypo.core.domain.model

data class Project(val id: Long = 0, val name: String, val videoUri: String) {
  val videoName: String
    get() = videoUri.substringAfterLast("/")
}
