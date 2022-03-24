import java.io.IOException;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("nw")
	@ObfuscatedSignature(descriptor = 
	"Lbp;")

	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lnj;")

	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	750825519)

	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lpd;")

	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lqo;")

	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lpy;")

	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Ljd;")

	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1694781515)

	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("u")
	boolean field1328;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-1137458333)

	int field1326;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	1022499315)

	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"Ljd;")

	ServerPacket field1320;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Ljd;")

	ServerPacket field1329;
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"Ljd;")

	ServerPacket field1331;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1328 = true;
		this.field1326 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"1")

	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1824965765")

	@Export("flush")
	final void flush() throws IOException {
		if ((this.socket != null) && (this.bufferSize > 0)) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = ((PacketBufferNode) (this.packetBufferNodes.last()));
				if ((var1 == null) || (var1.index > (this.buffer.array.length - this.buffer.offset))) {
					this.socket.write(this.buffer.array, 0, this.buffer.offset);
					this.pendingWrites = 0;
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index);
				this.bufferSize -= var1.index;
				var1.remove();
				var1.packetBuffer.releaseArray();
				var1.release();
			} 
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Ljt;B)V", garbageValue = 
	"121")

	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Lnj;B)V", garbageValue = 
	"33")

	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-2133508090")

	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"0")

	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(B)Lnj;", garbageValue = 
	"2")

	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([BZI)Ljava/lang/Object;", garbageValue = 
	"1183406666")

	public static Object method2511(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-801712084")

	public static void method2485() {
		WorldMapElement.WorldMapElement_cachedSprites.clear();
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"1")

	static void method2489() {
		Client.mouseLastLastPressedTimeMillis = -1L;
		BuddyRankComparator.mouseRecorder.index = 0;
		Varps.hasFocus = true;
		Client.hadFocus = true;
		Client.field718 = -1L;
		class33.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1320 = null;
		Client.packetWriter.field1329 = null;
		Client.packetWriter.field1331 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1326 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.hintArrowType = 0;
		class268.method5228();
		ItemComposition.method3764(0);
		NetCache.method5988();
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		Client.soundEffectCount = 0;
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		class340.field4109 = null;
		Client.minimapState = 0;
		Client.field721 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.npcCount = 0;
		Players.Players_count = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Players.field1289[var0] = null;
			Players.field1285[var0] = class193.field2193;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		for (var0 = 0; var0 < 32768; ++var0) {
			Client.npcs[var0] = null;
		}

		Client.combatTargetPlayerIndex = -1;
		Client.projectiles.clear();
		Client.graphicsObjects.clear();

		for (var0 = 0; var0 < 4; ++var0) {
			for (int var4 = 0; var4 < 104; ++var4) {
				for (int var2 = 0; var2 < 104; ++var2) {
					Client.groundItems[var0][var4][var2] = null;
				}
			}
		}

		Client.pendingSpawns = new NodeDeque();
		class155.friendSystem.clear();

		for (var0 = 0; var0 < VarpDefinition.VarpDefinition_fileCount; ++var0) {
			VarpDefinition var1 = SoundCache.VarpDefinition_get(var0);
			if (var1 != null) {
				Varps.Varps_temp[var0] = 0;
				Varps.Varps_main[var0] = 0;
			}
		}

		JagexCache.varcs.clearTransient();
		Client.followerIndex = -1;
		if (Client.rootInterface != (-1)) {
			WorldMapID.method5000(Client.rootInterface);
		}

		for (InterfaceParent var3 = ((InterfaceParent) (Client.interfaceParents.first())); var3 != null; var3 = ((InterfaceParent) (Client.interfaceParents.next()))) {
			class20.closeInterface(var3, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		class268.method5228();
		Client.playerAppearance.update(((int[]) (null)), new int[]{ 0, 0, 0, 0, 0 }, false, -1);

		for (var0 = 0; var0 < 8; ++var0) {
			Client.playerMenuActions[var0] = null;
			Client.playerOptionsPriorities[var0] = false;
		}

		ItemContainer.itemContainers = new NodeHashTable(32);
		Client.isLoading = true;

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field564[var0] = true;
		}

		class17.method228();
		class230.friendsChat = null;
		class134.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, ((Object) (null)));
		class83.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, ((Object) (null)));

		for (var0 = 0; var0 < 8; ++var0) {
			Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
		}

		ReflectionCheck.grandExchangeEvents = null;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;B)Z", garbageValue = 
	"27")

	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = WorldMapAreaData.method5086(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var2 != var3) {
					return false;
				}
			}

			return true;
		}
	}
}