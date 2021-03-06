/*
 * Copyright (C) 2012 lytsing.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lytsing.android.weibo.core.models;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class WeiboObject {
    public List<Statuses> statuses;

    @SerializedName("hasvisible")
    public boolean hasvisible;

    @SerializedName("previous_cursor")
    public long previous_cursor;

    @SerializedName("next_cursor")
    public long next_cursor;

    @SerializedName("total_number")
    public int total_number;
}

