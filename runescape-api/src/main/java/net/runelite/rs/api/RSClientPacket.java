package net.runelite.rs.api;

import net.runelite.api.packets.ClientPacket;
import net.runelite.mapping.Import;

public interface RSClientPacket extends ClientPacket
{
	@Import("id")
	@Override
	int getId();

	@Import("length")
	@Override
	int getLength();

	@Import("EVENT_MOUSE_CLICK")
	RSClientPacket EVENT_MOUSE_CLICK();

	@Import("OPOBJ1")
	RSClientPacket OPOBJ1();

	@Import("OPOBJ5")
	RSClientPacket OPOBJ5();

	@Import("IF_BUTTON4")
	RSClientPacket IF_BUTTON4();

	@Import("OPOBJ2")
	RSClientPacket OPOBJ2();

	@Import("IF_BUTTON5")
	RSClientPacket IF_BUTTON5();

	@Import("IF_BUTTONT")
	RSClientPacket IF_BUTTONT();

	@Import("IF_BUTTON6")
	RSClientPacket IF_BUTTON6();

	@Import("OPOBJ3")
	RSClientPacket OPOBJ3();

	@Import("OPPLAYER4")
	RSClientPacket OPPLAYER4();

	@Import("IF_BUTTON1")
	RSClientPacket IF_BUTTON1();

	@Import("OPLOC4")
	RSClientPacket OPLOC4();

	@Import("OPLOC5")
	RSClientPacket OPLOC5();

	@Import("OPNPC1")
	RSClientPacket OPNPC1();

	@Import("OPNPC4")
	RSClientPacket OPNPC4();

	@Import("OPPLAYERT")
	RSClientPacket OPPLAYERT();

	@Import("OPPLAYER6")
	RSClientPacket OPPLAYER6();

	@Import("OPLOC1")
	RSClientPacket OPLOC1();

	@Import("IF_BUTTON3")
	RSClientPacket IF_BUTTON3();

	@Import("OPPLAYER7")
	RSClientPacket OPPLAYER7();

	@Import("IF_BUTTON10")
	RSClientPacket IF_BUTTON10();

	@Import("OPPLAYER5")
	RSClientPacket OPPLAYER5();

	@Import("OPOBJ4")
	RSClientPacket OPOBJ4();

	@Import("OPLOC2")
	RSClientPacket OPLOC2();

	@Import("OPLOC3")
	RSClientPacket OPLOC3();

	@Import("OPPLAYER8")
	RSClientPacket OPPLAYER8();

	@Import("IF_BUTTON7")
	RSClientPacket IF_BUTTON7();

	@Import("OPNPC5")
	RSClientPacket OPNPC5();

	@Import("MOVE_GAMECLICK")
	RSClientPacket MOVE_GAMECLICK();

	@Import("OPPLAYER1")
	RSClientPacket OPPLAYER1();

	@Import("OPNPC2")
	RSClientPacket OPNPC2();

	@Import("IF_BUTTON9")
	RSClientPacket IF_BUTTON9();

	@Import("RESUME_PAUSEBUTTON")
	RSClientPacket RESUME_PAUSEBUTTON();

	@Import("OPOBJT")
	RSClientPacket OPOBJT();

	@Import("IF_BUTTON2")
	RSClientPacket IF_BUTTON2();

	@Import("OPNPC3")
	RSClientPacket OPNPC3();

	@Import("OPPLAYER3")
	RSClientPacket OPPLAYER3();

	@Import("CLOSE_MODAL")
	RSClientPacket CLOSE_MODAL();

	@Import("OPLOCT")
	RSClientPacket OPLOCT();

	@Import("OPPLAYER2")
	RSClientPacket OPPLAYER2();

	@Import("IF_BUTTON8")
	RSClientPacket IF_BUTTON8();

	@Import("OPNPCT")
	RSClientPacket OPNPCT();
}
