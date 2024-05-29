import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1333731967
	)
	@Export("os")
	public int os;
	@ObfuscatedName("bl")
	@Export("arch64")
	boolean arch64;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 48225155
	)
	@Export("osVersion")
	int osVersion;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1130035443
	)
	@Export("vendor")
	int vendor;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2075561049
	)
	@Export("javaMajor")
	int javaMajor;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1055521719
	)
	@Export("javaMinor")
	int javaMinor;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -678989481
	)
	@Export("javaPatch")
	int javaPatch;
	@ObfuscatedName("bp")
	@Export("field4524")
	boolean field4524;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 2109912297
	)
	@Export("maxMemory")
	int maxMemory;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1144840647
	)
	@Export("cpuCores")
	int cpuCores;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1274393823
	)
	@Export("field4527")
	int field4527;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1481322487
	)
	@Export("clockSpeed")
	int clockSpeed;
	@ObfuscatedName("bq")
	@Export("field4536")
	String field4536;
	@ObfuscatedName("bj")
	@Export("field4514")
	String field4514;
	@ObfuscatedName("bc")
	@Export("field4528")
	String field4528;
	@ObfuscatedName("bz")
	@Export("field4532")
	String field4532;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 715881903
	)
	@Export("field4512")
	int field4512;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1975114093
	)
	@Export("field4534")
	int field4534;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 567706703
	)
	@Export("field4535")
	int field4535;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1954892853
	)
	@Export("field4530")
	int field4530;
	@ObfuscatedName("ck")
	@Export("field4537")
	String field4537;
	@ObfuscatedName("cn")
	@Export("field4538")
	String field4538;
	@ObfuscatedName("ch")
	@Export("field4539")
	int[] field4539;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -40810841
	)
	@Export("field4540")
	int field4540;
	@ObfuscatedName("cd")
	@Export("field4541")
	String field4541;
	@ObfuscatedName("cs")
	@Export("field4542")
	String field4542;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26, String var27) {
		this.field4539 = new int[3];
		this.os = var1;
		this.arch64 = var2;
		this.osVersion = var3;
		this.vendor = var4;
		this.javaMajor = var5;
		this.javaMinor = var6;
		this.javaPatch = var7;
		this.field4524 = var8;
		this.maxMemory = var9;
		this.cpuCores = var10;
		this.field4527 = var11;
		this.clockSpeed = var12;
		this.field4536 = var13;
		this.field4514 = var14;
		this.field4528 = var15;
		this.field4532 = var16;
		this.field4512 = var17;
		this.field4534 = var18;
		this.field4535 = var19;
		this.field4530 = var20;
		this.field4537 = var21;
		this.field4538 = var22;
		this.field4539 = var23;
		this.field4540 = var24;
		this.field4541 = var25;
		this.field4542 = var26;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)V",
		garbageValue = "-125"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9);
		var1.writeByte(this.os);
		var1.writeByte(this.arch64 ? 1 : 0);
		var1.writeShort(this.osVersion);
		var1.writeByte(this.vendor);
		var1.writeByte(this.javaMajor);
		var1.writeByte(this.javaMinor);
		var1.writeByte(this.javaPatch);
		var1.writeByte(this.field4524 ? 1 : 0);
		var1.writeShort(this.maxMemory);
		var1.writeByte(this.cpuCores);
		var1.writeMedium(this.field4527);
		var1.writeShort(this.clockSpeed);
		var1.writeStringCp1252NullCircumfixed(this.field4536);
		var1.writeStringCp1252NullCircumfixed(this.field4514);
		var1.writeStringCp1252NullCircumfixed(this.field4528);
		var1.writeStringCp1252NullCircumfixed(this.field4532);
		var1.writeByte(this.field4534);
		var1.writeShort(this.field4512);
		var1.writeStringCp1252NullCircumfixed(this.field4537);
		var1.writeStringCp1252NullCircumfixed(this.field4538);
		var1.writeByte(this.field4535);
		var1.writeByte(this.field4530);

		for (int var2 = 0; var2 < this.field4539.length; ++var2) {
			var1.writeInt(this.field4539[var2]);
		}

		var1.writeInt(this.field4540);
		var1.writeStringCp1252NullCircumfixed(this.field4541);
		var1.writeStringCp1252NullCircumfixed(this.field4542);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + MusicPatchNode.method6481(this.field4536);
		var2 += MusicPatchNode.method6481(this.field4514);
		var2 += MusicPatchNode.method6481(this.field4528);
		var2 += MusicPatchNode.method6481(this.field4532);
		var2 += MusicPatchNode.method6481(this.field4537);
		var2 += MusicPatchNode.method6481(this.field4538);
		var2 += MusicPatchNode.method6481(this.field4541);
		var2 += MusicPatchNode.method6481(this.field4542);
		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2105599574"
	)
	@Export("getDeviceId")
	public String getDeviceId(int var1) {
		String var2 = "";
		String var3 = "12345678-0000-0000-0000-123456789012";
		switch(var1) {
		case 1:
			var2 = "wmic csproduct get UUID";
			break;
		case 2:
			var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
			break;
		case 3:
			var2 = "cat /etc/machine-id";
			break;
		default:
			return "Unknown";
		}

		try {
			Process var4 = Runtime.getRuntime().exec(var2);
			BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
			StringBuilder var6 = new StringBuilder();

			String var7;
			while ((var7 = var5.readLine()) != null) {
				var6.append(var7 + "\n");
			}

			if (var1 == 1) {
				var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim();
			} else if (var1 == 2) {
				int var8 = var6.indexOf("UUID: ") + 36;
				var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", "");
			} else if (var1 == 3) {
				if (var6.length() == 33) {
					var6 = new StringBuilder(var6.substring(0, var6.length() - 1));
				}

				if (var6.length() == 32) {
					var6.insert(20, "-");
					var6.insert(16, "-");
					var6.insert(12, "-");
					var6.insert(8, "-");
					var3 = var6.toString();
				} else {
					var3 = "12345678-0000-0000-0000-123456789012";
				}
			}
		} catch (IOException var9) {
		}

		return var3;
	}
}
