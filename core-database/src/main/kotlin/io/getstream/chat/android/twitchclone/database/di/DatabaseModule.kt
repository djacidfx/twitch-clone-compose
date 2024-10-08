/*
 * Copyright 2023 Stream.IO, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.getstream.chat.android.twitchclone.database.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.getstream.chat.android.twitchclone.database.TwitchDatabase
import io.getstream.chat.android.twitchclone.database.dao.RewardDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {

  @Provides
  @Singleton
  fun provideTwitchCloneDatabase(
    @ApplicationContext context: Context
  ): TwitchDatabase = Room.databaseBuilder(
    context,
    TwitchDatabase::class.java,
    "twitchclone-database"
  ).build()

  @Provides
  @Singleton
  fun provideTwitchUserDao(
    twitchDatabase: TwitchDatabase
  ): RewardDao {
    return twitchDatabase.rewardDao()
  }
}
