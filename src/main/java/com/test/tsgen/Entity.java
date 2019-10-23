package com.test.tsgen;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Foo.class, name = "Foo"),
    @JsonSubTypes.Type(value = Bar.class, name = "Bar")
})
public abstract class Entity<T> {

    @JsonProperty
    protected final T id;

    public Entity(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    @JsonGetter("entityType")
    protected abstract EntityType getEntityType();
}
