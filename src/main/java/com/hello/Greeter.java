package com.hello;

public class Greeter {

    private HelloProperties helloProperties;

    public Greeter(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String myGretter(){
        return "Hello "+helloProperties.getName();
    }
}
