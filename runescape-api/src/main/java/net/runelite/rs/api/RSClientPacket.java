package net.runelite.rs.api;

import net.runelite.api.packets.ClientPacket;
import net.runelite.mapping.Import;

import static net.unethicalite.api.packets.PacketFields.*;

public interface RSClientPacket extends ClientPacket
{
	@Import("id")
	@Override
	int getId();

	@Import("length")
	@Override
	int getLength();

	@Import(IF_BUTTONT)
	@Override
	RSClientPacket IF_BUTTONT();

	@Import(OPNPCT)
	@Override
	RSClientPacket OPNPCT();

	@Import(EVENT_MOUSE_CLICK)
	@Override
	RSClientPacket EVENT_MOUSE_CLICK();

	@Import(OPLOCT)
	@Override
	RSClientPacket OPLOCT();

	@Import(RESUME_PAUSEBUTTON)
	@Override
	RSClientPacket RESUME_PAUSEBUTTON();

	@Import(IF_BUTTON1)
	@Override
	RSClientPacket IF_BUTTON1();

	@Import(IF_BUTTON2)
	@Override
	RSClientPacket IF_BUTTON2();

	@Import(IF_BUTTON3)
	@Override
	RSClientPacket IF_BUTTON3();

	@Import(IF_BUTTON4)
	@Override
	RSClientPacket IF_BUTTON4();

	@Import(IF_BUTTON5)
	@Override
	RSClientPacket IF_BUTTON5();

	@Import(IF_BUTTON6)
	@Override
	RSClientPacket IF_BUTTON6();

	@Import(IF_BUTTON7)
	@Override
	RSClientPacket IF_BUTTON7();

	@Import(IF_BUTTON8)
	@Override
	RSClientPacket IF_BUTTON8();

	@Import(IF_BUTTON9)
	@Override
	RSClientPacket IF_BUTTON9();

	@Import(IF_BUTTON10)
	@Override
	RSClientPacket IF_BUTTON10();

	@Import(OPLOC1)
	@Override
	RSClientPacket OPLOC1();

	@Import(OPLOC2)
	@Override
	RSClientPacket OPLOC2();

	@Import(OPLOC3)
	@Override
	RSClientPacket OPLOC3();

	@Import(OPLOC4)
	@Override
	RSClientPacket OPLOC4();

	@Import(OPLOC5)
	@Override
	RSClientPacket OPLOC5();

	@Import(OPOBJ1)
	@Override
	RSClientPacket OPOBJ1();

	@Import(OPOBJ2)
	@Override
	RSClientPacket OPOBJ2();

	@Import(OPOBJ3)
	@Override
	RSClientPacket OPOBJ3();

	@Import(OPOBJ4)
	@Override
	RSClientPacket OPOBJ4();

	@Import(OPOBJ5)
	@Override
	RSClientPacket OPOBJ5();

	@Import(MOVE_GAMECLICK)
	@Override
	RSClientPacket MOVE_GAMECLICK();

	@Import(RESUME_P_COUNTDIALOG)
	@Override
	RSClientPacket RESUME_P_COUNTDIALOG();

	@Import(RESUME_P_STRINGDIALOG)
	@Override
	RSClientPacket RESUME_P_STRINGDIALOG();

	@Import(RESUME_P_NAMEDIALOG)
	@Override
	RSClientPacket RESUME_P_NAMEDIALOG();

	@Import(OPNPC1)
	@Override
	RSClientPacket OPNPC1();

	@Import(OPNPC2)
	@Override
	RSClientPacket OPNPC2();

	@Import(OPNPC3)
	@Override
	RSClientPacket OPNPC3();

	@Import(OPNPC4)
	@Override
	RSClientPacket OPNPC4();

	@Import(OPNPC5)
	@Override
	RSClientPacket OPNPC5();

	@Import(CLOSE_MODAL)
	@Override
	RSClientPacket CLOSE_MODAL();

	@Import(OPOBJT)
	@Override
	RSClientPacket OPOBJT();

	@Import(OPPLAYERT)
	@Override
	RSClientPacket OPPLAYERT();

	@Import(OPPLAYER1)
	@Override
	RSClientPacket OPPLAYER1();

	@Import(OPPLAYER2)
	@Override
	RSClientPacket OPPLAYER2();

	@Import(OPPLAYER3)
	@Override
	RSClientPacket OPPLAYER3();

	@Import(OPPLAYER4)
	@Override
	RSClientPacket OPPLAYER4();

	@Import(OPPLAYER5)
	@Override
	RSClientPacket OPPLAYER5();

	@Import(OPPLAYER6)
	@Override
	RSClientPacket OPPLAYER6();

	@Import(OPPLAYER7)
	@Override
	RSClientPacket OPPLAYER7();

	@Import(OPPLAYER8)
	@Override
	RSClientPacket OPPLAYER8();
}
