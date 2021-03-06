package im.vector.matrix.android.internal.database.mapper

import im.vector.matrix.android.api.session.events.model.Content
import im.vector.matrix.android.api.session.events.model.Event
import im.vector.matrix.android.internal.di.MoshiProvider

internal object ContentMapper {

    private val moshi = MoshiProvider.providesMoshi()
    private val adapter = moshi.adapter<Content>(Event.CONTENT_TYPE)

    fun map(content: String?): Content? {
        return content?.let {
            adapter.fromJson(it)
        }
    }

    fun map(content: Content?): String? {
        return content?.let {
            adapter.toJson(it)
        }
    }

}
