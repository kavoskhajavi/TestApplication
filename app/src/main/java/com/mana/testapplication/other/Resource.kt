package com.mana.testapplication.other

import com.mana.testapplication.other.Status.ERROR
import com.mana.testapplication.other.Status.LOADING

data class Resource<out T>(val status:Status,val data:T?,val message:String?) {

    companion object {

        fun <T> success(data:T?):Resource<T>{
            return Resource(Status.SUCCESS,data,null)
        }

        fun <T>error(msg:String,data:T?):Resource<T>{
            return Resource(ERROR,data,null)
        }
        fun <T>loading(data:T?):Resource<T>{
            return Resource(LOADING,data,null)
        }

    }

}

enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}