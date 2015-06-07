package org.zalando.riptide;

/*
 * ⁣​
 * riptide
 * ⁣⁣
 * Copyright (C) 2015 Zalando SE
 * ⁣⁣
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
 * ​⁣
 */

import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

/**
 * @see Selectors#contentType()
 */
final class ContentTypeSelector implements Selector<MediaType> {

    @Override
    public MediaType attributeOf(ClientHttpResponse response) throws IOException {
        return response.getHeaders().getContentType();
    }

//    @Override
//    public <O> Optional<Binding<MediaType>> select(MediaType contentType, Map<MediaType, Binding<MediaType>> bindings) {
//        // TODO find best match, not first
//        return bindings.entrySet().stream()
//                .filter(e -> e.getKey().includes(contentType))
//                .findFirst()
//                .map(Map.Entry::getValue);
//    }

}
