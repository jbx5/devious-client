package net.runelite.api.packets;

public interface ClientPacket {
    int getId();
    int getLength();

    ClientPacket OPHELDT();

    ClientPacket OPNPCT();

    ClientPacket EVENT_MOUSE_CLICK();

    ClientPacket OPNPCU();

    ClientPacket OPLOCU();

    ClientPacket OPHELD1();

    ClientPacket OPHELD2();

    ClientPacket OPHELD3();

    ClientPacket OPHELD4();

    ClientPacket OPHELD5();

    ClientPacket OPHELDU();

    ClientPacket RESUME_PAUSEBUTTON();

    ClientPacket IF_BUTTON1();

    ClientPacket IF_BUTTON2();

    ClientPacket IF_BUTTON3();

    ClientPacket IF_BUTTON4();

    ClientPacket IF_BUTTON5();

    ClientPacket IF_BUTTON6();

    ClientPacket IF_BUTTON7();

    ClientPacket IF_BUTTON8();

    ClientPacket IF_BUTTON9();

    ClientPacket IF_BUTTON10();

    ClientPacket OPLOC1();

    ClientPacket OPLOC2();

    ClientPacket OPLOC3();

    ClientPacket OPLOC4();

    ClientPacket OPLOC5();

    ClientPacket OPOBJ1();

    ClientPacket OPOBJ2();

    ClientPacket OPOBJ3();

    ClientPacket OPOBJ4();

    ClientPacket OPOBJ5();

    ClientPacket MOVE_GAMECLICK();

    ClientPacket RESUME_P_COUNTDIALOG();

    ClientPacket RESUME_P_STRINGDIALOG();

    ClientPacket RESUME_P_NAMEDIALOG();

    ClientPacket OPNPC1();

    ClientPacket OPNPC2();

    ClientPacket OPNPC3();

    ClientPacket OPNPC4();

    ClientPacket OPNPC5();

    ClientPacket CLOSE_MODAL();
}
