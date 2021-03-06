package im.vector.matrix.android.internal.di

import android.content.Context
import im.vector.matrix.android.internal.task.TaskExecutor
import im.vector.matrix.android.internal.util.BackgroundDetectionObserver
import im.vector.matrix.android.internal.util.MatrixCoroutineDispatchers
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module.module


class MatrixModule(private val context: Context) {

    val definition = module {

        single {
            context
        }

        single {
            MatrixCoroutineDispatchers(io = Dispatchers.IO, computation = Dispatchers.IO, main = Dispatchers.Main)
        }

        single {
            TaskExecutor(get())
        }

        single {
            BackgroundDetectionObserver()
        }

    }
}