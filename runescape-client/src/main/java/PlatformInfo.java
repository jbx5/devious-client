import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1491327705
	)
	int os;
	@ObfuscatedName("aa")
	boolean field4518;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1770862873
	)
	int osVersion;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 168679747
	)
	int vendor;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 788596425
	)
	int javaMajor;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1793496309
	)
	int javaMinor;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1553431275
	)
	int javaPatch;
	@ObfuscatedName("ad")
	boolean field4524;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1639768545
	)
	int maxMemory;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1260912817
	)
	int cpuCores;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1168171821
	)
	int field4527;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 121638841
	)
	int clockSpeed;
	@ObfuscatedName("ay")
	String field4536;
	@ObfuscatedName("ag")
	String field4514;
	@ObfuscatedName("aw")
	String field4528;
	@ObfuscatedName("ah")
	String field4532;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 104379723
	)
	int field4512;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1336079991
	)
	int field4534;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1881657771
	)
	int field4535;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 733268679
	)
	int field4530;
	@ObfuscatedName("bw")
	String field4537;
	@ObfuscatedName("bc")
	String field4538;
	@ObfuscatedName("bv")
	int[] field4539;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 28181965
	)
	int field4540;
	@ObfuscatedName("bj")
	String field4541;
	@ObfuscatedName("by")
	String field4542;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4539 = new int[3]; // L: 62
		this.os = var1; // L: 68
		this.field4518 = var2; // L: 69
		this.osVersion = var3; // L: 70
		this.vendor = var4; // L: 71
		this.javaMajor = var5; // L: 72
		this.javaMinor = var6; // L: 73
		this.javaPatch = var7; // L: 74
		this.field4524 = var8; // L: 75
		this.maxMemory = var9; // L: 76
		this.cpuCores = var10; // L: 77
		this.field4527 = var11; // L: 78
		this.clockSpeed = var12; // L: 79
		this.field4536 = var13; // L: 80
		this.field4514 = var14; // L: 81
		this.field4528 = var15; // L: 82
		this.field4532 = var16; // L: 83
		this.field4512 = var17; // L: 84
		this.field4534 = var18; // L: 85
		this.field4535 = var19; // L: 86
		this.field4530 = var20; // L: 87
		this.field4537 = var21; // L: 88
		this.field4538 = var22; // L: 89
		this.field4539 = var23; // L: 90
		this.field4540 = var24; // L: 91
		this.field4541 = var25; // L: 92
		this.field4542 = var26; // L: 93
	} // L: 94

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;S)V",
		garbageValue = "2713"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9); // L: 97
		var1.writeByte(this.os); // L: 98
		var1.writeByte(this.field4518 ? 1 : 0); // L: 99
		var1.writeShort(this.osVersion); // L: 100
		var1.writeByte(this.vendor); // L: 101
		var1.writeByte(this.javaMajor); // L: 102
		var1.writeByte(this.javaMinor); // L: 103
		var1.writeByte(this.javaPatch); // L: 104
		var1.writeByte(this.field4524 ? 1 : 0); // L: 105
		var1.writeShort(this.maxMemory); // L: 106
		var1.writeByte(this.cpuCores); // L: 107
		var1.writeMedium(this.field4527); // L: 108
		var1.writeShort(this.clockSpeed); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4536); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4514); // L: 111
		var1.writeStringCp1252NullCircumfixed(this.field4528); // L: 112
		var1.writeStringCp1252NullCircumfixed(this.field4532); // L: 113
		var1.writeByte(this.field4534); // L: 114
		var1.writeShort(this.field4512); // L: 115
		var1.writeStringCp1252NullCircumfixed(this.field4537); // L: 116
		var1.writeStringCp1252NullCircumfixed(this.field4538); // L: 117
		var1.writeByte(this.field4535); // L: 118
		var1.writeByte(this.field4530); // L: 119

		for (int var2 = 0; var2 < this.field4539.length; ++var2) { // L: 120
			var1.writeInt(this.field4539[var2]);
		}

		var1.writeInt(this.field4540); // L: 121
		var1.writeStringCp1252NullCircumfixed(this.field4541); // L: 122
		var1.writeStringCp1252NullCircumfixed(this.field4542); // L: 123
	} // L: 124

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "853872720"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 127
		int var2 = var1 + class142.method3185(this.field4536); // L: 128
		var2 += class142.method3185(this.field4514); // L: 129
		var2 += class142.method3185(this.field4528); // L: 130
		var2 += class142.method3185(this.field4532); // L: 131
		var2 += class142.method3185(this.field4537); // L: 132
		var2 += class142.method3185(this.field4538); // L: 133
		var2 += class142.method3185(this.field4541); // L: 134
		var2 += class142.method3185(this.field4542); // L: 135
		return var2; // L: 136
	}
}
