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

import com.teixeira0x.subtypo.build.BuildConfig

plugins {
  id("com.android.library")
  id("kotlin-android")
  id("kotlin-kapt")

  id("com.google.dagger.hilt.android")
}

android {
  namespace = "${BuildConfig.packageName}.core.domain"

  buildFeatures.apply { viewBinding = false }
}

dependencies {
  // Google
  kapt(libs.google.hilt.compiler)
  implementation(libs.google.hilt)
  implementation(libs.google.gson)

  implementation(project(":utils"))
}
