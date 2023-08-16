import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public class class416 {
	@ObfuscatedName("ag")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1333151916"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2143808168"
	)
	static final void method7711(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class129.cameraPitch < var0) {
			class129.cameraPitch = (var0 - class129.cameraPitch) * WorldMapElement.field1963 / 1000 + class129.cameraPitch + class33.field188;
			if (class129.cameraPitch > var0) {
				class129.cameraPitch = var0;
			}
		} else if (class129.cameraPitch > var0) {
			class129.cameraPitch -= (class129.cameraPitch - var0) * WorldMapElement.field1963 / 1000 + class33.field188;
			if (class129.cameraPitch < var0) {
				class129.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - UserComparator10.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			UserComparator10.cameraYaw = UserComparator10.cameraYaw + class33.field188 + var2 * WorldMapElement.field1963 / 1000;
			UserComparator10.cameraYaw &= 2047;
		} else if (var2 < 0) {
			UserComparator10.cameraYaw -= -var2 * WorldMapElement.field1963 / 1000 + class33.field188;
			UserComparator10.cameraYaw &= 2047;
		}

		int var3 = var1 - UserComparator10.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			UserComparator10.cameraYaw = var1;
		}

	}
}
