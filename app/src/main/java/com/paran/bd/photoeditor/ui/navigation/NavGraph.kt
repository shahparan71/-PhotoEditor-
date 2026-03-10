package com.paran.bd.photoeditor.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.paran.bd.photoeditor.ui.screens.editor.EditorScreen
import com.paran.bd.photoeditor.ui.screens.entry.EntryScreen

@Composable
fun NavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "entry") {
        composable("entry") {
            EntryScreen(
                onNavigateToEditor = { imageUri ->
                    // In a real app we might pass imageUri as argument or via a shared ViewModel
                    navController.navigate("editor")
                }
            )
        }
        composable("editor") {
            EditorScreen(
                onBack = { navController.popBackStack() }
            )
        }
    }
}
