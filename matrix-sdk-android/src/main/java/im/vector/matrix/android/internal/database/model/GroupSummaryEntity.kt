package im.vector.matrix.android.internal.database.model

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

internal open class GroupSummaryEntity(@PrimaryKey var groupId: String = "",
                              var displayName: String = "",
                              var shortDescription: String = "",
                              var avatarUrl: String = "",
                              var roomIds: RealmList<String> = RealmList(),
                              var userIds: RealmList<String> = RealmList()
) : RealmObject() {

    companion object

}