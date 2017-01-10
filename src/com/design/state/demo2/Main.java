package com.design.state.demo2;

/**
 * Created by dk05408 on 2017/1/10.
 */
public class Main {
    public static void main(String[] args) {

        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
    }
}
