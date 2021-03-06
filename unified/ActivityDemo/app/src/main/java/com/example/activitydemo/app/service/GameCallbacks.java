/*
 * Copyright (C) 2014 The Android Open Source Project
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

package com.example.activitydemo.app.service;

import com.example.activitydemo.app.ActivityLog;

/**
 * This interface is going to be called from the service thread.
 */
public interface GameCallbacks {
    public boolean onTick(long timeMillis);
    public void onActivityDetected(ActivityLog log);
    public long getScore();
}
