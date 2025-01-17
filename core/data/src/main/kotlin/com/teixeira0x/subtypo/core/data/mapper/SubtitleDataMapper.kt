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

package com.teixeira0x.subtypo.core.data.mapper

import com.teixeira0x.subtypo.core.data.db.entity.SubtitleEntity
import com.teixeira0x.subtypo.core.domain.model.Subtitle
import com.teixeira0x.subtypo.core.domain.subtitle.mapper.SubtitleFormatMapper.toSubtitleFormat
import com.teixeira0x.subtypo.core.domain.subtitle.mapper.SubtitleFormatMapper.toValue

object SubtitleDataMapper {

  fun SubtitleEntity.toModel(): Subtitle {
    return Subtitle(
      id = id,
      projectId = projectId,
      name = name,
      format = format.toSubtitleFormat(),
      cues = cues,
    )
  }

  fun Subtitle.toEntity(): SubtitleEntity {
    return SubtitleEntity(
      id = id,
      projectId = projectId,
      name = name,
      format = format.toValue(),
      cues = cues,
    )
  }
}
