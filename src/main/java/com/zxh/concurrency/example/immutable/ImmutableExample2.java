package com.zxh.concurrency.example.immutable;

import com.google.common.collect.Maps;
import com.zxh.concurrency.annoations.ThreadSafe;
import com.zxh.concurrency.annoations.ThreadUnSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.Map;

@Slf4j
@ThreadSafe
public class ImmutableExample2 {

    /**
     * final修饰基本数据类型是不可以改变的，
     * 但是如果是引用数据类型，那么它内部数据是可以修改的！
     */

    private static Map<Integer, Integer> map = Maps.newHashMap();

    static {
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        map = Collections.unmodifiableMap(map);
    }

    public static void main(String[] args) {
        map.put(1,6);
        log.info("{}",map.get(1));
    }
}
