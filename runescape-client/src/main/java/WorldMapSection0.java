import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hb")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2011554143
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 309558157
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1540942291
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -953018443
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 577153157
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 730646287
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1112749595
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2105424955
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -456023641
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -289937175
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 116483813
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1687564915
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2147280091
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1953399113
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "1697283195"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) { // L: 26
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX; // L: 27
		}

		if (var1.regionLowY > this.newY) { // L: 28
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) { // L: 29
			var1.regionHighY = this.newY;
		}

	} // L: 30

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-24"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) { // L: 34
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 37
		} else {
			return false; // L: 35
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-428509434"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 42
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-81"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 47
			return null; // L: 48
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)}; // L: 50 51 52
			return var4; // L: 53
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)Lkz;",
		garbageValue = "244140613"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null; // L: 59
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "53690591"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte(); // L: 71
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 75
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte(); // L: 77
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte(); // L: 80
		this.newChunkYHigh = var1.readUnsignedByte(); // L: 81
		this.postRead(); // L: 82
	} // L: 83

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-173451568"
	)
	@Export("postRead")
	void postRead() {
	} // L: 85

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "-34922464"
	)
	static int method5068(int var0, Script var1, boolean var2) {
		Widget var3 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1300
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1301
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1302
			return 1; // L: 1303
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1305
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1306
			return 1; // L: 1307
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1309
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1310
			return 1; // L: 1311
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1313
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1314
			return 1; // L: 1315
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1317
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1318
			return 1; // L: 1319
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1321
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1322
			return 1; // L: 1323
		} else {
			return 2; // L: 1325
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lfr;III)Lad;",
		garbageValue = "754876503"
	)
	public static final PcmPlayer method5064(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field307 == 0) { // L: 56
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 57
			if (var2 < 256) { // L: 58
				var2 = 256;
			}

			try {
				PcmPlayer var3 = WorldMapLabel.pcmPlayerProvider.player(); // L: 60
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 61
				var3.field296 = var2; // L: 62
				var3.init(); // L: 63
				var3.capacity = (var2 & -1024) + 1024; // L: 64
				if (var3.capacity > 16384) { // L: 65
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 66
				if (PcmPlayer.field289 > 0 && Decimator.soundSystem == null) { // L: 67
					Decimator.soundSystem = new SoundSystem(); // L: 68
					class342.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 69
					class342.soundSystemExecutor.scheduleAtFixedRate(Decimator.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 70
				}

				if (Decimator.soundSystem != null) { // L: 72
					if (Decimator.soundSystem.players[var1] != null) { // L: 73
						throw new IllegalArgumentException();
					}

					Decimator.soundSystem.players[var1] = var3; // L: 74
				}

				return var3; // L: 76
			} catch (Throwable var4) { // L: 78
				return new PcmPlayer(); // L: 79
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "933121687"
	)
	static final void method5070(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : MusicPatchPcmStream.guestClanChannel; // L: 11976
		if (var2 != null && var1 >= 0 && var1 < var2.method3265()) { // L: 11977
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 11978
			if (var3.rank == -1) { // L: 11979
				String var4 = var3.username.getName(); // L: 11980
				PacketBufferNode var5 = class120.getPacketBufferNode(ClientPacket.field3025, Client.packetWriter.isaacCipher); // L: 11981
				var5.packetBuffer.writeByte(3 + class357.stringCp1252NullTerminatedByteSize(var4)); // L: 11982
				var5.packetBuffer.writeByte(var0); // L: 11983
				var5.packetBuffer.writeShort(var1); // L: 11984
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 11985
				Client.packetWriter.addNode(var5); // L: 11986
			}
		}
	} // L: 11987
}
