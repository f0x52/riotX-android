package im.vector.matrix.android.internal.database.model

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.RealmResults
import io.realm.annotations.LinkingObjects

internal open class ChunkEntity(var prevToken: String? = null,
                                var nextToken: String? = null,
                                var isLast: Boolean = false,
                                var events: RealmList<EventEntity> = RealmList()
) : RealmObject() {

    @LinkingObjects("chunks")
    val room: RealmResults<RoomEntity>? = null

    companion object
}