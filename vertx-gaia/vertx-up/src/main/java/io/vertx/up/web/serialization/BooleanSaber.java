package io.vertx.up.web.serialization;

import io.vertx.up.func.Fn;
import io.vertx.up.tool.Ut;

/**
 * Boolean
 */
public class BooleanSaber extends BaseSaber {

    @Override
    public Object from(final Class<?> paramType,
                       final String literal) {
        return Fn.getSemi(boolean.class == paramType || Boolean.class == paramType, this.getLogger(),
                () -> {

                    this.verifyInput(!Ut.isBoolean(literal), paramType, literal);
                    return Boolean.parseBoolean(literal);
                }, () -> Boolean.FALSE);
    }
}
