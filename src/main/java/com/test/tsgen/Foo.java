package com.test.tsgen;

public class Foo extends Entity<String> {

    public Foo(final String id) {
        super(id);
    }

    @Override
    protected EntityType getEntityType() {
        return EntityType.FOO;
    }
}
