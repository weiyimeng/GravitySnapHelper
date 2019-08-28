package com.github.rubensousa.recyclerviewsnap

data class SnapList(
    val gravity: Int,
    val title: String,
    val apps: List<App>,
    val layoutId: Int = R.layout.adapter_snap,
    val usePadding: Boolean = false,
    val showScrollButton: Boolean = false
)