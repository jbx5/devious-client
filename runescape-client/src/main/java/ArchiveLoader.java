import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bj")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "Lns;")
	static Bounds field1022;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive")
	final Archive archive;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -955851169)
	@Export("groupCount")
	final int groupCount;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 982415587)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(descriptor = "(Llc;Ljava/lang/String;)V")
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "102")
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;
		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method5806(var1) || this.archive.method5805(var1)) {
				++this.loadedCount;
			}
		}
		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1248295079")
	public static int method2075(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "280590426")
	static int method2073(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) {
			if (var0 == 3702) {
				++class446.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--class446.Interpreter_intStackSize;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-818413481")
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (Huffman.friendsChat != null) {
			PacketBufferNode var1 = EnumComposition.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}