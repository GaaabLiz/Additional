package it.gabliz.additional.common.helper

interface CommonRegisterHelper {

    interface Items {
        fun init()
        fun <T> initItem(itemObj : T)
    }
}