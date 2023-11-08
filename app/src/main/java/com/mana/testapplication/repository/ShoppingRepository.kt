package com.mana.testapplication.repository

import com.mana.testapplication.data.local.ShoppingItem

interface ShoppingRepository {
    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)
}