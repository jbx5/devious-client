import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.util.Date;

@ObfuscatedName("dk")
public class class119 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1449;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1439;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1440;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1441;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1442;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1446;
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1444;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1443;
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1455;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1447;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1448;
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1451;
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1450;
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1445;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1457;
	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1452;
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"Ldk;")

	static final class119 field1454;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	-1189647423)

	final int field1438;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	590424235)

	final int field1456;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	-1848047837)

	final int field1453;
	static 
	{
		field1449 = new class119(0, 0, ((String) (null)), -1, -1);
		field1439 = new class119(1, 1, ((String) (null)), 0, 2);
		field1440 = new class119(2, 2, ((String) (null)), 1, 2);
		field1441 = new class119(3, 3, ((String) (null)), 2, 2);
		field1442 = new class119(4, 4, ((String) (null)), 3, 1);
		field1446 = new class119(5, 5, ((String) (null)), 4, 1);
		field1444 = new class119(6, 6, ((String) (null)), 5, 1);
		field1443 = new class119(7, 7, ((String) (null)), 6, 3);
		field1455 = new class119(8, 8, ((String) (null)), 7, 3);
		field1447 = new class119(9, 9, ((String) (null)), 8, 3);
		field1448 = new class119(10, 10, ((String) (null)), 0, 7);
		field1451 = new class119(11, 11, ((String) (null)), 1, 7);
		field1450 = new class119(12, 12, ((String) (null)), 2, 7);
		field1445 = new class119(13, 13, ((String) (null)), 3, 7);
		field1457 = new class119(14, 14, ((String) (null)), 4, 7);
		field1452 = new class119(15, 15, ((String) (null)), 5, 7);
		field1454 = new class119(16, 16, ((String) (null)), 0, 5);
	}

	@ObfuscatedSignature(descriptor = 
	"(IILjava/lang/String;II)V", garbageValue = 
	"-1")

	class119(int var1, int var2, String var3, int var4, int var5) {
		this.field1438 = var1;
		this.field1456 = var2;
		this.field1453 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1456;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1943929497")

	int method2751() {
		return this.field1453;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(descriptor = 
	"([Lky;II)V", garbageValue = 
	"-908944822")

	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (((var3 != null) && (var3.parentId == var1)) && ((!var3.isIf3) || (!class1.isComponentHidden(var3)))) {
				if (var3.type == 0) {
					if (((!var3.isIf3) && class1.isComponentHidden(var3)) && (var3 != DevicePcmPlayerProvider.mousedOverWidgetIf1)) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var3.id)))));
					if (var4 != null) {
						class115.method2680(var4.group);
					}
				}

				if (var3.type == 6) {
					int var5;
					if ((var3.sequenceId != (-1)) || (var3.sequenceId2 != (-1))) {
						boolean var7 = Skills.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != (-1)) {
							SequenceDefinition var6 = class163.SequenceDefinition_get(var5);

							for (var3.modelFrameCycle += Client.field556; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class346.invalidateWidget(var3)) {
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
								++var3.modelFrame;
								if (var3.modelFrame >= var6.frameIds.length) {
									var3.modelFrame -= var6.frameCount;
									if ((var3.modelFrame < 0) || (var3.modelFrame >= var6.frameIds.length)) {
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if ((var3.field3392 != 0) && (!var3.isIf3)) {
						int var8 = var3.field3392 >> 16;
						var5 = (var3.field3392 << 16) >> 16;
						var8 *= Client.field556;
						var5 *= Client.field556;
						var3.modelAngleX = (var8 + var3.modelAngleX) & 2047;
						var3.modelAngleY = (var5 + var3.modelAngleY) & 2047;
						class346.invalidateWidget(var3);
					}
				}
			}
		}

	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"1036888479")

	static void method2760(String var0) {
		class65.field868 = var0;

		try {
			String var1 = class127.client.getParameter(Integer.toString(18));
			String var2 = class127.client.getParameter(Integer.toString(13));
			String var3 = (((var1 + "settings=") + var0) + "; version=1; path=/; domain=") + var2;
			String var5;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = class136.method2931() + 94608000000L;
				Calendar.Calendar_calendar.setTime(new Date(var6));
				int var8 = Calendar.Calendar_calendar.get(7);
				int var9 = Calendar.Calendar_calendar.get(5);
				int var10 = Calendar.Calendar_calendar.get(2);
				int var11 = Calendar.Calendar_calendar.get(1);
				int var12 = Calendar.Calendar_calendar.get(11);
				int var13 = Calendar.Calendar_calendar.get(12);
				int var14 = Calendar.Calendar_calendar.get(13);
				var5 = ((((((((((((((((Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", ") + (var9 / 10)) + (var9 % 10)) + "-") + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10]) + "-") + var11) + " ") + (var12 / 10)) + (var12 % 10)) + ":") + (var13 / 10)) + (var13 % 10)) + ":") + (var14 / 10)) + (var14 % 10)) + " GMT";
				var3 = ((var4 + var5) + "; Max-Age=") + 94608000L;
			}

			Client var16 = class127.client;
			var5 = ("document.cookie=\"" + var3) + "\"";
			//JSObject.getWindow(var16).eval(var5);
		} catch (Throwable var15) {
		}

	}
}