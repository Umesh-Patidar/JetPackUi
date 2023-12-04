package com.example.jetpackui.ui.screen.dashboard

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.AddModerator
import androidx.compose.material.icons.filled.Android
import androidx.compose.material.icons.filled.Battery5Bar
import androidx.compose.material.icons.filled.CleaningServices
import androidx.compose.material.icons.filled.DataUsage
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.MedicalServices
import androidx.compose.material.icons.filled.Radar
import androidx.compose.material.icons.filled.Rocket
import androidx.compose.ui.graphics.vector.ImageVector

data class CategoryData(val icon: ImageVector, val category: String, val description: String)
data class SubCategoryData(val icon: ImageVector, val category: String)

val categoryList = ArrayList<CategoryData>().apply {
    add(CategoryData(icon = Icons.Filled.Delete, category = "Cleaner", description = "Free up 3.9GB"))
    add(CategoryData(icon = Icons.Filled.Radar, category = "Security scan", description = "Scan your device for viruses"))
    add(CategoryData(icon = Icons.Filled.Battery5Bar, category = "Battery", description = "4 hr 39 min remaining"))
    add(CategoryData(icon = Icons.Filled.Rocket, category = "Boost speed", description = "Clear memory"))
    add(CategoryData(icon = Icons.Filled.Android, category = "Manage apps", description = "Update and uninstall apps"))
    add(CategoryData(icon = Icons.Filled.CleaningServices, category = "Deep clean", description = "43.5GB/64GB occupied"))
}

val subCategoryList = ArrayList<SubCategoryData>().apply {
    add(SubCategoryData(icon = Icons.Filled.AddComment, category = "WhatsApp Cleaner"))
    add(SubCategoryData(icon = Icons.Filled.AddModerator, category = "App lock"))
    add(SubCategoryData(icon = Icons.Filled.MedicalServices, category = "Solve problem"))
    add(SubCategoryData(icon = Icons.Filled.DataUsage, category = "Data usage"))
    add(SubCategoryData(icon = Icons.Filled.AddComment, category = "Block list"))
    add(SubCategoryData(icon = Icons.Filled.AddComment, category = "Dual apps"))
    add(SubCategoryData(icon = Icons.Filled.AddComment, category = "WhatsApp cleaner"))
    add(SubCategoryData(icon = Icons.Filled.AddComment, category = "Second space"))
    add(SubCategoryData(icon = Icons.Filled.AddComment, category = "Test network"))
    add(SubCategoryData(icon = Icons.Filled.AddComment, category = "Game Turbo"))
    add(SubCategoryData(icon = Icons.Filled.AddComment, category = "Video toolbox"))
    add(SubCategoryData(icon = Icons.Filled.AddComment, category = "Privacy"))
    add(SubCategoryData(icon = Icons.Filled.AddComment, category = "Hide apps"))
}

