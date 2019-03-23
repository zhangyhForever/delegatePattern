package com.forever.pattern.delegatePattern.simple;

public class Boss {

    public void command(String command, Leader leader){
        leader.dispatch(command);
    }
}
