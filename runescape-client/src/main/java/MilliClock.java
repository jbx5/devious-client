import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("ac")
	long[] field2407;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1085613311
	)
	int field2401;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -942864311
	)
	int field2403;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 2021572333076501213L
	)
	long field2402;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -76961179
	)
	int field2404;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1838318811
	)
	int field2400;

	public MilliClock() {
		this.field2407 = new long[10];
		this.field2401 = 256;
		this.field2403 = 1;
		this.field2404 = 0;
		this.field2402 = WorldMapElement.method3843();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2407[var1] = this.field2402;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2407[var1] = 0L;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "497587420"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2401;
		int var4 = this.field2403;
		this.field2401 = 300;
		this.field2403 = 1;
		this.field2402 = WorldMapElement.method3843();
		if (0L == this.field2407[this.field2400]) {
			this.field2401 = var3;
			this.field2403 = var4;
		} else if (this.field2402 > this.field2407[this.field2400]) {
			this.field2401 = (int)((long)(var1 * 2560) / (this.field2402 - this.field2407[this.field2400]));
		}

		if (this.field2401 < 25) {
			this.field2401 = 25;
		}

		if (this.field2401 > 256) {
			this.field2401 = 256;
			this.field2403 = (int)((long)var1 - (this.field2402 - this.field2407[this.field2400]) / 10L);
		}

		if (this.field2403 > var1) {
			this.field2403 = var1;
		}

		this.field2407[this.field2400] = this.field2402;
		this.field2400 = (this.field2400 + 1) % 10;
		int var5;
		if (this.field2403 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field2407[var5]) {
					this.field2407[var5] += (long)this.field2403;
				}
			}
		}

		if (this.field2403 < var2) {
			this.field2403 = var2;
		}

		FileSystem.method4499((long)this.field2403);

		for (var5 = 0; this.field2404 < 256; this.field2404 += this.field2401) {
			++var5;
		}

		this.field2404 &= 255;
		return var5;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Lny;IIB)V",
		garbageValue = "-108"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !Varcs.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method7244(TaskHandler.widgetDefinition, true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var5 * var7 + var4 * var8 >> 11;
					int var10 = var5 * var8 - var7 * var4 >> 11;
					int var11 = ClanSettings.entity.getX() + var9 >> 7;
					int var12 = ClanSettings.entity.getY() - var10 >> 7;
					PacketBufferNode var13 = class141.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeShort(var12 + ClientPreferences.topLevelWorldView.baseY);
					var13.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
					var13.packetBuffer.writeShortAdd(var11 + ClientPreferences.topLevelWorldView.baseX);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(AddRequestTask.localPlayer.x);
					var13.packetBuffer.writeShort(AddRequestTask.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}
