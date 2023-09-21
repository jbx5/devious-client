import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class148 {
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = -37105280
	)
	static int field1663;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -5997986403170915367L
	)
	long field1669;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1589522901
	)
	public int field1661;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	IterableNodeDeque field1662;

	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public class148(Buffer var1) {
		this.field1661 = -1;
		this.field1662 = new IterableNodeDeque();
		this.method3171(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-2147364614"
	)
	void method3171(Buffer var1) {
		this.field1669 = var1.readLong();
		this.field1661 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class167(this);
			} else if (var2 == 1) {
				var3 = new class143(this);
			} else if (var2 == 13) {
				var3 = new class160(this);
			} else if (var2 == 4) {
				var3 = new class152(this);
			} else if (var2 == 6) {
				var3 = new class159(this);
			} else if (var2 == 5) {
				var3 = new class144(this);
			} else if (var2 == 2) {
				var3 = new class149(this);
			} else if (var2 == 7) {
				var3 = new class142(this);
			} else if (var2 == 14) {
				var3 = new class146(this);
			} else if (var2 == 8) {
				var3 = new class163(this);
			} else if (var2 == 9) {
				var3 = new class169(this);
			} else if (var2 == 10) {
				var3 = new class155(this);
			} else if (var2 == 11) {
				var3 = new class150(this);
			} else if (var2 == 12) {
				var3 = new class154(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class164(this);
			}

			((class145)var3).vmethod3414(var1);
			this.field1662.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "-170736557"
	)
	public void method3167(ClanSettings var1) {
		if (this.field1669 == var1.field1703 && this.field1661 == var1.field1704) {
			for (class145 var2 = (class145)this.field1662.last(); var2 != null; var2 = (class145)this.field1662.previous()) {
				var2.vmethod3415(var1);
			}

			++var1.field1704;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "-1776229004"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-2128582813"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZB)V",
		garbageValue = "7"
	)
	public static void method3166(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class319.field3428.clear();
			class319.field3435.clear();
			Script.method2215(var5);
			GrandExchangeOfferNameComparator.method7053(var0, var5);
			if (!class319.field3428.isEmpty()) {
				MouseHandler.method682(var1, var2, var3, var4);
				class319.field3435.add(new AddRequestTask((SongTask)null));
				class319.field3435.add(new class423((SongTask)null, class319.field3439, class319.field3429, class319.field3432));
				ArrayList var6 = new ArrayList();
				var6.add(new class418(new FadeInTask((SongTask)null, 0, true, class319.field3430)));
				if (!class319.musicSongs.isEmpty()) {
					ArrayList var7 = new ArrayList();
					var7.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var6), class319.field3436));
					ArrayList var9 = new ArrayList();
					Iterator var10 = class319.musicSongs.iterator();

					while (var10.hasNext()) {
						MusicSong var11 = (MusicSong)var10.next();
						var9.add(var11);
					}

					var7.add(new DelayFadeTask(new FadeOutTask(new class416((SongTask)null, var9), 0, false, class319.field3438), class319.musicPlayerStatus));
					class319.field3435.add(new ConcurrentMidiTask((SongTask)null, var7));
				} else {
					class319.field3435.add(new DelayFadeTask((SongTask)null, class319.field3436));
					class319.field3435.add(new ConcurrentMidiTask((SongTask)null, var6));
				}

			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1919662235"
	)
	static void method3175() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			AbstractWorldMapIcon.setLoginResponseString("", "Please enter your username/email address.", "");
		} else if (Login.Login_password.length() == 0) {
			AbstractWorldMapIcon.setLoginResponseString("", "Please enter your password.", "");
		} else {
			AbstractWorldMapIcon.setLoginResponseString("", "Connecting to server...", "");
			UserComparator6.method2942(false);
			DefaultsGroup.updateGameState(20);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "49"
	)
	static final void method3179(String var0, int var1) {
		PacketBufferNode var2 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3135, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class478.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.writeByteNeg(var1);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-54"
	)
	static final void method3177() {
		if (Client.logoutTimer > 0) {
			CollisionMap.logOut();
		} else {
			Client.timer.method7836();
			DefaultsGroup.updateGameState(40);
			class11.field59 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
