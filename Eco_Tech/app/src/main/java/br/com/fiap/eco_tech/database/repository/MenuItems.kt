package br.com.fiap.eco_tech.database.repository

import android.content.Context
import br.com.fiap.eco_tech.R
import br.com.fiap.eco_tech.mvvm.model.Menu
import br.com.fiap.eco_tech.navigation.AppRoutes

class MenuItems {
    companion object {
        fun listItems(context: Context): List<Menu> {
            return listOf(
                Menu(
                    name = context.getString(R.string.menu_index),
                    route = AppRoutes.INDEX_ROUTE
                ),
                Menu(
                    name = context.getString(R.string.menu_blog),
                    route = AppRoutes.BLOG_ROUTE
                ),
                Menu(
                    name = context.getString(R.string.menu_chat),
                    route = AppRoutes.CHAT_ROUTE
                ),
                Menu(
                    name = context.getString(R.string.menu_search),
                    route = AppRoutes.SEARCH_ROUTE
                ),
                Menu(
                    name = context.getString(R.string.menu_exit),
                    route = AppRoutes.LOGIN_ROUTE
                )
            )
        }
    }
}
