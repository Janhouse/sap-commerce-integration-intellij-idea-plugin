/*
 * Copyright 2015 Alexander Bartash <AlexanderBartash@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intellij.idea.plugin.hybris.utils;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

/**
 * Created 1:54 AM 08 June 2015
 *
 * @author Alexander Bartash <AlexanderBartash@gmail.com>
 */
public final class HybrisIconsUtils {

    public static final Icon IMPEX_FILE = IconLoader.getIcon("/icons/jar-gray.png");
    public static final Icon HYBRIS_ICON = IconLoader.getIcon("/icons/hybris_icon.png");

    private HybrisIconsUtils() throws IllegalAccessException {
        throw new IllegalAccessException("Should never be accessed.");
    }
}