import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bo")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -2094517607)
	@Export("id")
	int id;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -140486865)
	@Export("type")
	int type;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1181845419)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1335219741)
	@Export("plane")
	int plane;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1839332185)
	@Export("x")
	int x;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 38712731)
	@Export("y")
	int y;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lgh;")
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -1728628647)
	@Export("frame")
	int frame;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1660744645)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(descriptor = "(IIIIIIIZLgq;)V")
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5;
		this.y = var6;
		if (var7 != -1) {
			this.sequenceDefinition = ByteArrayPool.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.field2181 == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = ((DynamicObject) (var9));
				if (this.sequenceDefinition == var10.sequenceDefinition) {
					this.frame = var10.frame;
					this.cycleStart = var10.cycleStart;
					return;
				}
			}
			if (var8 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = ((int) (Math.random() * ((double) (this.sequenceDefinition.frameIds.length))));
					this.cycleStart -= ((int) (Math.random() * ((double) (this.sequenceDefinition.frameLengths[this.frame]))));
				} else {
					this.frame = ((int) (Math.random() * ((double) (this.sequenceDefinition.method3729()))));
				}
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)Lhp;", garbageValue = "4")
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
				var1 = 100;
			}
			if (this.sequenceDefinition.isCachedModelIdSet()) {
				var2 = this.sequenceDefinition.method3729();
				this.frame += var1;
				var1 = 0;
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
					if (this.frame < 0 || this.frame > var2) {
						this.sequenceDefinition = null;
					}
				}
			} else {
				label80 : {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
								break label80;
							}
							var1 -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while (this.frame < this.sequenceDefinition.frameIds.length );
						this.frame -= this.sequenceDefinition.frameCount;
					} while (this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length );
					this.sequenceDefinition = null;
				}
			}
			this.cycleStart = Client.cycle - var1;
		}
		ObjectComposition var12 = FileSystem.getObjectDefinition(this.id);
		if (var12.transforms != null) {
			var12 = var12.transform();
		}
		if (var12 == null) {
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var12.sizeX;
				var3 = var12.sizeY;
			} else {
				var2 = var12.sizeY;
				var3 = var12.sizeX;
			}
			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = Tiles.Tiles_heights[this.plane];
			int var9 = var8[var4][var7] + var8[var4][var6] + var8[var5][var6] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;", garbageValue = "-1660311016")
	public static String method1949(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;
			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}
			StringBuilder var8 = new StringBuilder(var4);
			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}
			return var8.toString();
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "-1905507981")
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class128.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			SceneTilePaint.runScriptEvent(var5);
		}
		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		class282.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class149.selectedSpellFlags = var2;
		class125.invalidateWidget(var4);
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "93")
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class19.friendsChat != null) {
			PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-226908688")
	static final void method1954(int var0, int var1) {
		ClanChannel var2 = (var0 >= 0) ? Client.currentClanChannels[var0] : NetCache.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3046()) {
			ClanChannelMember var3 = ((ClanChannelMember) (var2.members.get(var1)));
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2984, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + class309.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}