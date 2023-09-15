package br.com.fiap.eco_tech.database.repository

import android.content.Context
import br.com.fiap.eco_tech.R
import br.com.fiap.eco_tech.mvvm.model.Menu
import br.com.fiap.eco_tech.navigation.AppRoutes

class MenuItems {
    companion object {
        fun listItems(context: Context): List<Menu> {
            val routes = AppRoutes()
            return listOf(
                Menu(
                    name = context.getString(R.string.menu_index),
                    route = routes.getIndexRoute()
                ),
                Menu(
                    name = context.getString(R.string.menu_blog),
                    route = routes.getBlogRoute()
                ),
                Menu(
                    name = context.getString(R.string.menu_chat),
                    route = routes.getChatRoute()
                ),
                Menu(
                    name = context.getString(R.string.menu_search),
                    route = routes.getSearchRoute()
                ),
                Menu(
                    name = context.getString(R.string.menu_exit),
                    route = routes.getLoginRoute()
                )
            )
        }
    }
}
