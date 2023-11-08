package com.mana.testapplication.repository

import com.mana.testapplication.data.PixabayAPI
import com.mana.testapplication.data.local.ShoppingDao
import javax.inject.Inject

class DefaultShoppingRepository @Inject constructor(
    private val shoppingDao: ShoppingDao,
    private val pixabayAPI: PixabayAPI
    ) {


}