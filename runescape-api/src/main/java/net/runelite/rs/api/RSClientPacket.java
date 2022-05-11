package net.runelite.rs.api;

import net.runelite.api.packets.ClientPacket;
import net.runelite.mapping.Import;

public interface RSClientPacket extends ClientPacket
{
	public static final String OPOBJ1 = "field3013";
	public static final String IF_BUTTON9 = "field3015";
	public static final String RESUME_PAUSEBUTTON = "field2967";
	public static final String RESUME_P_COUNTDIALOG = "field2972";
	public static final String IF_BUTTON8 = "field2989";
	public static final String OPOBJ5 = "field2978";
	public static final String IF_BUTTON5 = "field2960";
	public static final String OPOBJ4 = "field2976";
	public static final String IF_BUTTON4 = "field2956";
	public static final String OPOBJ3 = "field2997";
	public static final String IF_BUTTON7 = "field3002";
	public static final String OPOBJ2 = "field2987";
	public static final String IF_BUTTON6 = "field2968";
	public static final String OPLOCT = "field3057";
	public static final String OPNPCT = "field2984";
	public static final String OPPLAYERT = "field3022";
	public static final String RESUME_P_NAMEDIALOG = "field3048";
	public static final String RESUME_P_STRINGDIALOG = "field3033";
	public static final String OPOBJT = "field3010";
	public static final String IF_BUTTONT = "field2963";
	public static final String OPNPC2 = "field3030";
	public static final String OPPLAYER6 = "field2969";
	public static final String OPNPC3 = "field3036";
	public static final String OPPLAYER7 = "field2980";
	public static final String OPLOC2 = "field3049";
	public static final String OPPLAYER8 = "field3019";
	public static final String OPLOC1 = "field2990";
	public static final String OPNPC1 = "field3004";
	public static final String OPLOC4 = "field2999";
	public static final String OPPLAYER2 = "field2975";
	public static final String OPLOC3 = "field3041";
	public static final String OPPLAYER3 = "field3003";
	public static final String OPNPC4 = "field2977";
	public static final String OPPLAYER4 = "field2962";
	public static final String OPNPC5 = "field3046";
	public static final String OPPLAYER5 = "field2995";
	public static final String OPLOC5 = "field2994";
	public static final String CLOSE_MODAL = "field3001";
	public static final String OPPLAYER1 = "field2965";
	public static final String MOVE_GAMECLICK = "field2957";
	public static final String IF_BUTTON1 = "field3006";
	public static final String IF_BUTTON3 = "field3011";
	public static final String IF_BUTTON2 = "field3032";
	public static final String EVENT_MOUSE_CLICK = "field3051";
	public static final String IF_BUTTON10 = "field3043";
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
