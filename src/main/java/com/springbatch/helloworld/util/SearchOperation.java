package com.springbatch.helloworld.util;

public enum SearchOperation {
    EQUALITY(":"), NEGATION("!"), GREATER_THAN(">"), LESS_THAN("<"), LIKE("~");

    private final String key;

    SearchOperation(String key) {
        this.key = key;
    }

    public String getKey() { return key; }

    public SearchOperation fromString(String key) {
        switch (key) {
            default: return null;
            case "!": return NEGATION;
            case ":": return EQUALITY;
            case ">": return GREATER_THAN;
            case "<": return LESS_THAN;
            case "~": return LIKE;
        }
    }
}
