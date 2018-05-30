package com.design.command.demo2;

/**
 * Created by dk05408 on 2016/12/19.
 */
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);

//        keypad.play();
//        keypad.rewind();
//        keypad.stop();
//        keypad.play();
//        keypad.stop();
//
//        System.out.println();
        MacroCommand marco = new MacroAudioCommand();

        marco.add(playCommand);
        marco.add(rewindCommand);
        marco.add(stopCommand);
        marco.add(stopCommand);
        marco.remove(rewindCommand);
        marco.execute();

        Byte b1 = Byte.valueOf((byte) 50);
        Byte b2 = Byte.valueOf((byte) 50);
        System.out.println(b1.compareTo(b2)<0);



    }
}
