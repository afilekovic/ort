/*
 * Copyright (C) 2023 The ORT Project Authors (see <https://github.com/oss-review-toolkit/ort/blob/main/NOTICE>)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * License-Filename: LICENSE
 */

plugins {
    // Apply precompiled plugins.
    id("ort-plugins-conventions")
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(project(":plugins:reporters:asciidoc-reporter"))
    api(project(":plugins:reporters:ctrlx-reporter"))
    api(project(":plugins:reporters:cyclonedx-reporter"))
    api(project(":plugins:reporters:evaluated-model-reporter"))
    api(project(":plugins:reporters:fossid-reporter"))
    api(project(":plugins:reporters:freemarker-reporter"))
    api(project(":plugins:reporters:gitlab-reporter"))
    api(project(":plugins:reporters:opossum-reporter"))
    api(project(":plugins:reporters:spdx-reporter"))
    api(project(":plugins:reporters:static-html-reporter"))
    api(project(":plugins:reporters:web-app-reporter"))
}
