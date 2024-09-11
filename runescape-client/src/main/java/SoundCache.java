import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = 1287819237
	)
	static int field303;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	AbstractArchive field299;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	NodeHashTable field301;

	@ObfuscatedSignature(
		descriptor = "(Lpo;Lpo;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field301 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field299 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbg;",
		garbageValue = "-443149635"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method886(var1, var2, false);
		class53 var6 = (class53)this.field301.get(var4);
		if (var6 != null) {
			return var6.method1102();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field301.put(new class53(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lch;",
		garbageValue = "25"
	)
	class53 method868(int var1, int var2) {
		long var3 = this.method886(var1, var2, true);
		class53 var5 = (class53)this.field301.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field299, var1, var2);
			if (var6 == null) {
				return new class53();
			} else {
				class53 var7 = new class53(var6);
				this.field301.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbg;",
		garbageValue = "-1029713700"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lch;",
		garbageValue = "2050895161"
	)
	public class53 method869(int var1) {
		if (this.field299.getGroupCount() == 1) {
			return this.method868(0, var1);
		} else if (this.field299.getGroupFileCount(var1) == 1) {
			return this.method868(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lbg;",
		garbageValue = "-1316673194"
	)
	public RawSound method870(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIZB)J",
		garbageValue = "0"
	)
	long method886(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V",
		garbageValue = "-709662873"
	)
	static void method890(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class31.field143.startsWith("win") && !var3) {
				class132.method3255(var0, 0, "openjs");
				return;
			}

			if (class31.field143.startsWith("mac")) {
				class132.method3255(var0, 1, var2);
				return;
			}

			class132.method3255(var0, 2, "openjs");
		} else {
			class132.method3255(var0, 3, "openjs");
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	public static void method889() {
		class334.field3619.clear();
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "1001737590"
	)
	@Export("insertMenuItem")
	static final int insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (Client.isMenuOpen) {
			return -1;
		} else {
			int var10 = var2;
			if (var2 >= 2000) {
				var10 = var2 - 2000;
			}

			boolean var11 = var8 == HealthBarUpdate.field1304 || var8 == -1;
			boolean var12;
			if (!var11) {
				var12 = var10 == 2 || var10 == 8 || var10 == 25 || var10 == 17 || var10 == 25;
				var11 = var12;
			}

			var12 = var11 || class537.method9779(var10);
			if (!var12) {
				boolean var13 = var10 == 1002 || var10 == 1003 || var10 == 1004;
				var12 = var13;
			}

			return !var12 ? -1 : Client.menu.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, var7, var8);
		}
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-114"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class168.friendsChat != null) {
			PacketBufferNode var1 = class141.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class536.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1641670217"
	)
	static final void method888(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3726()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = class141.getPacketBufferNode(ClientPacket.field3338, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + class536.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}
