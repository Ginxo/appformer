/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.client.views.pfly.monaco.jsinterop;

import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class MonacoLanguages {

    public native void register(final JavaScriptObject language);

    public native void setMonarchTokensProvider(final String languageId,
                                                final JavaScriptObject languageDefinition);

    public native void registerCompletionItemProvider(final String languageId,
                                                      final JavaScriptObject completionItemProvider);

    @JsFunction
    public interface ProvideCompletionItemsFunction {

        JavaScriptObject call();
    }
}
