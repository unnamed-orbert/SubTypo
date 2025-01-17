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

package com.teixeira0x.subtypo.core.data

import android.content.Context
import com.teixeira0x.subtypo.ui.common.R
import com.teixeira0x.subtypo.utils.TimeUtils

/** @author Felipe Teixeira */
class CueValidator(private val context: Context) {

  fun checkTime(formattedTime: String): ValidationResult {
    return if (TimeUtils.isValidTime(formattedTime)) {
      ValidationResult.Success
    } else
      ValidationResult.Error(
        context.getString(R.string.subtitle_cue_invalid_time)
      )
  }

  fun checkText(text: String): ValidationResult {
    return if (
      text.lines().firstOrNull { it.isEmpty() || it.isBlank() } == null
    ) {
      ValidationResult.Success
    } else
      ValidationResult.Error(
        context.getString(R.string.warn_text_field_cannot_empty)
      )
  }
}
