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

	@Import("RESUME_PAUSEBUTTON")
	RSClientPacket RESUME_PAUSEBUTTON();

	@Import("RESUME_NAMEDIALOG")
	RSClientPacket RESUME_NAMEDIALOG();

	@Import("EVENT_KEYBOARD")
	RSClientPacket EVENT_KEYBOARD();

	@Import("EVENT_APPLET_FOCUS")
	RSClientPacket EVENT_APPLET_FOCUS();

//	@Import("CLICKWORLDMAP_TELEPORT")
//	RSClientPacket CLICKWORLDMAP_TELEPORT();

	@Import("IF_BUTTONT")
	RSClientPacket IF_BUTTONT();

	@Import("OPPLAYER6")
	RSClientPacket OPPLAYER6();

	@Import("OPNPC2")
	RSClientPacket OPNPC2();

	@Import("OPPLAYER7")
	RSClientPacket OPPLAYER7();

	@Import("OPNPC3")
	RSClientPacket OPNPC3();

	@Import("OPLOC2")
	RSClientPacket OPLOC2();

	@Import("OPPLAYER8")
	RSClientPacket OPPLAYER8();

	@Import("OPNPC1")
	RSClientPacket OPNPC1();

	@Import("OPLOC1")
	RSClientPacket OPLOC1();

	@Import("OPLOC4")
	RSClientPacket OPLOC4();

	@Import("FREECAM_EXIT")
	RSClientPacket FREECAM_EXIT();

	@Import("OPPLAYER2")
	RSClientPacket OPPLAYER2();

	@Import("OPLOC3")
	RSClientPacket OPLOC3();

	@Import("OPPLAYER3")
	RSClientPacket OPPLAYER3();

	@Import("OPPLAYER4")
	RSClientPacket OPPLAYER4();

	@Import("OPNPC4")
	RSClientPacket OPNPC4();

	@Import("LOGIN_TIMINGS")
	RSClientPacket LOGIN_TIMINGS();

	@Import("OPLOC5")
	RSClientPacket OPLOC5();

	@Import("OPPLAYER5")
	RSClientPacket OPPLAYER5();

	@Import("EVENT_MOUSE_IDLE")
	RSClientPacket EVENT_MOUSE_IDLE();

	@Import("OPNPC5")
	RSClientPacket OPNPC5();

	@Import("CHAT_SENDPRIVATE")
	RSClientPacket CHAT_SENDPRIVATE();

	@Import("CLOSE_MODAL")
	RSClientPacket CLOSE_MODAL();

	@Import("OPPLAYER1")
	RSClientPacket OPPLAYER1();

	@Import("CHAT_SENDABUSEREPORT")
	RSClientPacket CHAT_SENDABUSEREPORT();

	@Import("PING_STATISTICS")
	RSClientPacket PING_STATISTICS();

	@Import("EVENT_WINDOW_SETTING")
	RSClientPacket EVENT_WINDOW_SETTING();

	@Import("OPOBJ1")
	RSClientPacket OPOBJ1();

	@Import("FRIEND_ADDUSER")
	RSClientPacket FRIEND_ADDUSER();

	@Import("DOCHEAT")
	RSClientPacket DOCHEAT();

	@Import("IF_BUTTON9")
	RSClientPacket IF_BUTTON9();

	@Import("CLAN_KICKUSER")
	RSClientPacket CLAN_KICKUSER();

	@Import("IF_BUTTON8")
	RSClientPacket IF_BUTTON8();

	@Import("OPOBJ5")
	RSClientPacket OPOBJ5();

	@Import("IGNORE_DELUSER")
	RSClientPacket IGNORE_DELUSER();

	@Import("IF_BUTTON5")
	RSClientPacket IF_BUTTON5();

	@Import("IF_BUTTON4")
	RSClientPacket IF_BUTTON4();

	@Import("OPOBJ4")
	RSClientPacket OPOBJ4();

	@Import("OPOBJ3")
	RSClientPacket OPOBJ3();

	@Import("IF_BUTTON7")
	RSClientPacket IF_BUTTON7();

	@Import("CHAT_SETFILTER")
	RSClientPacket CHAT_SETFILTER();

	@Import("OPOBJ2")
	RSClientPacket OPOBJ2();

	@Import("IF_BUTTON6")
	RSClientPacket IF_BUTTON6();

	@Import("OPHELDD")
	RSClientPacket OPHELDD();

	@Import("RESUME_COUNTDIALOG")
	RSClientPacket RESUME_COUNTDIALOG();

	@Import("NO_TIMEOUT")
	RSClientPacket NO_TIMEOUT();

	@Import("OPLOCT")
	RSClientPacket OPLOCT();

	@Import("RESUME_OBJDIALOG")
	RSClientPacket RESUME_OBJDIALOG();

	@Import("OPPLAYERT")
	RSClientPacket OPPLAYERT();

	@Import("OPNPCT")
	RSClientPacket OPNPCT();

	@Import("FRIEND_DELUSER")
	RSClientPacket FRIEND_DELUSER();

	//@Import("IF_BUTTOND")
	//RSClientPacket IF_BUTTOND();

	@Import("OPLOCE")
	RSClientPacket OPLOCE();

	@Import("OPNPCE")
	RSClientPacket OPNPCE();

	@Import("EVENT_CAMERA_POSITION")
	RSClientPacket EVENT_CAMERA_POSITION();

	@Import("REFLECTION_CHECK_REPLY")
	RSClientPacket REFLECTION_CHECK_REPLY();

	@Import("OPOBJT")
	RSClientPacket OPOBJT();

	@Import("DETECT_MODIFIED_CLIENT")
	RSClientPacket DETECT_MODIFIED_CLIENT();

	@Import("OPOBJE")
	RSClientPacket OPOBJE();

	@Import("RESUME_STRINGDIALOG")
	RSClientPacket RESUME_STRINGDIALOG();

	@Import("IF_BUTTON1")
	RSClientPacket IF_BUTTON1();

	@Import("MOVE_GAMECLICK")
	RSClientPacket MOVE_GAMECLICK();

	@Import("IF_BUTTON3")
	RSClientPacket IF_BUTTON3();

	@Import("IF_BUTTON2")
	RSClientPacket IF_BUTTON2();

	@Import("EVENT_MOUSE_CLICK")
	RSClientPacket EVENT_MOUSE_CLICK();

	@Import("IF_BUTTON10")
	RSClientPacket IF_BUTTON10();

	@Import("WIDGET_TYPE")
	RSClientPacket WIDGET_TYPE();
}
