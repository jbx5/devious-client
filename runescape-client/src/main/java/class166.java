import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public abstract class class166 {
	@ObfuscatedName("g")
	String field1800;

	@ObfuscatedSignature(descriptor = 
	"Lef;")

	final class155 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lef;Ljava/lang/String;)V")

	class166(class155 var1, String var2) {
		this.this$0 = var1;
		this.field1800 = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"695673663")

	public abstract int vmethod3297();

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"1251344393")

	public String vmethod3296() {
		return null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-2036911205")

	public int vmethod3299() {
		return -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"-188699154")

	public String method3295() {
		return this.field1800;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Llq;B)V", garbageValue = 
	"-2")

	public static void method3310(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)[I", garbageValue = 
	"536525986")

	public static int[] method3311() {
		int[] var0 = new int[KeyHandler.field134];

		for (int var1 = 0; var1 < KeyHandler.field134; ++var1) {
			var0[var1] = KeyHandler.field133[var1];
		}

		return var0;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(descriptor = 
	"(Lcw;ZB)V", garbageValue = 
	"-64")

	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (((var0 != null) && var0.isVisible()) && (!var0.isHidden)) {
			var0.isUnanimated = false;
			if ((((Client.isLowDetail && (Players.Players_count > 50)) || (Players.Players_count > 200)) && var1) && (var0.movementSequence == var0.idleSequence)) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if ((((var2 >= 0) && (var2 < 104)) && (var3 >= 0)) && (var3 < 104)) {
				long var4 = MilliClock.calculateTag(0, 0, 0, false, var0.index);
				if (((var0.model0 != null) && (Client.cycle >= var0.animationCycleStart)) && (Client.cycle < var0.animationCycleEnd)) {
					var0.isUnanimated = false;
					var0.tileHeight = Archive.getTileHeight(var0.x, var0.y, class160.Client_plane);
					var0.playerCycle = Client.cycle;
					FriendSystem.scene.addNullableObject(class160.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
				} else {
					if (((var0.x & 127) == 64) && ((var0.y & 127) == 64)) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = Archive.getTileHeight(var0.x, var0.y, class160.Client_plane);
					var0.playerCycle = Client.cycle;
					FriendSystem.scene.drawEntity(class160.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}
}