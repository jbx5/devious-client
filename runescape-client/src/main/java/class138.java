import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class138 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class138 field1625;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class138 field1616;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class138 field1620;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class138 field1618;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class138 field1619;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class138 field1617;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1923800361
	)
	final int field1621;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 555624833
	)
	final int field1622;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1212886699
	)
	final int field1623;

	static {
		field1625 = new class138(0, 0, (String)null, 0);
		field1616 = new class138(1, 1, (String)null, 9);
		field1620 = new class138(2, 2, (String)null, 3);
		field1618 = new class138(3, 3, (String)null, 6);
		field1619 = new class138(4, 4, (String)null, 1);
		field1617 = new class138(5, 5, (String)null, 3);
	}

	class138(int var1, int var2, String var3, int var4) {
		this.field1621 = var1;
		this.field1622 = var2;
		this.field1623 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1622;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	int method3473() {
		return this.field1623;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIILir;IB)V",
		garbageValue = "-12"
	)
	@Export("createObjectSound")
	static void createObjectSound(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 16384;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.maxX = (var6 + var1) * 128;
		var5.maxY = (var7 + var2) * 16384;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field832 = var3.int7 * 16384;
		var5.field839 = Math.max(var3.int8 * 16384 - 128, 0);
		var5.field842 = var3.int5;
		var5.field841 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field845 = var5.field842 + (int)(Math.random() * (double)(var5.field841 - var5.field842));
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1740569943"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "65"
	)
	static final void method3480(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class323.cameraPitch < var0) {
			class323.cameraPitch = (var0 - class323.cameraPitch) * class364.field4043 / 1000 + class323.cameraPitch + class150.field1701;
			if (class323.cameraPitch > var0) {
				class323.cameraPitch = var0;
			}
		} else if (class323.cameraPitch > var0) {
			class323.cameraPitch -= (class323.cameraPitch - var0) * class364.field4043 / 1000 + class150.field1701;
			if (class323.cameraPitch < var0) {
				class323.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - class390.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			class390.cameraYaw = var2 * class364.field4043 / 1000 + class390.cameraYaw + class150.field1701;
			class390.cameraYaw &= 2047;
		} else if (var2 < 0) {
			class390.cameraYaw -= class150.field1701 + -var2 * class364.field4043 / 1000;
			class390.cameraYaw &= 2047;
		}

		int var3 = var1 - class390.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			class390.cameraYaw = var1;
		}

	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1614763585"
	)
	static void method3482(int var0, String var1) {
		int var2 = Client.playerUpdateManager.playerCount;
		int[] var3 = Client.playerUpdateManager.playerIndices;
		boolean var4 = false;
		Username var5 = new Username(var1, WorldMapScaleHandler.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = SpriteMask.localPlayer.worldView.players[var3[var6]];
			if (var7 != null && var7 != SpriteMask.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = class113.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					var8.packetBuffer.writeByteSub(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = class113.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteSub(0);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = class113.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShort(var3[var6]);
					var8.packetBuffer.writeByteAdd(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = class113.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortLE(var3[var6]);
					var8.packetBuffer.writeByteSub(0);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			class430.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
