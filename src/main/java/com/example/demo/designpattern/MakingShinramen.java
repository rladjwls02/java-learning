package com.example.demo.designpattern;

public class MakingShinramen extends MakingRamen{
    @Override
    public String soup() {
        return "신라면";
    }

    @Override
    public String water() {
        return "생수";
    }

    @Override
    public String noodle() {
        return "건면";
    }
}
