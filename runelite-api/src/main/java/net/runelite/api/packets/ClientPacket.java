package net.runelite.api.packets;

import java.util.Map;

public interface ClientPacket
{
	int getId();

	int getLength();

	ClientPacket OPOBJ1();

	ClientPacket IF_BUTTON9();

	ClientPacket RESUME_PAUSEBUTTON();

	ClientPacket RESUME_P_COUNTDIALOG();

	ClientPacket IF_BUTTON8();

	ClientPacket OPOBJ5();

	ClientPacket IF_BUTTON5();

	ClientPacket OPOBJ4();

	ClientPacket IF_BUTTON4();

	ClientPacket OPOBJ3();

	ClientPacket IF_BUTTON7();

	ClientPacket OPOBJ2();

	ClientPacket IF_BUTTON6();

	ClientPacket OPLOCT();

	ClientPacket OPNPCT();

	ClientPacket OPPLAYERT();

	ClientPacket RESUME_P_NAMEDIALOG();

	ClientPacket RESUME_P_STRINGDIALOG();

	ClientPacket OPOBJT();

	ClientPacket IF_BUTTONT();

	ClientPacket RESUME_P_OBJDIALOG();

	ClientPacket OPNPC2();

	ClientPacket OPPLAYER6();

	ClientPacket OPNPC3();

	ClientPacket OPPLAYER7();

	ClientPacket OPLOC2();

	ClientPacket OPPLAYER8();

	ClientPacket OPLOC1();

	ClientPacket OPNPC1();

	ClientPacket OPLOC4();

	ClientPacket OPPLAYER2();

	ClientPacket OPLOC3();

	ClientPacket OPPLAYER3();

	ClientPacket OPNPC4();

	ClientPacket OPPLAYER4();

	ClientPacket OPNPC5();

	ClientPacket OPPLAYER5();

	ClientPacket OPLOC5();

	ClientPacket CLOSE_MODAL();

	ClientPacket OPPLAYER1();

	ClientPacket MOVE_GAMECLICK();

	ClientPacket IF_BUTTON1();

	ClientPacket IF_BUTTON3();

	ClientPacket IF_BUTTON2();

	ClientPacket EVENT_MOUSE_CLICK();

	ClientPacket IF_BUTTON10();

	default Map<ClientPacket, String> getClientPackets()
	{
		return Map.ofEntries(Map.entry(OPOBJ1(), "OPOBJ1"), Map.entry(IF_BUTTON9(), "IF_BUTTON9"), Map.entry(RESUME_PAUSEBUTTON(), "RESUME_PAUSEBUTTON"), Map.entry(RESUME_P_COUNTDIALOG(), "RESUME_P_COUNTDIALOG"), Map.entry(IF_BUTTON8(), "IF_BUTTON8"), Map.entry(OPOBJ5(), "OPOBJ5"), Map.entry(IF_BUTTON5(), "IF_BUTTON5"), Map.entry(OPOBJ4(), "OPOBJ4"), Map.entry(IF_BUTTON4(), "IF_BUTTON4"), Map.entry(OPOBJ3(), "OPOBJ3"), Map.entry(IF_BUTTON7(), "IF_BUTTON7"), Map.entry(OPOBJ2(), "OPOBJ2"), Map.entry(IF_BUTTON6(), "IF_BUTTON6"), Map.entry(OPLOCT(), "OPLOCT"), Map.entry(OPNPCT(), "OPNPCT"), Map.entry(OPPLAYERT(), "OPPLAYERT"), Map.entry(RESUME_P_NAMEDIALOG(), "RESUME_P_NAMEDIALOG"), Map.entry(RESUME_P_STRINGDIALOG(), "RESUME_P_STRINGDIALOG"), Map.entry(OPOBJT(), "OPOBJT"), Map.entry(IF_BUTTONT(), "IF_BUTTONT"), Map.entry(RESUME_P_OBJDIALOG(), "RESUME_P_OBJDIALOG"), Map.entry(OPNPC2(), "OPNPC2"), Map.entry(OPPLAYER6(), "OPPLAYER6"), Map.entry(OPNPC3(), "OPNPC3"), Map.entry(OPPLAYER7(), "OPPLAYER7"), Map.entry(OPLOC2(), "OPLOC2"), Map.entry(OPPLAYER8(), "OPPLAYER8"), Map.entry(OPLOC1(), "OPLOC1"), Map.entry(OPNPC1(), "OPNPC1"), Map.entry(OPLOC4(), "OPLOC4"), Map.entry(OPPLAYER2(), "OPPLAYER2"), Map.entry(OPLOC3(), "OPLOC3"), Map.entry(OPPLAYER3(), "OPPLAYER3"), Map.entry(OPNPC4(), "OPNPC4"), Map.entry(OPPLAYER4(), "OPPLAYER4"), Map.entry(OPNPC5(), "OPNPC5"), Map.entry(OPPLAYER5(), "OPPLAYER5"), Map.entry(OPLOC5(), "OPLOC5"), Map.entry(CLOSE_MODAL(), "CLOSE_MODAL"), Map.entry(OPPLAYER1(), "OPPLAYER1"), Map.entry(MOVE_GAMECLICK(), "MOVE_GAMECLICK"), Map.entry(IF_BUTTON1(), "IF_BUTTON1"), Map.entry(IF_BUTTON3(), "IF_BUTTON3"), Map.entry(IF_BUTTON2(), "IF_BUTTON2"), Map.entry(EVENT_MOUSE_CLICK(), "EVENT_MOUSE_CLICK"), Map.entry(IF_BUTTON10(), "IF_BUTTON10"));
	}
}
