package com.cmt.statemachine.impl;

import com.cmt.statemachine.State;
import com.cmt.statemachine.StateMachine;
import com.cmt.statemachine.Transition;
import com.cmt.statemachine.Visitor;

/**
 * SysOutVisitor
 *
 * @author Frank Zhang
 * @date 2020-02-08 8:48 PM
 */
public class SysOutVisitor implements Visitor {
    @Override
    public void visitOnEntry(StateMachine<?, ?> stateMachine) {
        System.out.println("-----StateMachine:"+stateMachine.getMachineId()+"-------");
    }

    @Override
    public void visitOnExit(StateMachine<?, ?> stateMachine) {
        System.out.println("------------------------");
    }

    @Override
    public void visitOnEntry(State<?, ?> state) {
        System.out.println("State:"+state.getId());
        for(Transition transition: state.getTransitions()){
            System.out.println("    Transition:"+transition);
        }

    }

    @Override
    public void visitOnExit(State<?, ?> visitable) {

    }
}
