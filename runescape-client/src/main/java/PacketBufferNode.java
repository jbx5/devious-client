import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jt")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "[Ljt;")
	@Export("PacketBufferNode_packetBufferNodes")
	public static PacketBufferNode[] PacketBufferNode_packetBufferNodes;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 24720885)
	@Export("PacketBufferNode_packetBufferNodeCount")
	public static int PacketBufferNode_packetBufferNodeCount;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -1221486625)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lju;")
	@Export("clientPacket")
	public ClientPacket clientPacket;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -668428043)
	@Export("clientPacketLength")
	public int clientPacketLength;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lpq;")
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -515140623)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-10")
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode.PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1959147234")
	public static void method5202() {
		class33.reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1179746293")
	public static void method5200(int var0, int var1) {
		VarbitComposition var2 = WorldMapCacheName.method5054(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}
		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(CI)C", garbageValue = "-936573581")
	static char method5203(char var0) {
		switch (var0) {
			case ' ' :
			case '-' :
			case '_' :
			case ' ' :
				return '_';
			case '#' :
			case '[' :
			case ']' :
				return var0;
			case 'À' :
			case 'Á' :
			case 'Â' :
			case 'Ã' :
			case 'Ä' :
			case 'à' :
			case 'á' :
			case 'â' :
			case 'ã' :
			case 'ä' :
				return 'a';
			case 'Ç' :
			case 'ç' :
				return 'c';
			case 'È' :
			case 'É' :
			case 'Ê' :
			case 'Ë' :
			case 'è' :
			case 'é' :
			case 'ê' :
			case 'ë' :
				return 'e';
			case 'Í' :
			case 'Î' :
			case 'Ï' :
			case 'í' :
			case 'î' :
			case 'ï' :
				return 'i';
			case 'Ñ' :
			case 'ñ' :
				return 'n';
			case 'Ò' :
			case 'Ó' :
			case 'Ô' :
			case 'Õ' :
			case 'Ö' :
			case 'ò' :
			case 'ó' :
			case 'ô' :
			case 'õ' :
			case 'ö' :
				return 'o';
			case 'Ù' :
			case 'Ú' :
			case 'Û' :
			case 'Ü' :
			case 'ù' :
			case 'ú' :
			case 'û' :
			case 'ü' :
				return 'u';
			case 'ß' :
				return 'b';
			case 'ÿ' :
			case 'Ÿ' :
				return 'y';
			default :
				return Character.toLowerCase(var0);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-21851942")
	public static void method5194() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1529183895")
	static final void method5196(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class19.clientPreferences.method2258()) {
			if (class19.clientPreferences.method2258() == 0 && Client.currentTrackGroupId != -1) {
				AttackOption.method2410(class121.archive6, Client.currentTrackGroupId, 0, var0, false);
				Client.playingJingle = false;
			} else if (var0 == 0) {
				ReflectionCheck.method579();
				Client.playingJingle = false;
			} else {
				Decimator.method1005(var0);
			}
			class19.clientPreferences.method2297(var0);
		}
	}
}