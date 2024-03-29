package com.zxh.concurrency.example.publish;

import com.zxh.concurrency.annoations.ThreadUnSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
@ThreadUnSafe
public class UnsafePublish {
    private String[] states = {"a","b","c"};

    public String[] getStates(){
        return states;
    }

    public static void  main(String[] args){
        UnsafePublish unsafePublish = new UnsafePublish();
        log.info("{}", Arrays.toString(unsafePublish.getStates()));

        unsafePublish.getStates()[0] = "d";
        log.info("{}",Arrays.toString(unsafePublish.getStates()));
    }
}
