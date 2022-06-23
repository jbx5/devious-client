import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("m")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
	@ObfuscatedName("w")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;

	@ObfuscatedName("hx")
	@ObfuscatedSignature(descriptor = "Lmt;")
	@Export("fontPlain12")
	static Font fontPlain12;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)Lar;", garbageValue = "71")
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "933240326")
	static int method305(int var0) {
		Message var1 = ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message) (var1.nextDual)).count;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V", garbageValue = "-1946812407")
	static final void method309(String var0, int var1) {
		PacketBufferNode var2 = EnumComposition.getPacketBufferNode(ClientPacket.field2971, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeByteAdd(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZB)V", garbageValue = "20")
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;
		for (int var4 = 0; var4 < PacketBufferNode.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = EnumComposition.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					HealthBarUpdate.foundItemIdCount = -1;
					class10.foundItemIds = null;
					return;
				}
				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];
					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}
					var2 = var6;
				}
				var2[var3++] = ((short) (var4));
			}
		}
		class10.foundItemIds = var2;
		TriBool.foundItemIndex = 0;
		HealthBarUpdate.foundItemIdCount = var3;
		String[] var8 = new String[HealthBarUpdate.foundItemIdCount];
		for (int var5 = 0; var5 < HealthBarUpdate.foundItemIdCount; ++var5) {
			var8[var5] = EnumComposition.ItemDefinition_get(var2[var5]).name;
		}
		short[] var10 = class10.foundItemIds;
		ObjectSound.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}