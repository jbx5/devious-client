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

	@Import("field2909")
	RSClientPacket OPOBJ1();

	@Import("field2974")
	RSClientPacket IF_BUTTON9();

	@Import("field2995")
	RSClientPacket RESUME_PAUSEBUTTON();

	@Import("field2946")
	RSClientPacket RESUME_P_COUNTDIALOG();

	@Import("field2996")
	RSClientPacket IF_BUTTON8();

	@Import("field2961")
	RSClientPacket OPOBJ5();

	@Import("field2905")
	RSClientPacket IF_BUTTON5();

	@Import("field2955")
	RSClientPacket OPOBJ4();

	@Import("field2915")
	RSClientPacket IF_BUTTON4();

	@Import("field2920")
	RSClientPacket OPOBJ3();

	@Import("field2963")
	RSClientPacket IF_BUTTON7();

	@Import("field2919")
	RSClientPacket OPOBJ2();

	@Import("field2954")
	RSClientPacket IF_BUTTON6();

	@Import("field2992")
	RSClientPacket OPLOCT();

	@Import("field2911")
	RSClientPacket OPNPCT();

	@Import("field2924")
	RSClientPacket OPPLAYERT();

	@Import("field2928")
	RSClientPacket RESUME_P_NAMEDIALOG();

	@Import("field2985")
	RSClientPacket RESUME_P_STRINGDIALOG();

	@Import("field2980")
	RSClientPacket OPOBJT();

	@Import("field2925")
	RSClientPacket IF_BUTTONT();

	@Import("field2927")
	RSClientPacket RESUME_P_OBJDIALOG();

	@Import("field2948")
	RSClientPacket OPNPC2();

	@Import("field2965")
	RSClientPacket OPPLAYER6();

	@Import("field2984")
	RSClientPacket OPNPC3();

	@Import("field2947")
	RSClientPacket OPPLAYER7();

	@Import("field3003")
	RSClientPacket OPLOC2();

	@Import("field2959")
	RSClientPacket OPPLAYER8();

	@Import("field3005")
	RSClientPacket OPLOC1();

	@Import("field2939")
	RSClientPacket OPNPC1();

	@Import("field2936")
	RSClientPacket OPLOC4();

	@Import("field2994")
	RSClientPacket OPPLAYER2();

	@Import("field3009")
	RSClientPacket OPLOC3();

	@Import("field2986")
	RSClientPacket OPPLAYER3();

	@Import("field2940")
	RSClientPacket OPNPC4();

	@Import("field2991")
	RSClientPacket OPPLAYER4();

	@Import("field2907")
	RSClientPacket OPNPC5();

	@Import("field2953")
	RSClientPacket OPPLAYER5();

	@Import("field2937")
	RSClientPacket OPLOC5();

	@Import("field2987")
	RSClientPacket CLOSE_MODAL();

	@Import("field2970")
	RSClientPacket OPPLAYER1();

	@Import("field2962")
	RSClientPacket MOVE_GAMECLICK();

	@Import("field2934")
	RSClientPacket IF_BUTTON1();

	@Import("field2930")
	RSClientPacket IF_BUTTON3();

	@Import("field2983")
	RSClientPacket IF_BUTTON2();

	@Import("field2957")
	RSClientPacket EVENT_MOUSE_CLICK();

	@Import("field2952")
	RSClientPacket IF_BUTTON10();
}
