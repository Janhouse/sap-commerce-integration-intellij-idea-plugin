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

package com.intellij.idea.plugin.hybris.project.utils;

import com.google.common.base.Predicate;
import com.intellij.idea.plugin.hybris.project.settings.HybrisModuleDescriptor;
import org.apache.commons.lang3.Validate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created 8:31 PM 20 June 2015.
 *
 * @author Alexander Bartash <AlexanderBartash@gmail.com>
 */
public class FindHybrisModuleDescriptorByName implements Predicate<HybrisModuleDescriptor> {

    private final String name;

    public FindHybrisModuleDescriptorByName(@NotNull final String name) {
        Validate.notEmpty(name);

        this.name = name;
    }

    @Override
    public boolean apply(@Nullable final HybrisModuleDescriptor t) {
        return null != t && name.equalsIgnoreCase(t.getModuleName());
    }
}