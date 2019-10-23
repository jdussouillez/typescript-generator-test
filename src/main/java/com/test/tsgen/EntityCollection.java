package com.test.tsgen;

import java.util.Set;
import java.util.TreeSet;

public class EntityCollection {

    protected final Set<Entity<?>> entities = new TreeSet<>();

    public Set<Entity<?>> getEntities() {
        return entities;
    }
}
