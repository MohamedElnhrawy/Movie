package com.example.core

data class SingleEvent<T>(
    val data: T,
    val sourceId: Int = -1,
    var isHandled: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        return other is SingleEvent<*> && this.data == other.data && this.sourceId == other.sourceId
    }

    override fun hashCode(): Int {
        var result = data?.hashCode() ?: 0
        result = 31 * result + sourceId
        return result
    }

    fun getContentIfNotHandled(): T? {
        return if (isHandled) {
            null
        } else {
            isHandled = true
            data
        }
    }
}
