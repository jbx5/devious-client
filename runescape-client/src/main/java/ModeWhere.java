import java.util.Set;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.IOException;
import java.util.HashSet;
import net.runelite.mapping.Export;
@ObfuscatedName("li")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lli;")
	field4121("", 0, new class327[]{ class327.field4086 }),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lli;")
	field4108("", 1, new class327[]{ class327.field4088, class327.field4086 }),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lli;")
	field4109("", 2, new class327[]{ class327.field4088, class327.field4087, class327.field4086 }),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lli;")
	field4110("", 3, new class327[]{ class327.field4088 }),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lli;")
	field4111("", 4),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lli;")
	field4107("", 5, new class327[]{ class327.field4088, class327.field4086 }),
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lli;")
	field4113("", 6, new class327[]{ class327.field4086 }),
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Lli;")
	field4114("", 8, new class327[]{ class327.field4088, class327.field4086 }),
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lli;")
	field4115("", 9, new class327[]{ class327.field4088, class327.field4087 }),
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Lli;")
	field4116("", 10, new class327[]{ class327.field4088 }),
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lli;")
	field4112("", 11, new class327[]{ class327.field4088 }),
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Lli;")
	field4118("", 12, new class327[]{ class327.field4088, class327.field4086 }),
	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Lli;")
	field4117("", 13, new class327[]{ class327.field4088 });
	@ObfuscatedName("st")
	@ObfuscatedSignature(descriptor = "Las;")
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 476449853)
	@Export("id")
	final int id;

	@ObfuscatedName("l")
	final Set field4119 = new HashSet();

	static {
		method5999();
	}

	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I[Llb;)V")
	ModeWhere(String var3, int var4, class327[] var5) {
		this.id = var4;
		class327[] var6 = var5;
		for (int var7 = 0; var7 < var6.length; ++var7) {
			class327 var8 = var6[var7];
			this.field4119.add(var8);
		}
	}

	ModeWhere(String var3, int var4) {
		this.id = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "104")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)[Lli;", garbageValue = "387775204")
	static ModeWhere[] method5999() {
		return new ModeWhere[]{ field4114, field4112, field4118, field4117, field4108, field4113, field4110, field4111, field4121, field4115, field4107, field4109, field4116 };
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "2023702715")
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;", garbageValue = "210168674")
	static String method6005(String var0, boolean var1) {
		String var2 = (var1) ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}
		String var3 = "";
		if (HitSplatDefinition.field2012 != null) {
			var3 = "/p=" + HitSplatDefinition.field2012;
		}
		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + MilliClock.clientLanguage + "/a=" + UserComparator1.field4765 + var3 + "/";
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-148668422")
	static void method6004(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var2 = new byte[24];
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var2);
				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
				}
				if (var3 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) {
					var2[var4] = -1;
				}
			}
			var0.writeBytes(var2, 0, var2.length);
		}
	}
}