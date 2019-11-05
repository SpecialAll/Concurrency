package com.zxh.concurrency.example.publish;

import com.zxh.concurrency.annoations.ThreadUnSafe;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ThreadUnSafe
public class Escape {
    private int thisCanBeEscape = 0;
    public Escape(){
        new InnerClass();
    }

    private class InnerClass{
        public InnerClass(){
            log.info("{}",Escape.this.thisCanBeEscape);    //相当于在Escape类没有创建完成之前就可以看到thisCanBeEscape。所以时现场不安全的！
        }
    }
    public static void main(String[] args) {
        new Escape();
    }
}

