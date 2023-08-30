package com.ptah.common;

public interface ObjectStorageService {
    <T> T getByKey(String key, Class<T> type);

    default String getByKey(String key){
        return getByKey(key,String.class);
    }

    void setValue(String key, Object value);

    void setValue(String key, Object value, long timeout);

    boolean hasKey(String key);
}
