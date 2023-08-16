import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1913648071
	)
	static int field1424;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1761871959
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -218156893
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("aa")
	boolean field1432;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 807217953
	)
	int field1435;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1043697015
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	ServerPacket field1430;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	ServerPacket field1436;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	ServerPacket field1437;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque();
		this.bufferSize = 0;
		this.buffer = new Buffer(5000);
		this.packetBuffer = new PacketBuffer(40000);
		this.serverPacket = null;
		this.serverPacketLength = 0;
		this.field1432 = true;
		this.field1435 = 0;
		this.pendingWrites = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1375263214"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear();
		this.bufferSize = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-55"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) {
			this.buffer.offset = 0;

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last();
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "17"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1);
		var1.index = var1.packetBuffer.offset;
		var1.packetBuffer.offset = 0;
		this.bufferSize += var1.index;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)V",
		garbageValue = "-68"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "272973129"
	)
	@Export("close")
	void close() {
		if (this.socket != null) {
			this.socket.close();
			this.socket = null;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1646741588"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "-972291242"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "899578863"
	)
	static int method2801(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return Frames.method4719(var0, var1, var2);
		} else if (var0 < 1100) {
			return SecureRandomFuture.method2162(var0, var1, var2);
		} else if (var0 < 1200) {
			return class93.method2358(var0, var1, var2);
		} else if (var0 < 1300) {
			return InterfaceParent.method2277(var0, var1, var2);
		} else if (var0 < 1400) {
			return class12.method151(var0, var1, var2);
		} else if (var0 < 1500) {
			return class169.method3363(var0, var1, var2);
		} else if (var0 < 1600) {
			return class132.method3045(var0, var1, var2);
		} else if (var0 < 1700) {
			return WorldMapRectangle.method5479(var0, var1, var2);
		} else if (var0 < 1800) {
			return DynamicObject.method2186(var0, var1, var2);
		} else if (var0 < 1900) {
			return SecureRandomFuture.method2166(var0, var1, var2);
		} else if (var0 < 2000) {
			return class499.method8897(var0, var1, var2);
		} else if (var0 < 2100) {
			return SecureRandomFuture.method2162(var0, var1, var2);
		} else if (var0 < 2200) {
			return class93.method2358(var0, var1, var2);
		} else if (var0 < 2300) {
			return InterfaceParent.method2277(var0, var1, var2);
		} else if (var0 < 2400) {
			return class12.method151(var0, var1, var2);
		} else if (var0 < 2500) {
			return class169.method3363(var0, var1, var2);
		} else if (var0 < 2600) {
			return MenuAction.method2084(var0, var1, var2);
		} else if (var0 < 2700) {
			return ByteArrayPool.method7681(var0, var1, var2);
		} else if (var0 < 2800) {
			return class326.method6059(var0, var1, var2);
		} else if (var0 < 2900) {
			return Player.method2354(var0, var1, var2);
		} else if (var0 < 3000) {
			return class499.method8897(var0, var1, var2);
		} else if (var0 < 3200) {
			return class466.method8373(var0, var1, var2);
		} else if (var0 < 3300) {
			return WorldMapSection1.method5524(var0, var1, var2);
		} else if (var0 < 3400) {
			return class372.method6930(var0, var1, var2);
		} else if (var0 < 3500) {
			return UserList.method7990(var0, var1, var2);
		} else if (var0 < 3600) {
			return class238.method4766(var0, var1, var2);
		} else if (var0 < 3700) {
			return class16.method206(var0, var1, var2);
		} else if (var0 < 3800) {
			return class31.method461(var0, var1, var2);
		} else if (var0 < 3900) {
			return ObjectSound.method1930(var0, var1, var2);
		} else if (var0 < 4000) {
			return GameBuild.method6608(var0, var1, var2);
		} else if (var0 < 4100) {
			return class352.method6623(var0, var1, var2);
		} else if (var0 < 4200) {
			return Decimator.method1133(var0, var1, var2);
		} else if (var0 < 4300) {
			return AttackOption.method2672(var0, var1, var2);
		} else if (var0 < 5100) {
			return ArchiveDiskActionHandler.method6645(var0, var1, var2);
		} else if (var0 < 5400) {
			return class161.method3288(var0, var1, var2);
		} else if (var0 < 5600) {
			return class466.method8376(var0, var1, var2);
		} else if (var0 < 5700) {
			return Interpreter.method2067(var0, var1, var2);
		} else if (var0 < 6300) {
			return class448.method8160(var0, var1, var2);
		} else if (var0 < 6600) {
			return class139.method3084(var0, var1, var2);
		} else if (var0 < 6700) {
			return Interpreter.method2068(var0, var1, var2);
		} else if (var0 < 6800) {
			return class101.method2642(var0, var1, var2);
		} else if (var0 < 6900) {
			return PlayerCompositionColorTextureOverride.method3546(var0, var1, var2);
		} else if (var0 < 7000) {
			return class53.method1098(var0, var1, var2);
		} else if (var0 < 7100) {
			return class6.method38(var0, var1, var2);
		} else if (var0 < 7200) {
			return Messages.method2771(var0, var1, var2);
		} else if (var0 < 7300) {
			return class170.method3441(var0, var1, var2);
		} else if (var0 < 7500) {
			return InterfaceParent.method2276(var0, var1, var2);
		} else if (var0 < 7600) {
			return SoundCache.method884(var0, var1, var2);
		} else if (var0 < 7700) {
			return class178.method3504(var0, var1, var2);
		} else {
			return var0 < 8100 ? class218.method4244(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "49"
	)
	public static void method2806(int var0, int var1, int var2, int var3) {
		if (class305.musicSongs.size() > 1 && class305.musicSongs.get(0) != null && ((MusicSong)class305.musicSongs.get(0)).midiPcmStream.isReady() && class305.musicSongs.get(1) != null && ((MusicSong)class305.musicSongs.get(1)).midiPcmStream.isReady()) {
			class270.method5491(var0, var1, var2, var3);
			class305.field3406.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class305.field3401), class305.field3410));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class305.field3409), class305.musicPlayerStatus));
			class305.field3406.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class305.field3405.get(0) != null && class305.field3405.get(1) != null) {
				MusicSong var5 = (MusicSong)class305.field3405.get(0);
				class305.field3405.set(0, class305.musicSongs.get(1));
				class305.field3405.set(1, var5);
			}
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-581625069"
	)
	protected static final void method2798() {
		class332.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		GameEngine.gameCyclesToDo = 0;
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Ldv;I)V",
		garbageValue = "-932722306"
	)
	static final void method2805(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = class130.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = class130.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = class130.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = class130.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) {
			int var6 = class130.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = InvDefinition.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1186 = var4;
		var0.field1185 = var5;
	}
}
