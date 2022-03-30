package com.naumov.borisov;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String quote;

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
    }

    @Override
    @PostConstruct
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(quote);
        }
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }
}
