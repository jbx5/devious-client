import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.IOException;
import net.runelite.mapping.Export;
@ObfuscatedName("bi")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1079051883)
	@Export("canvasWidth")
	public static int canvasWidth;

	@ObfuscatedName("v")
	String field967;

	@ObfuscatedName("q")
	@Export("opcodes")
	int[] opcodes;

	@ObfuscatedName("f")
	@Export("intOperands")
	int[] intOperands;

	@ObfuscatedName("j")
	@Export("stringOperands")
	String[] stringOperands;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 762574265)
	@Export("localIntCount")
	int localIntCount;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1282940193)
	@Export("localStringCount")
	int localStringCount;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1341494055)
	@Export("intArgumentCount")
	int intArgumentCount;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 2092128287)
	@Export("stringArgumentCount")
	int stringArgumentCount;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "[Lpb;")
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(II)[Lpb;", garbageValue = "-1127899828")
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(descriptor = "(Lcj;B)V", garbageValue = "3")
	static final void method1977(Actor var0) {
		if (var0.field1129 != 0) {
			if (var0.targetIndex != -1) {
				Object var1 = null;
				if (var0.targetIndex < 32768) {
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var1 = Client.players[var0.targetIndex - 32768];
				}
				if (var1 != null) {
					int var2 = var0.x - ((Actor) (var1)).x;
					int var3 = var0.y - ((Actor) (var1)).y;
					if (var2 != 0 || var3 != 0) {
						var0.orientation = ((int) (Math.atan2(((double) (var2)), ((double) (var3))) * 325.949)) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}
			if (var0.field1165 != -1 && (var0.pathLength == 0 || var0.field1202 > 0)) {
				var0.orientation = var0.field1165;
				var0.field1165 = -1;
			}
			int var4 = var0.orientation - var0.rotation & 2047;
			if (var4 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}
			if (var4 != 0) {
				++var0.field1196;
				boolean var6;
				if (var4 > 1024) {
					var0.rotation -= (var0.field1161) ? var4 : var0.field1129 * 124924459 * 881523843;
					var6 = true;
					if (var4 < var0.field1129 || var4 > 2048 - var0.field1129) {
						var0.rotation = var0.orientation;
						var6 = false;
					}
					if (!var0.field1161 && var0.idleSequence == var0.movementSequence && (var0.field1196 > 25 || var6)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += (var0.field1161) ? var4 : 124924459 * var0.field1129 * 881523843;
					var6 = true;
					if (var4 < var0.field1129 || var4 > 2048 - var0.field1129) {
						var0.rotation = var0.orientation;
						var6 = false;
					}
					if (!var0.field1161 && var0.movementSequence == var0.idleSequence && (var0.field1196 > 25 || var6)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}
				var0.rotation &= 2047;
				var0.field1161 = false;
			} else {
				var0.field1196 = 0;
			}
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "302270289")
	static final void method1978(boolean var0) {
		Renderable.playPcmPlayers();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = EnumComposition.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);
				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}
		}
	}
}