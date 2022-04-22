import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Llv;")

	field4069("", 0, new class327[]{ class327.field4042 }),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Llv;")

	field4062("", 1, new class327[]{ class327.field4043, class327.field4042 }),
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Llv;")

	field4071("", 2, new class327[]{ class327.field4043, class327.field4044, class327.field4042 }),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Llv;")

	field4065("", 3, new class327[]{ class327.field4043 }),
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Llv;")

	field4064("", 4),
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Llv;")

	field4066("", 5, new class327[]{ class327.field4043, class327.field4042 }),
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Llv;")

	field4079("", 6, new class327[]{ class327.field4042 }),
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Llv;")

	field4067("", 8, new class327[]{ class327.field4043, class327.field4042 }),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"Llv;")

	field4068("", 9, new class327[]{ class327.field4043, class327.field4044 }),
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Llv;")

	field4061("", 10, new class327[]{ class327.field4043 }),
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Llv;")

	field4070("", 11, new class327[]{ class327.field4043 }),
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"Llv;")

	field4077("", 12, new class327[]{ class327.field4043, class327.field4042 }),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"Llv;")

	field4072("", 13, new class327[]{ class327.field4043 });

	@ObfuscatedName("gy")
	@ObfuscatedSignature(descriptor = 
	"Lny;")

	static AbstractSocket field4073;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	426345527)

	@Export("id")
	final int id;
	@ObfuscatedName("d")
	final Set field4074;
	static 
	{
		method6093();
	}

	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I[Llb;)V")

	ModeWhere(String var3, int var4, class327[] var5) {
		this.field4074 = new HashSet();
		this.id = var4;
		class327[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class327 var8 = var6[var7];
			this.field4074.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4074 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)[Llv;", garbageValue = 
	"1573276751")

	static ModeWhere[] method6093() {
		return new ModeWhere[]{ field4079, field4068, field4070, field4061, field4064, field4069, field4072, field4066, field4065, field4067, field4077, field4071, field4062 };
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Ljava/lang/String;ZB)Lph;", garbageValue = 
	"-16")

	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, ("preferences" + var0) + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (WorldMapSection1.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (WorldMapSection1.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(NetSocket.userHomeDirectory, (((("jagex_" + var1) + "_preferences") + var0) + var4) + ".dat");
		AccessFile var6;
		if ((!var2) && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"610665702")

	static final void method6092() {
		class149.method3138("Your ignore list is full. Max of 100 for free users, and 400 for members");
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(descriptor = 
	"(Lky;I)Z", garbageValue = 
	"1543146245")

	static final boolean method6100(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if ((var1 >= 300) && (var1 <= 313)) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if ((var1 >= 314) && (var1 <= 323)) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method5594(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2984, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1436846475")

	static final void method6102() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsInFriendsChat();
		}

	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"126")

	static void method6099(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}}