package io.vertx.zero.ke;

import io.vertx.core.json.JsonObject;

public interface Transformer<T> {

    T transform(JsonObject input);
}
