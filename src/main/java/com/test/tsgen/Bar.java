package com.test.tsgen;

public class Bar extends Entity<Integer> {

    public Bar(final int id) {
        super(id);
    }

    @Override
    protected EntityType getEntityType() {
        return EntityType.BAR;
    }
}
