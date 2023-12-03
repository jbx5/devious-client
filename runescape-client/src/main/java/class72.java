import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ch")
public class class72 {
	@ObfuscatedName("ab")
	static final BigInteger field870;
	@ObfuscatedName("au")
	static final BigInteger field871;

	static {
		field870 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field871 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lep;",
		garbageValue = "1917414227"
	)
	static class129 method2135(int var0) {
		class129[] var1 = new class129[]{class129.field1513, class129.field1514, class129.field1512, class129.field1518, class129.field1510};
		class129 var2 = (class129)class12.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class129.field1513;
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method2136() {
		class182.field2007.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lol;IS)V",
		garbageValue = "-25767"
	)
	public static void method2137(AbstractArchive var0, int var1) {
		if (!class316.field3424.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class316.field3424.iterator();

			while (var3.hasNext()) {
				MusicSong var4 = (MusicSong)var3.next();
				var4.field3524 = false;
				var4.field3536 = false;
				var4.field3530 = false;
				var4.field3526 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3528 = 0.0F;
				var2.add(var4);
			}

			PendingSpawn.method2459(var2, class316.musicPlayerStatus, class316.field3418, class316.field3419, class316.field3417, false);
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1084979795"
	)
	static int method2138(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class9.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = WorldMapIcon_1.clientPreferences.getWindowMode();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--DbTableType.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					WorldMapIcon_1.clientPreferences.updateWindowMode(var3);
				}

				return 1;
			}
		}
	}
}
