import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.File;
import net.runelite.mapping.Export;
@ObfuscatedName("ff")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;

	@ObfuscatedName("c")
	long[] field1788;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 822358683)
	int field1787;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -39184651)
	int field1789;

	@ObfuscatedName("f")
	@ObfuscatedGetter(longValue = -7252286742317130981L)
	long field1794;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 187442115)
	int field1791;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 117006029)
	int field1792;

	MilliClock() {
		this.field1788 = new long[10];
		this.field1787 = 256;
		this.field1789 = 1;
		this.field1791 = 0;
		this.field1794 = class115.method2692();
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1788[var1] = this.field1794;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "814382249")
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1788[var1] = 0L;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "-83")
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1787;
		int var4 = this.field1789;
		this.field1787 = 300;
		this.field1789 = 1;
		this.field1794 = class115.method2692();
		if (this.field1788[this.field1792] == 0L) {
			this.field1787 = var3;
			this.field1789 = var4;
		} else if (this.field1794 > this.field1788[this.field1792]) {
			this.field1787 = ((int) (((long) (var1 * 2560)) / (this.field1794 - this.field1788[this.field1792])));
		}
		if (this.field1787 < 25) {
			this.field1787 = 25;
		}
		if (this.field1787 > 256) {
			this.field1787 = 256;
			this.field1789 = ((int) (((long) (var1)) - (this.field1794 - this.field1788[this.field1792]) / 10L));
		}
		if (this.field1789 > var1) {
			this.field1789 = var1;
		}
		this.field1788[this.field1792] = this.field1794;
		this.field1792 = (this.field1792 + 1) % 10;
		int var5;
		if (this.field1789 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field1788[var5] != 0L) {
					this.field1788[var5] += ((long) (this.field1789));
				}
			}
		}
		if (this.field1789 < var2) {
			this.field1789 = var2;
		}
		DynamicObject.method1991(((long) (this.field1789)));
		for (var5 = 0; this.field1791 < 256; this.field1791 += this.field1787) {
			++var5;
		}
		this.field1791 &= 255;
		return var5;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/io/File;I)V", garbageValue = "88445335")
	static void method3309(File var0) {
		FileSystem.FileSystem_cacheDir = var0;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "-1")
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqc;")
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = ((RunException) (var0));
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}
		return var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)[Lcm;", garbageValue = "-325604576")
	static class83[] method3310() {
		return new class83[]{ class83.field1079, class83.field1075, class83.field1078, class83.field1074, class83.field1077, class83.field1084 };
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-631328346")
	public static void method3301() {
		DbTableType.DBTableType_cache.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "-535597968")
	static int method3308(int var0, Script var1, boolean var2) {
		if (var0 == 6900) {
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 6950) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1241772972")
	static void method3304() {
		if (Client.oculusOrbState == 1) {
			Client.field533 = true;
		}
	}
}