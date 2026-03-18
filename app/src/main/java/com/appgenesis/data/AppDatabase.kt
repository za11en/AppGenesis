package com.appgenesis.data
import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Entity(tableName = "app_logs")
data class AppLog(
    @PrimaryKey val packageName: String,
    val appName: String,
    val currentVersion: String,
    val installTime: Long,
    val lastUpdateTime: Long,
    val isUninstalled: Boolean = false
)

@Dao
interface AppDao {
    @Query("SELECT * FROM app_logs ORDER BY lastUpdateTime DESC")
    fun getAllApps(): Flow<List<AppLog>>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertApp(app: AppLog)
    @Query("UPDATE app_logs SET isUninstalled = 1 WHERE packageName = :packageName")
    suspend fun markAsUninstalled(packageName: String)
}

@Database(entities = [AppLog::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appDao(): AppDao
}
