/*
 * This file is part of SubTypo.
 *
 * SubTypo is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * SubTypo is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with SubTypo.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package com.teixeira0x.subtypo.core.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.teixeira0x.subtypo.core.data.db.entity.ProjectEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ProjectDao {
  @Query("SELECT * FROM projects") fun getAll(): Flow<List<ProjectEntity>>

  @Query("SELECT * FROM projects WHERE id = :id")
  fun findById(id: Long): Flow<ProjectEntity?>

  @Insert suspend fun insert(project: ProjectEntity): Long

  @Update suspend fun update(project: ProjectEntity): Int

  @Query("DELETE FROM projects WHERE id = :id")
  suspend fun remove(id: Long): Int
}
