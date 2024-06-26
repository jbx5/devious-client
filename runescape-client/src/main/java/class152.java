import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class152 extends class147 {
	@ObfuscatedName("dv")
	static boolean field1724;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 243421889
	)
	int field1721;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1954655977
	)
	int field1718;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 919033843
	)
	int field1719;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 814487451
	)
	int field1717;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class152(class150 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "118"
	)
	void vmethod3528(Buffer var1) {
		this.field1721 = var1.readInt();
		this.field1717 = var1.readInt();
		this.field1718 = var1.readUnsignedByte();
		this.field1719 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgk;B)V",
		garbageValue = "3"
	)
	void vmethod3530(ClanSettings var1) {
		var1.method3365(this.field1721, this.field1717, this.field1718, this.field1719);
	}

	@ObfuscatedName("aq")
	public static String method3299(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0));
		int var2 = Calendar.Calendar_calendar.get(7);
		int var3 = Calendar.Calendar_calendar.get(5);
		int var4 = Calendar.Calendar_calendar.get(2);
		int var5 = Calendar.Calendar_calendar.get(1);
		int var6 = Calendar.Calendar_calendar.get(11);
		int var7 = Calendar.Calendar_calendar.get(12);
		int var8 = Calendar.Calendar_calendar.get(13);
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}
}
